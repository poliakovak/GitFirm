package base;

public interface Tax {

    // расчет налога на продажу
    double calculateTax(double payment, int taxRate);
}
