package Palindrome;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String str = sc.nextLine();

        if(isPalindrome(str)){
            System.out.println(str + " is a palindrome");
        }else{
            System.out.println(str + " is not a palindrome");

        }
    }

    public static Boolean isPalindrome(String str){
        String revString = "";

        for(int i = str.length()-1 ;i >=0 ;i--){
            revString+=str.charAt(i);
        }

        if(revString.equals(str)){
            return true;
        }

        return false;
        
    }  
}
