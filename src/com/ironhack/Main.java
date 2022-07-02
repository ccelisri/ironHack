package com.ironhack;

public class Main {
    public static void main(String[] args) {

        System.out.println(formatUserName(" this grand dog ", "18/09/1996"));
        }
public static String formatUserName (String userName, String date){
            String cleanUserName = userName.trim().replace(" ", "_").toUpperCase();
            String concatCleanUserName = cleanUserName + date;
            return concatCleanUserName;
    }
}
