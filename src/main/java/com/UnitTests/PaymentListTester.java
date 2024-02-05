package com.UnitTests;

import com.Classes.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PaymentListTester {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        PaymentList paymentList = null;


        do {
            System.out.print("Size of list? ");
            try {
                paymentList = new PaymentList(input.nextInt());
            } catch (InputMismatchException e) {
                System.out.println("Invalid Entry, Try Again. . .");
                input.nextLine();
            }
        } while (paymentList == null);

        loop : while(true){
            System.out.println("PaymentListTester Menu\n[1] ADD\n[2] DISPLAY\n[3] IS FULL\n[4] GET PAYMENT\n[5] GET TOTAL\n[6] CALCULATE TOTAL PAID\n[7] Quit");
            System.out.print("Enter a choice [1 - 7]: ");

            try{
                switch (input.nextInt()) {
                    case 1:
                        if (paymentList.isFull()) {
                            System.out.println("ERROR: list is full");
                            break;
                        }

                        System.out.print("Enter Month: ");
                        var month = input.next();

                        System.out.print("Enter Amount: ");
                        var amount = input.nextDouble();

                        paymentList.addPayment(new Payment(month, amount));
                        break;
                    case 2:
                        System.out.println("ITEMS ENTERED");
                        System.out.println(paymentList);
                        break;
                    case 3:
                        System.out.println(String.format("list is%s full", paymentList.isFull() ? "" : " NOT"));
                        break;
                    case 4:
                        System.out.print("Enter payment number to retrieve: ");
                        var selectedPayment = input.nextInt();

                        System.out.println(paymentList.getPayment(selectedPayment) == null ? "INVALID PAYMENT NUMBER" : paymentList.getPayment(selectedPayment));
                        break;
                    case 5:
                        System.out.println(String.format("TOTAL NUMBER OF PAYMENTS ENTERED: %d", paymentList.getTotal()));
                        break;
                    case 6:
                        System.out.println(String.format("TOTAL OF PAYMENTS MADE SO FAR: %,.2f", paymentList.calculateTotalPaid()));
                        break;
                    case 7:
                        System.out.println("TESTING COMPLETE");
                        break loop;
                }
            }
            catch (InputMismatchException e){
                System.out.println("Invalid Entry, returning to menu. . .");
                input.nextLine();
            }
        }

        /*
        paymentList.addPayment(new Payment("January", 310));
        paymentList.addPayment(new Payment("February", 280));

        System.out.println(paymentList);
        System.out.println(paymentList.isFull());

        paymentList.addPayment(new Payment("March", 310));
        paymentList.addPayment(new Payment("April", 300));

        System.out.println(paymentList);
        System.out.println(paymentList.isFull());
        System.out.println(paymentList.getPayment(2));
        System.out.println(paymentList.getPayment(5));
        System.out.println(paymentList.getTotal());
        System.out.println(paymentList.calculateTotalPaid());
        System.out.println(paymentList.addPayment(new Payment("May", 300)));
        */
    }
}
