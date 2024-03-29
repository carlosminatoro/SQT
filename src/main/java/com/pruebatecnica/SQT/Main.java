package com.pruebatecnica.SQT;

import com.pruebatecnica.SQT.util.CategoryHandler;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        CategoryHandler handler = new CategoryHandler();
        handler.addCategory(0, "Furniture");
        handler.addCategory(1, "Electronics");
        handler.addCategory(2, "Home Appliances");

        handler.addKeywords(1, Arrays.asList("electronicsKeyWord1", "electronicsKeyWord2", "electronicsKeyWord3"));
        handler.addKeywords(2, Arrays.asList("HAKeyWord1", "HAKeyWord2", "HAKeyWord3"));

        System.out.println(handler.getKeywordCategories(2));
        System.out.println(handler);
    }
}
