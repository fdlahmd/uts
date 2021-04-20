package UTS;

import java.util.Scanner;

public class no_1 {
    public static void printData(int[] data){
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
    }
    public static void shellSort(int[] data){
        int jarak = data.length;
        int c = 0;
        boolean sudah = true;
        while (jarak >= 1){
            jarak = jarak/2;
            sudah = true;
            while (sudah){
                sudah = false;
                for (int j=0; j<data.length-jarak; j++){
                    int i = j+jarak;
                    c++;
                    if (data[j]>data[i]){
                        int temp = data[j];
                        data[j] = data[i];
                        data[i] = temp;
                        sudah = true;
                    }
                }
            }
        }
    }
    public static void binarySearch(int[] data, int key){
        int indexAwal = 0;
        int indexAkhir = data.length-1;
        int middle = 0;
        int found = 0;
        while((indexAwal<=indexAkhir) && (found == 0)){
            middle = (indexAwal+indexAkhir)/2;
            System.out.println("nilai tengah = "+middle);
            if (key == data[middle]){
                System.out.println("nilai "+key+", berada di indeks ke-"+middle);
                found = 1;
            }
            else{
                if (key < data[middle]){
                    System.out.println("<- kiri");
                    indexAkhir = middle-1;
                }
                else{
                    System.out.println("kanan ->");
                    indexAwal = middle+1;
                }
            }
        }
        if (found == 1){
            System.out.println("data telah ditemukan");
        }
        else{
            System.out.println("data tidak ditemukan");
        }
    }
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] nilai = {3,10,4,2,8,13};
        System.out.println("--- sebelum ---");
        printData(nilai);
        shellSort(nilai);
        System.out.println("\n--- sesudah ---");
        printData(nilai);
        
        System.out.println("\nmasukan data yang ingin di cari:");
        int key = input.nextInt();
        
        binarySearch(nilai, key);
        
        System.out.println("\n");
        System.out.println("Fadhil Ahmad Hidayat");
    }
}
