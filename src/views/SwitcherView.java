package views;

import models.Switcher;

import java.util.Scanner;

public class SwitcherView {

    Switcher model;

    int controllerType;

    public SwitcherView(Switcher model) {this.model = model; }

    public void getInput() {
        Scanner console = new Scanner(System.in);

        System.out.print("Для выбора роли нажмите\n1 - Покупатель\n2 - Продавец\n3 - Поставщик: ");
        controllerType = console.nextInt();

        switch (controllerType) {
            case 1 -> System.out.println("Вы выбрали Покупателя");
            case 2 -> System.out.println("Вы выбрали Продавца");
            case 3 -> System.out.println("Вы выбрали Поставщика");
            default -> {
                System.out.println("Такого варианта нет. Попробуйте ещё раз: ");
                controllerType = console.nextInt();
            }
        }

        model.setControllerType(controllerType);

    }
}
