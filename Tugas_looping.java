/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tuna
 */
import java.util.Scanner;
public class Tugas_looping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukkan Nilai = ");
        int input = userInput.nextInt();
        
//        ascending

        System.out.print("\n");
        System.out.println("looping angka");
        //looping angka
        for(int i = 1; i<=input; ++i){
            for (int j = 1; j<=i; ++j){
            System.out.print(j + " ");
        }
            System.out.println(" ");
        }
        //looping bintang
        System.out.print("\n");
        System.out.println("looping bintang");
        for(int i = 1; i<=input; ++i){
            for (int j = 1; j<=i; ++j){
            System.out.print("*" + " ");
        }
            System.out.println(" ");
        }
        
//      descending
        System.out.print("\n");
        System.out.println("looping angka");
        for (int i = 1; i<=input; i++){
        for (int j = input; j>=i; j--){
            System.out.print(j + " ");
        }
            System.out.println(" ");
    }
        System.out.print("\n");
        System.out.println("looping bintang");
        for (int i = 1; i<=input; i++){
        for (int j = input; j>=i; j--){
            System.out.print("*" + " ");
        }
            System.out.println(" ");
    }
    
}
}