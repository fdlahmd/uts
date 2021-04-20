package UTS;

import java.util.Scanner;

public class no_3 {
    public static void main(String[] args){
        int i, j, baris, kolom;
        int matrix[][] = new int[10][10];
        int transpose[][] = new int[10][10];
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris Matrixs: ");
        baris = scan.nextInt();
        System.out.print("Masukkan jumlah kolom Matrixs: ");
        kolom = scan.nextInt();
        System.out.println("Masukkan elemen Matrixs: ");
        for (i = 0; i < baris; i++){
            for (j = 0; j < kolom; j++){
                matrix[i][j] = scan.nextInt();
            }
        }
        for (i = 0; i < baris; i++){
            for (j = 0; j < kolom; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Hasil Transpose Matrixs : ");
        for (i = 0; i < kolom; i++){
            for (j = 0; j < baris; j++){
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n");
        System.out.println("Fadhil Ahmad Hidayat");
    }
}
