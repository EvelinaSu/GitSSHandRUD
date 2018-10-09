package com.company.crud;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileCRUD {

    public void createFile() {
        System.out.println ("ivesk failo pavadinima");
        Scanner sc = new Scanner ( System.in );
        String fileName = sc.nextLine ();
        System.out.println ( "Ivestas failo pavadinimas: " +fileName+ "\u263A" );

        File file = new File ( fileName );
        if (file.exists ())
            System.out.println ( "Toks failas egzistuoja" );
        else {
            System.out.println ( "Toks failas neegzistuoja");
            System.out.println ( "Ar toki faila sukurti?");
            System.out.println ("Y.n");
            String arSukurti = sc.nextLine ();
            if (arSukurti.toLowerCase ().equals ( ( "y" ) )) {
                try {
                    file.createNewFile ();
                    System.out.println ("Failas sukurtas sekmingai");
                } catch (IOException e) {
                    e.printStackTrace ();
                    System.out.println ( "sum ting wong");
                }
            }
        };
    }
}
