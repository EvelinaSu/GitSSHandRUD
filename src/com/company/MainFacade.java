package com.company;

import com.company.control.ProjectController;
import com.company.model.FileCRUD;
import com.company.view.CommandLineUI;


public class MainFacade {

    public static void main(String[] args) {
        FileCRUD model = new FileCRUD ();
        CommandLineUI view = new CommandLineUI ();
        ProjectController controller = new ProjectController ( view, model );
        controller.dirbam ();


    }


}
