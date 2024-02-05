package com.Classes;

public class Payment {
    private String month;
    private double amount;

    /**
     * @param month The Month in which the payment was from
     * @param amount The Amount that was paid in this payment
     */
    public Payment(String month, double amount) {
        this.month = month;
        this.amount = amount;
    }

    /**
     * @return Returns the property Month
     */
    public String getMonth() {
        return month;
    }

    /**
     * @return Returns the property of Amount
     */
    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return String.format("(%s:%,.2f)", month, amount);
    }
}
