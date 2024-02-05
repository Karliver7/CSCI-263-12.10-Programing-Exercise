package com.Classes;

public class Tenant {
    private String _name;
    private int _room;
    private PaymentList _payments;
    public static final int MAX = 12;

    public Tenant(String name, int room){
        _name = name;
        _room = room;
        _payments = new PaymentList(MAX);
    }

    public boolean makePayment(Payment payment){
        return _payments.addPayment(payment);
    }

    public String getName(){
        return _name;
    }

    public int getRoom(){
        return _room;
    }

    public PaymentList getPayments(){
        return _payments;
    }

    @Override
    public String toString(){
        return String.format("%s, %d, %s", _name, _room, _payments);
    }
}
