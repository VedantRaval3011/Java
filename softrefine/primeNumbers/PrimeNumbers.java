package primeNumbers;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        for(int i = 2 ; i< n;i++){
           if(isPrime(i)){
            System.out.println(i);
           }
        }
    }

    public static Boolean isPrime(int num){
        if(num<=1) return false;

        for(int i = 2 ; i< Math.sqrt(num);i++){
            if(num%i==0) return false;
        }
        return true;
    }
}
