package com.pruebatecnica.SQT.model;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private int categoryID;
    private String categoryName;
    private List<String> categorykeywords;
    private List<Category> subCategories;

    public Category(int categoryID, String categoryName) {
        this.categoryID = categoryID;
        this.categoryName = categoryName;
        this.categorykeywords = new ArrayList<>();
        this.subCategories = new ArrayList<>();
    }

    public void addCategory(Category category){
        this.subCategories.add(category);
    }

    public void addKeywords(String keyword){
        this.categorykeywords.add(keyword);
    }

    public int getCategoryID() {
        return categoryID;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public List<Category> getSubCategories() {
        return subCategories;
    }

    public List<String> getCategorykeywords() {
        return categorykeywords;
    }
}
