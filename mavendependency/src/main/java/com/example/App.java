package com.example;

import com.google.gson.Gson;

public class App 
{
    public static void main( String[] args )
    {
        Gson gson = new Gson();
        String json = gson.toJson("Hello World!");
        System.out.println( json );
    }
}
