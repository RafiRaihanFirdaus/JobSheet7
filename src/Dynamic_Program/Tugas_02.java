/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dynamic_Program;
import java.util.Scanner;
public class Tugas_02 {
    public static void main(String[] args) {
        
        String Identitas  = "Rafi Raihan F / X RPL 2 / 26";
        System.out.println("Identitas: " + Identitas);
        
        int [] berat = {7, 5, 4, 3, 2,};
        int [] bayaran  = {10000, 7000, 5000, 3000, 2000};
        Scanner scan = new Scanner(System.in);
        System.out.print("Jumlah berat: ");
        int total = scan.nextInt();
        
        for (int i = 0; i < berat.length; i++) {
            int jumlah = total / berat[i];
            total = total - (berat[i]*jumlah);
            
            System.out.println("jumlah" + berat[i] + "=" + jumlah);
        }
    }
    
}
