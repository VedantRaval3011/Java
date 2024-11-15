package ReverseANumber;

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // num = 123 => 321
        //num%10 = 123%10 = 3
        String str = "";
        

        while(num!=0){
            int last_pic = num%10;
            str= str+ Integer.toString(last_pic);
            num/=10;
        }

        System.out.println(str);
    }
}
