package models;

import base.Tax;
import base.Sale;

public class Supplier implements Tax, Sale{

    private String product;
    private int quantity;
    private double price;
    private int taxRate;

    public String getProduct() {return product; }
    public void setProduct(String product) {this.product = product; }

    public int getQuantity() {return quantity; }
    public void setQuantity(int quantity) {this.quantity = quantity; }

    public double getPrice() {return price; }
    public void setPrice(double price) {this.price = price; }

    public int getTaxRate() { return taxRate; }
    public void setTaxRate(int taxRate) {this.taxRate = taxRate; }


    @Override
    public double calculateTax(double payment, int taxRate) {
        return payment * taxRate / 100;
    }

    @Override
    public double calculateSale(int quantity, double pricePerProduct) {
        return quantity * pricePerProduct;
    }

    @Override
    public double calculateSale(double sale, double taxFee) {
        return sale + taxFee;
    }
}
