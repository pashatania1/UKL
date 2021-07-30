/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pashatania
 */
public class No3 {
    public static void main(String[] args) {
        int a = 16;
        int b = 5;
        int u = a; //16+5+5+5+5+5
        int s = u;
        
        System.out.println("Deret Aritmatika :");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j <= i; j++) {
            System.out.print(u + "\t");
            u = u + b;
            s = s + u;
        }
            System.out.println();
        }
        s = s - u;
        System.out.println();
        System.out.println("Jumlah Deret Aritmatika : " + s);
    }
}
