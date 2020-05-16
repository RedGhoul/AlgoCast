package com.leetCode.problems;

public class CountPrimes {
    /*
    * Highly math based problem. You have to think about it logically math wise.
    * To go from O(n^2) to O(n).
    *
    * How to use the  Sieve of Eratosthenes Algo
    *
    * */
    public int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        // say that everything is a prime
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        // Loop's ending condition is i * i < n instead of i < sqrt(n)
        // to avoid repeatedly calling an expensive function sqrt().

        // Then try to figure out what is not a prime
        for (int i = 2; i * i < n; i++) {
            if (!isPrime[i]) continue;
            for (int j = i * i; j < n; j += i) {
                isPrime[j] = false;
            }
        }
        // then count the number of primes left
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count++;
        }
        return count;
    }
}
