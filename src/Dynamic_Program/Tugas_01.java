/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dynamic_Program;
import java.util.Scanner;
public class Tugas_01 {
    public static void main(String[] args) {
        int [] nominal = {5000, 2000, 1000, 500, 100};
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Nominal Uang: ");
        int uang = scan.nextInt();
        
        for (int i = 0; i < 5; i++) {
            int jumlah = uang/nominal[i];
            uang = uang - (nominal[i]*jumlah);
            
            System.out.println("Lembar" + nominal[i] + "=" + jumlah);
        }
    }
}
