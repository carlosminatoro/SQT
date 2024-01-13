package com.pruebatecnica.SQT.util;

import com.pruebatecnica.SQT.model.Category;

import java.util.List;

public class CategoryHandler {
    Category categoryRoot;

    public CategoryHandler() {
        //Según punto 3, el root siempre iría
        this.categoryRoot = new Category(0,"Root");
        this.categoryRoot.addKeywords("keyRoot1");
        this.categoryRoot.addKeywords("keyRoot2");
    }

    // Añadir sub-categoría a categoría, buscando por el id de la misma
    public void addCategory(int subCategoryName, String newCategory){
        //Buscar la categoría -> retorna Categoría
        Category result = findCateroryById(this.categoryRoot, subCategoryName);
        //Si se encuentra la categoría, añadirla al papá
        if(result != null){
            Category subCategory = new Category(result.getCategoryID() + 1, newCategory);
            result.addCategory(subCategory);
        }else {
        //Si no la encuentra retornar error
            System.out.println("No se encontró la categoría");
        }
    }


    //Añadir keywords a la categoría
    public void addKeywords(int categoryTargetId, List<String> keywords){
        //Buscar la categoría -> retorna Categoría
        Category result = findCateroryById(this.categoryRoot, categoryTargetId);
        //Si se encuentra la categoría, añadirla al papá
        if(result != null) {
            for (String keyW : keywords){
                result.addKeywords(keyW);
            }
        }else{
            //Si no la encuentra retornar error
            System.out.println("No se encontró la categoría");
        }
    }

    //Método recursivo para buscar en las subcategorías
    public Category findCateroryById(Category categoryTarget, int categoryId){
        if(categoryTarget.getCategoryID() ==(categoryId)){
            return categoryTarget;
        }

        for (Category sub_category: categoryTarget.getSubCategories()){
            Category result = findCateroryById(sub_category, categoryId);
            if (result != null){
                return result;
            }
        }

        return null;
    }


    public String getKeywordCategories(int categoryById){
        Category category = findCateroryById(this.categoryRoot, categoryById);
        return category.getCategorykeywords().toString();
    }

    public int findLevelById(int categoryTargetId) {
        Category result = findCateroryById(this.categoryRoot, categoryTargetId);
        if(result != null){
            Category papa = result;

        }else{
            System.out.println("No se encontró la categoría");
        }
        return 0;
    }
}
