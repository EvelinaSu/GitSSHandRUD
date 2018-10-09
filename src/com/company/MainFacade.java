package com.company;

import com.company.crud.FileCRUD;

import java.util.Scanner;

public class MainFacade {

    public static void main(String[] args) {
        FileCRUD model= new FileCRUD();
        model.createFile ();
        model.updateFile ();
        model.readFile ();
        model.deleteFile ();
    }

}
