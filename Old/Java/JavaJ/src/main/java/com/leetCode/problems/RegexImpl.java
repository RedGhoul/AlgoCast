package com.leetCode.problems;

public class RegexImpl {
    public static void main(String[] args){
        isMatch("","a*");
    }
    public static boolean isMatch(String text, String pattern) {
        /*
        * 1) This is our base case. If we have gone through our pattern and
        * still have text left then we return false. We could not match the pattern to the string.
        * However ONLY when both pattern and test is empty do we say that we have matched them.
        *
        * The reason that we can't switch text.isEmpty with pattern.isEmpty is because
        * we could have situations where pattern could be empty and text could be full.
        * I which case we would get an error when we tried to acces different parts of it.
        * the recur in isMatch(text, pattern.substring(2)) would get you back to this point and
        * return false;
        *
        * Where as the other way around you die at 2)
        * */
        if (pattern.isEmpty()) return text.isEmpty();

        /*
         * 2) Then we check for the simplest thing. Either the letter matchs exactly
         * or the pattern letter is a "."
         * */
        boolean first_match = (!text.isEmpty() &&
                (pattern.charAt(0) == text.charAt(0) || pattern.charAt(0) == '.'));

        /*
         * 3) Is my pattern still greater then 2 ? and is the next char in the pattern equal to a "*" ?
         * We care about the pattern length since that is how we are moving through it. Ie making
         * using up chunks of it and passing it back into function.
         * We care if the next char is a "*" since that would mean that it would be match. Since the "*"
         * just means matches zero of more of the preceding element.
         * So even if the first_match is false we can move forward, since the "*" makes it so we don't have
         * to match it
         * */
        if (pattern.length() >= 2 && pattern.charAt(1) == '*'){
            return (isMatch(text, pattern.substring(2)) || // now you have to try to apply the rest of pattern
                    // since everything before 2 didn't hold any value.Since the "*" just means matches
                    // zero of more of the preceding element
                    (first_match && isMatch(text.substring(1), pattern))); // this is the case for when you have
                    // the first element matching and a "*" to the right. Since the "*" just means matches
                    // zero of more of the preceding element. We would have to keep taking slices of the text string
                    // to keep seeing if the values in text matches the preceding element
        } else {
            return first_match && isMatch(text.substring(1), pattern.substring(1)); // this is for the basic case
            // of when you have found a match by way of two chars matching, and not want to move onto the rest of
            // problem. And you do that by removing the very first char off of both the pattern and text
        }
    }
}
