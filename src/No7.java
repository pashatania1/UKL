/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pashatania
 */
public class No7 {
    public static void main(String[] args) {
        int a[][] = {{6, 3, 2, 4, 2, 3}, {1, 3, 2, 8, 9, 3}, {6, 7, 8, 4, 2, 3}, {4, 3, 8, 4, 2, 9}};
        int b[][] = {{1, 2, 3, 1}, {6, 2, 3, 9}, {5, 7, 3, 1}, {2, 8, 3, 7}, {1, 2, 3, 4}, {5, 2, 3, 6}};
        int h[][] = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        
        System.out.println("Hasil AXB :");
        //perkalian
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                for(int k = 0; k < 6; k++) {
                    h[i][j] = h[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        //menampilkan hasil
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 4; j++) {
                System.out.print(h[i][j] + " \t");
            }
            System.out.println();
        }
    }
}
