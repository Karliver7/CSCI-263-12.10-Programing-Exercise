package com.UnitTests;

import com.Classes.*;

public class TenantTester {

    public static void main(String[] args) {
        var t1 = new Tenant("Karl", 101);

        System.out.println("Room: " + t1.getRoom());
        System.out.println("Name: " + t1.getName());
        System.out.println("Current Payments: " + t1.getPayments());
        System.out.println("Payment 1: " + t1.makePayment(new Payment("Oct", 250.0)));
        System.out.println("Payment 2: " + t1.makePayment(new Payment("Nov", 300.0)));
        System.out.println("Current Payments: " + t1.getPayments());

        for (var i = 0; i < 11; i++)
            System.out.println(String.format("Payment %d: %b", i, t1.makePayment(new Payment("Dec", 350.0))));
        System.out.println("Current Payments: " + t1.getPayments());
    }

}
