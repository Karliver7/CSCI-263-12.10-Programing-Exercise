package com.Classes;

import java.util.ArrayList;

/**
 * @author Karl Vangsness
 * @version January 12th 2024
 */
public class PaymentList {
    private ArrayList<Payment> pList;
    public int MAX;

    /**
     * @param max Sets the max size of the PaymentList
     */
    public PaymentList(int max) {
        pList = new ArrayList<>();
        MAX = max;
    }

    /**
     * @return Returns true if the PaymentList is full otherwise false
     */
    public boolean isFull() {
        return pList.size() == MAX;
    }

    /**
     * @return Returns the size of the PaymentList
     */
    public int getTotal() {
        return pList.size();
    }

    /**
     * @param input Payment to add
     * @return Returns true if the Payment was added, if not false
     */
    public boolean addPayment(Payment input) {
        if(isFull())
            return false;

        pList.add(input);
        return true;
    }

    /**
     * @param input The location of the Payment in the PaymentList to return
     * @return Returns the select payment from the PaymentList
     */
    public Payment getPayment(int input) {
        if (input < 0 || input > getTotal())
            return null;

        return pList.get(input - 1);
    }

    /**
     * @return Returns the total dollar amount of the PaymentList
     */
    public double calculateTotalPaid(){
        double total = 0;

        for (Payment p : pList)
            total += p.getAmount();

        return total;
    }

    @Override
    public String toString() {
        return pList.toString();
    }
}
