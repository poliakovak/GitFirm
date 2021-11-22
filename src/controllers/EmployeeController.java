package controllers;

import models.Employee;
import utils.Rounder;
import views.EmployeeView;

public class EmployeeController {

    Employee model;
    EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();
        String name = model.getName();

        double initialSalary = model.calculateSalary(model.getNumberOfHours(), model.getRatePerHour());
        String initialSalaryRounded = Rounder.roundValue(initialSalary);

        double prize = model.calculatePrize(model.getRevenue());
        String prizeRounded = Rounder.roundValue(prize);

        double finalSalary = model.calculateSalary(initialSalary, prize);
        String roundedFinalSalary = Rounder.roundValue(finalSalary);

        String output = "------------------------------\n" +
                "Имя продавца: " + name + "\n" +
                "Оклад за отработанные часы (грн.): " + initialSalaryRounded + "\n" +
                "Надбавка от выручки (грн.): " + prizeRounded + "\n" +
                "Расчитанная сумма зарплаты (грн.): " + roundedFinalSalary;

        view.getOutput(output);

    }
}
