import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        boolean isPalindrome = true;
        int len = A.length();

        for (int i = 0; i < len / 2; i++) {
            if (A.charAt(i) != A.charAt(len - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    }




