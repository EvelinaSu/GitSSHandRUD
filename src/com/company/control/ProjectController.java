package com.company.control;

import com.company.model.FileCRUD;
import com.company.view.CommandLineUI;

import java.util.Scanner;

public class ProjectController {
    private CommandLineUI view;
    private FileCRUD model;

    public ProjectController (CommandLineUI parView, FileCRUD parModel) {

                view = parView;
                model = parModel;
    }

    public void dirbam () {
        boolean arTesti = true;
        Scanner sc = new Scanner(System.in);
        while (arTesti) {
            view.showMenu ();
            int pasirinikimas = sc.nextInt ();
            switch (pasirinikimas) {
                case 0:
                    arTesti = false;
                    break;
                case 1:
                    model.requestFileName();
                    break;
                case 2:
                    model.createFile ();
                    break;
                case 3:
                    model.updateFile ();
                    break;
                case 4:
                    model.readFile ();
                    break;
                case 5:
                    model.deleteFile ();
                    break;
            }
        }
    }

}
