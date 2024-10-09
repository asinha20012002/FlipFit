package com.flipkart.client;

import com.flipkart.business.*;

public class CustomerClient {
    public static void main(String[] args){
        CustomerInterface business = new CustomerBusiness();
        business.createCustomer();
    }
}
