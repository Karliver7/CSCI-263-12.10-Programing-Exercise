package com.UnitTests;

import com.Classes.*;

public class TenantListTester {

    public static void main(String[] args) {
        var tenantList = new TenantList(2);

        System.out.println(String.format("""
                Current TenantList: %s
                isEmpty: %b
                isFull: %b
                Total: %d
                Add Tenant 1: %b
                Add Tenant 2: %b
                Add Tenant 3: %b
                Add Tenant 4: %b
                Get Tenant 2: %s
                Get Tenant 1: %s
                Get Tenant 3: %s
                Get Tenant 4: %s
                isEmpty: %b
                isFull: %b
                Total: %d
                Current TenantList: %s
                Remove Tenant 1: %b
                isFull: %b
                Total: %d
                Current TenantList: %s""",
                tenantList,
                tenantList.isEmpty(),
                tenantList.isFull(),
                tenantList.getTotal(),
                tenantList.addTenant(new Tenant("Karl", 101)),
                tenantList.addTenant(new Tenant("Jack", 102)),
                tenantList.addTenant(new Tenant("Serge", 103)),
                tenantList.addTenant(new Tenant("Annie", 104)),
                tenantList.getTenant(2),
                tenantList.search(101),
                tenantList.getTenant(3),
                tenantList.search(104),
                tenantList.isEmpty(),
                tenantList.isFull(),
                tenantList.getTotal(),
                tenantList,
                tenantList.removeTenant(101),
                tenantList.isFull(),
                tenantList.getTotal(),
                tenantList));
    }
}
