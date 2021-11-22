package base;

public interface Sale {

    double calculateSale(int quantity, double pricePerProduct);

    double calculateSale(double sale, double taxFee);
}
