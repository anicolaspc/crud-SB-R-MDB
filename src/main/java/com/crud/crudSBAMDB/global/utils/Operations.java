package com.crud.crudSBAMDB.global.utils;

public class Operations {
    
    public static String corchetes(String message){
        return message.replaceAll("[\\[\\]]", "");
    }
}
