package com.company.crud;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCRUD {

    private String fileName;

    public void createFile() {

        Scanner sc = new Scanner ( System.in );

        File file = new File ( fileName );
        if (file.exists ())
            System.out.println ( "Toks failas egzistuoja" );
        else {
            System.out.println ( "Toks failas neegzistuoja" );
            System.out.println ( "Ar toki faila sukurti?" );
            System.out.println ( "Y.n" );
            String arSukurti = sc.nextLine ();
            if (arSukurti.toLowerCase ().equals ( ( "y" ) )) {
                try {
                    file.createNewFile ();
                    System.out.println ( "Failas sukurtas sekmingai" );
                } catch (IOException e) {
                    e.printStackTrace ();
                    System.out.println ( "sum ting wong" );
                }
            }
        }
        ;
    }

    public void updateFile() {
        Scanner sc = new Scanner ( System.in );
        File file = new File ( fileName );

        if (file.exists ()) {
            System.out.println ( "Toks failas yra" );
            System.out.println ( "iveskite teksta ir spauskite enter" );
            System.out.println ( "ivedus zodi pabaiga, saugojimas bus baigtas" );

            try {
                FileWriter writer = new FileWriter ( file, true );
                String eilute;
                do {
                    eilute = sc.nextLine ();

                    if (!eilute.toLowerCase ().equals ( "pabaiga" )) {
                        writer.write ( eilute + "\n" );
                    }

                } while (!eilute.toLowerCase ().equals ( "pabaiga" ));
                writer.close ();

            } catch (IOException e) {
                e.printStackTrace ();
            }
        }

    }

    public void readFile() {

        File file = new File ( fileName );

        if (file.exists ()) {

            try {
                Scanner fileScanner = new Scanner ( file );
                while (fileScanner.hasNext ()) {
                    System.out.println ( fileScanner.nextLine () );
                }
                fileScanner.close ();
            } catch (FileNotFoundException e) {
                e.printStackTrace ();
            }


        }
    }

    public void deleteFile() {
        Scanner sc = new Scanner ( System.in );
        File file = new File ( fileName );
        if (file.exists ()) {
            System.out.println ( "toks failas yra, ar tikrai norite trinti? y/n" );
            String pasirinkimas = sc.nextLine ();
            if (pasirinkimas.toLowerCase ().equals ( "y" )) {
                file.delete ();
                System.out.println ( "Failas sekmingai istirntas" );
            }
        }
    }

    public void requestFileName() {
        System.out.println ( "Iveskite failo pavadinima" );
        Scanner sc = new Scanner ( System.in );
        fileName = sc.nextLine();

    }
}


