/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119045.latihan35.program.tunjangan;
import java.util.Scanner;

/**
 *
 * @author Legion
 */
public class PBOIF210119045Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Gaji gaji = new Gaji ();
        Scanner keyboard = new Scanner (System.in);
        
        System.out.println("====== Program Tunjangan ======");
        System.out.print("Berapa gaji pokok anda perbulan?: ");
        gaji.gaji = keyboard.nextDouble();
        System.out.print("Status anda ? (Menikah/Belum): ");
        gaji.status = keyboard.next();
        
        System.out.println();
        System.out.println("===== Hasil Perhitungan Gaji Anda =====");
        System.out.println("Gaji Pokok\t: " + gaji.gaji);
        System.out.println("Tunjangan\t: " + gaji.hitungTunjangan());
        System.out.println("Gaji Total\t: " + gaji.hitungTotalGaji());
        System.out.println("-----------------------------");
        System.out.println("Developed bye : Fahma Maulana");
                
    }
    
}
