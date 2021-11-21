package models;

import base.Prize;
import base.Salary;

public class Employee implements Prize, Salary {

    private String name;
    private int numberOfHours;
    private double revenue;
    private double ratePerHour;
    private final static int PERCENT_OF_PRIZE = 10;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getRatePerHour() {return ratePerHour; }

    public void setRatePerHour(double ratePerHour) {this.ratePerHour = ratePerHour; }

    @Override
    public double calculatePrize(double revenue) {
        return revenue * PERCENT_OF_PRIZE / 100;
    }

    @Override
    public double calculateSalary(int numberOfHours, double rate) {
        return numberOfHours * rate;
    }

    @Override
    public double calculateSalary(double salary, double prize) {
        return salary + prize;
    }
}
