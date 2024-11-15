package Anagram;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        if(isAnagram(str1,str2)){
            System.out.println(str1 + " and " + str2+ " are Anagrams");
        }else{
            System.out.println(str1 + " and " + str2+ " are not Anagrams");
        }
        
    }

    public static Boolean isAnagram(String str1, String str2){
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean status = Arrays.equals(arr1, arr2);
        return status;
    }
}
