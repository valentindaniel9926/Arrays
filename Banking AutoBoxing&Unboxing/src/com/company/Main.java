package com.company;

public class Main {

    public static void main(String[] args) {
	Bank bank = new Bank("National Australia Bank");
	if(bank.addBranch("Adelaide")){
        System.out.println("Adelaide branch created");
    }
	bank.addBranch("Adelaide");
	bank.addCustomer("Adelaide","Tim",50.05);
        bank.addCustomer("Adelaide","Mike",124.05);
        bank.addCustomer("Adelaide","Percy",123.05);

         bank.addBranch("Sydney");
         bank.addCustomer("Sydney","Tim",150.65);
        bank.addCustomer("Adelaide","Mike",50.05);
        bank.addCustomer("Adelaide","Percy",50.05);

        bank.listCustomers("Adelaide",true);
        bank.listCustomers("Sydney",true);
        bank.addBranch("Melbourne");

        if(!bank.addCustomer("Melbounrne","Brian",5.65)){
            System.out.println("Error Melbourne branch does not exist");

        }
        if(!bank.addBranch("Adelaide")){
            System.out.println("Adelaide branch already exist");
        }
        if(!bank.addCustomerTransaction("Adelaide","Fergus",54.55)){
            System.out.println("Customer does not exist at branch");
        }
        if(!bank.addCustomer("Adelaide","Tim",12.32)){
            System.out.println("Customer Tim already exist");
        }

    }

}
