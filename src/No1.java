/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pashatania
 */
public class No1 {
    
    public static void main(String[] args) {
        int a = 16;
        int b = 5;
        int nawal = 6;
        int nakhir = 19;
        int u = a + ((nawal - 1) * b); //16+5+5+5+5+5
        int s = u;
        
        System.out.println("Deret Aritmatika :");
        for(int i = nawal; i < nakhir; i++) {
            System.out.println(u);
            u = u + b;
            s = s + u;
        }
        s = s - u;
        System.out.println();
        System.out.println("Jumlah Deret Aritmatika : " + s);
    }
}
