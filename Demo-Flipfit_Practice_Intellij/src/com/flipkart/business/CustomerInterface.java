package com.flipkart.business;

public interface CustomerInterface {
    public void createCustomer();
    public boolean deleteCustomer(int customerID);
    public boolean updateCustomer(int customerID);
    public void listCustomer();
}
