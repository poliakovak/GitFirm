package views;

import models.Switcher;
import utils.Validator;

import java.util.Scanner;

public class SwitcherView {

    Switcher model;
    Scanner scanner;

    int controllerType;

    public SwitcherView(Switcher model) {this.model = model; }

    public void getInput() {
        scanner = new Scanner(System.in);
        System.out.print("Выберите роль\n1 - Покупатель\n2 - Продавец\n3 - Поставщик:\n ");
        controllerType = Validator.validateTypeOfController(scanner);
        model.setControllerType(controllerType);

        model.setControllerType(controllerType);

    }
}
