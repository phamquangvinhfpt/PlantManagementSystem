package sample.dto;

import java.util.ArrayList;

import sample.dao.AccountDao;

public class testConnection {
    public static void main(String[] args) {
        //test login    
        Account acc = AccountDao.getAccount("test@gmail.com", "test");
        if (acc!=null) {
            if(acc.getRole()==1){
                System.out.println("Admin");
        }
            else{
                System.out.println("User");
            }
        }
        else{
            System.out.println("Wrong");
        }

        //test get all accounts
        /*
        ArrayList<Account> list = AccountDao.getAccounts();
        for (Account account : list) {
            System.out.println(account.getAccID()+" "+account.getEmail()+" "+account.getPassword()+" "+account.getFullname()+" "+account.getPhone()+" "+account.getStatus()+" "+account.getRole());
        }

        //test update status account
        if (AccountDao.updateAccountStatus("test@gmail.com", 0)) {
            System.out.println("Update status successfully");
        }
        else{
            System.out.println("Update fail");
        }

        //test update account
        if (AccountDao.updateAccount("test@gmail.com", "999999", "thino", "65432111")) {
            System.out.println("Update successfully");
        }
        else{
            System.out.println("Update fail");
        }

        //test insert account
        if (AccountDao.insertAccount("test2@gmail.com", "222222", "chi pheo", "123123123", 1, 0)) {
            System.out.println("Insert a new account successfully");
        }
        else{
            System.out.println("Insert fail");
        }
        */
    }
}
