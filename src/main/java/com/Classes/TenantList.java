package com.Classes;

import java.util.ArrayList;

public class TenantList {
    private ArrayList<Tenant> tList;
    public final int MAX;

    public TenantList(int max){
        MAX = max;
        tList = new ArrayList<>();
    }

    public boolean addTenant(Tenant t){
        if (isFull())
            return false;

        tList.add(t);
        return true;
    }
    public boolean removeTenant(int i){
        var tenant = search(i);

        if (tenant == null)
            return false;

        tList.remove(tenant);
        return true;
    }
    public Tenant getTenant(int i){
        return i > 0 && i < tList.size() + 1 ? tList.get(i - 1) : null;
    }
    public Tenant search (int room){
        var output = tList.stream().filter(t -> t.getRoom() == room).findFirst();

        return output.isPresent() ? output.get() : null;
    }
    public int getTotal(){
        return tList.size();
    }
    public boolean isEmpty(){
        return tList.isEmpty();
    }
    public boolean isFull(){
        return tList.size() == MAX;
    }

    @Override
    public String toString(){
        return tList.toString();
    }
}
