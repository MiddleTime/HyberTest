package com.mycompany.hibertest.main;


import com.mycompany.hibertest.dbService.DBException;
import com.mycompany.hibertest.dbService.DBService;
import com.mycompany.hibertest.dbService.dataSets.UsersDataSet;


public class Main {
    public static void main(String[] args) {
        DBService dbService = new DBService();
        dbService.printConnectInfo();

        try {
            long userId = dbService.addUser("Koska");
            System.out.println("Added user id: " + userId);

            UsersDataSet dataSet = dbService.getUser(userId);
            System.out.println("User data set: " + dataSet);

        } catch (DBException e) {
            e.printStackTrace();
        }
    }
}
