/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contohinterface;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //membuat objek hp
        Phone RedmiJ2Prime = new Xioami();

        //membuat objek user
        PhoneUser pascol = new PhoneUser(RedmiJ2Prime);

        //nyalakan hp dahulu
        pascol.turnOnThePhone();

        Scanner input = new Scanner(System.in);
        String aksi;

        while (true) {
            System.out.println("!!!!PERCOBAAN INTERFACE!!!!");
            System.out.println("[1] Nyalakan HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Perbesar volume");
            System.out.println("[4] Perkecil volume");
            System.out.println("[0] Keluar");
            System.out.println("===================");
            System.out.println("Pilih aksi : .....");
            aksi = input.nextLine();

            if(aksi.equalsIgnoreCase("1")){
                pascol.turnOnThePhone();
            } else if (aksi.equalsIgnoreCase("2")){
                pascol.turnOffThePhone();
        } else if (aksi.equalsIgnoreCase("3")){
            pascol.makePhoneLouder();
        } else if (aksi.equalsIgnoreCase("4")){
            pascol.makePhoneSilence();
        } else if(aksi.equalsIgnoreCase("0")){
            System.exit(0);
        } else {
                System.out.println("Kamu memilih aksi yang salah");
        }



        }
    }
}

