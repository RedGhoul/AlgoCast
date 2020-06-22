### Sorting Algorithms

- Bubble Sort - N^2 - Easiest
- Selection Sort - N^2 - Easier
- Merge Sort - N*log(N) - Medium

#### Bubble Sort
- Brute force to get the bubbles to the top
- double for loop, shrinking window
1) Go through the array checking if the current element from the left is greater then rest of the 
elements on the right. 
2) Keep repeating till there is 
nothing more to compare against.

#### Selection Sort
- Prove me wrong
- double for loop, doing the work at the end of the 
nested for loop
1) Assume the first element to the left is the smallest
2) Go through the rest of the array looking to see which 
one is actually the samllest element
3) Then at the end, swap what you thought was min, with 
what the actual min is
