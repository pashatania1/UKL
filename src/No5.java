/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pashatania
 */
public class No5 {
    public static void main(String[] args) {
        int a[][] = {{-7, 5, 1, 2, 3}, {7, 4, 3, 0, 7}, {4, 7, 5, 1, 8}, {-7, 5, 1, 2, 3}};
        int b[][] = {{1, 2, 3, 2, 3}, {4, 4, 3, 8, 7}, {8, 9, 4, 1, 8}, {-7, 5, 1, 2, 3}};
        
        System.out.println("Hasil A-B :");
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.print(a[i][j] - b[i][j] + " \t");
            }
            System.out.println();
        }
    }
}
