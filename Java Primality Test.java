import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;



public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        bufferedReader.close();
        BigInteger bigInt = new BigInteger(n);
        boolean isPrime = bigInt.isProbablePrime(10);
        if(isPrime){
        System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    
}
}
