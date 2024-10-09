package com.flipkart.business;

public class CustomerBusiness implements CustomerInterface{
    @Override
    public void createCustomer() {
        System.out.println("Customer added \n");
    }

    @Override
    public boolean deleteCustomer(int customerID) {
        System.out.println("Customer deleted \n");
        return true;
    }

    @Override
    public boolean updateCustomer(int customerID) {
        System.out.println("Customer updated \n");
        return true;
    }

    @Override
    public void listCustomer() {
        System.out.println("Customers listed \n");
    }
}
