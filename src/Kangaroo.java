package com.magic.square;

import java.util.Scanner;

/**
 * Created by Abror on 28.04.2017.
 */
public class Kangaroo {

    private static void solve(int x1, int v1, int x2, int v2) {
        while(true) {
            if(x1==x2) { System.out.println("YES"); break; }
            else if(v1==v2) { System.out.println("NO");break;}
            else if((v1>v2) && (x1>x2)){System.out.println("NO");break;}
            else if((v2>v1) && (x2>x1)){System.out.println("NO");break;}
            x1=x1+v1;
            x2=x2+v2;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        solve(x1, v1, x2, v2);
    }

}
