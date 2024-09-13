package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(656));
        System.out.println(isPerfectNumber(32));
    }

    public static boolean isPalindrome(int n) {
        int reverseN = 0;
        int originalN = n;
        while (n != 0) {
            reverseN = reverseN * 10 + n % 10;
            n /= 10;
        }
        if (originalN == reverseN) {
            return true;
        }
        else {return false;}
    }
    public static boolean isPerfectNumber(int x) {
        if (x <= 0) {
            return false;
        }
        int sum = 1;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                sum += i;
            }

        }if (sum == x) {
            return true;
        }
        else {return false;}
        }
    }

