package controllers;

import models.Switcher;
import views.SwitcherView;

public class SwitcherController {

    Switcher model;
    SwitcherView view;

    public SwitcherController(Switcher model, SwitcherView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInput();

        int chosenController = model.getControllerType();

        switch (chosenController)
        {
            case 1 -> model.runClient();
            case 2 -> model.runEmployee();
            case 3 -> model.runSupplier();
            default -> throw new IllegalStateException("Unexpected value: " + chosenController);
        }
    }
}
