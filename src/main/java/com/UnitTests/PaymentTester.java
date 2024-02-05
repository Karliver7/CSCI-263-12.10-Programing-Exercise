package com.UnitTests;

import com.Classes.Payment;

public class PaymentTester {

    public static void main(String[] args) {
        Payment p1 = new Payment("January", 175);

        System.out.println(p1);
        System.out.println(p1.getAmount());
        System.out.println(p1.getMonth());
    }
}
