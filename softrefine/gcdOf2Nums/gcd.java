package gcdOf2Nums;

import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(findGcd(n, m));
    }

    public static int findGcd (int n, int m){
        // int res = Math.min(n, m);
        // while (res>0) {
        //     if(n%res == 0 && m%res==0) break;
        //     res--;
        // }

        // return res;
        if(m==0) return n;
        if(n==0) return m;

        if(m == n) return n;

        if(n>m) return findGcd(n-m,m);
        else return findGcd(n, m-n);

    }
}
