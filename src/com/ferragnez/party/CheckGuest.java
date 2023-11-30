package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        System.out.println("Salve mi può indicare il suo nome? Controllo se è in lista.");
        String usersname = scan.nextLine();

        boolean nameinlist = false;
        for (int i = 0; i <invitati.length && !nameinlist ; i++) {
            if (usersname.equals(invitati[i])) {
                nameinlist = true;
            }
        }
            if(!nameinlist){
                    System.out.println("Il suo nome non è sulla lista, è pregato di andarsene.");
                }
            else{
                System.out.println("Il suo nome è in lista, entri pure!");
            }
        scan.close();
        }
    }

