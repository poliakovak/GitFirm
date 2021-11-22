package views;

import models.Supplier;
import utils.Validator;

import java.util.Scanner;

public class SupplierView {

    Supplier model;
    String title;
    String product;
    int quantity;
    double price;
    int taxRate;
    Scanner scanner;

    public SupplierView(Supplier model) {this.model = model; }

    public void getInputs() {

        scanner = new Scanner(System.in);

        title = "Введите название товара: ";
        System.out.print(title);
        product = Validator.validateName(scanner);
        model.setProduct(product);

        title = "Введите количество единиц товара: ";
        System.out.print(title);
        quantity = Validator.validateIntInput(scanner);
        model.setQuantity(quantity);

        title = "Введите цену за единицу товара: ";
        System.out.print(title);
        price = Validator.validateDoubleInput(scanner);
        model.setPrice(price);

        title = "Введите процент налоговой ставки: ";
        System.out.print(title);
        taxRate = Validator.validateTaxInput(scanner);
        model.setTaxRate(taxRate);

        scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
