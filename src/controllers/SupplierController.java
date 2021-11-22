package controllers;

import models.Supplier;
import utils.Rounder;
import views.SupplierView;

public class SupplierController {

    Supplier model;
    SupplierView view;

    public SupplierController(Supplier model, SupplierView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        view.getInputs();

        String product = model.getProduct();

        double initialSale = model.calculateSale(model.getQuantity(), model.getPrice());
        String initialSaleRounded = Rounder.roundValue(initialSale);

        double taxFee = model.calculateTax(initialSale, model.getTaxRate());
        String taxFeeRounded = Rounder.roundValue(taxFee);

        double finalSale = model.calculateSale(initialSale, taxFee);
        String finalSaleRounded = Rounder.roundValue(finalSale);

        String output = "------------------------------\n" +
                "Название товара: " +  product + "\n" +
                "Сума продажи (грн.): " + initialSaleRounded + "\n" +
                "Сумма налоговых отчислений (грн.): " + taxFeeRounded + "\n" +
                "Итоговая сумма продажи (грн.): " + finalSaleRounded;

        view.getOutput(output);
    }
}
