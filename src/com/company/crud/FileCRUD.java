package com.company.crud;

import javax.naming.Name;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCRUD {

    public void createFile() {
        System.out.println ( "ivesk failo pavadinima" );
        Scanner sc = new Scanner ( System.in );
        String fileName = sc.nextLine ();
        System.out.println ( "Ivestas failo pavadinimas: " + fileName + "\u263A" );

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
        System.out.println ( "Iveskite failo pavadinima" );
        Scanner sc = new Scanner ( System.in );
        String failoVardas = sc.nextLine ();
        String pathname;
        File file = new File ( failoVardas );

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

                }while (!eilute.toLowerCase ().equals ( "pabaiga" )) ;
                writer.close ();

            } catch (IOException e) {
                e.printStackTrace ();
            }
        }

    }

    public void readFile(){
        System.out.println ("Iveskite failo pavadinima");
        Scanner sc = new Scanner(System.in);
        String fileName = sc.nextLine();
        String pathname;
        File file = new File(fileName);

        if(file.exists ()){

            try {
                Scanner fileScanner = new Scanner(file);
                while (fileScanner.hasNext ()){
                    System.out.println (fileScanner.nextLine());
                }
                fileScanner.close();
            } catch(FileNotFoundException e){
                e.printStackTrace ();
            }



        }
    }
}


