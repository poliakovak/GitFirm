package views;

import models.Employee;
import utils.Validator;

import java.util.Scanner;

public class EmployeeView {

    Employee model;
    String title;
    String name;
    int numberOfHours;
    double ratePerHour;
    double revenue;
    Scanner scanner;

    public EmployeeView(Employee model) {this.model = model; }

    public void getInputs() {

        scanner = new Scanner(System.in);

        title = "Введите имя продавца: ";
        System.out.print(title);
        name = Validator.validateName(scanner);
        model.setName(name);

        title = "Введите количество рабочих часов: ";
        System.out.print(title);
        numberOfHours = Validator.validatIntInput(scanner);
        model.setNumberOfHours(numberOfHours);

        title = "Введите ставку за час работы: ";
        System.out.print(title);
        ratePerHour = Validator.validateDoubleInput(scanner);
        model.setRatePerHour(ratePerHour);

        title = "Введите сумму выручки: ";
        System.out.print(title);
        revenue = Validator.validateDoubleInput(scanner);
        model.setRevenue(revenue);

        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
