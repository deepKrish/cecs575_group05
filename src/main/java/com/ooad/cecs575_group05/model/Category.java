package com.ooad.cecs575_group05.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "categories")
public class Category implements Prototype{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "category_name")
    private @NotBlank String categoryName;

    private @NotBlank String categoryDescription;

    private @NotBlank String categoryPic;


    public Category() {
    }

    public Category(@NotBlank String categoryName, @NotBlank String categoryDescription) {
        this.categoryName = categoryName;
        this.categoryDescription = categoryDescription;
    }

    public Category(@NotBlank String categoryName, @NotBlank String description, @NotBlank String categoryPic) {
        this.categoryName = categoryName;
        this.categoryDescription = description;
        this.categoryPic = categoryPic;
    }

    public String getCategoryName() {
        return this.categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDescription() {
        return categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    @Override
    public String toString() {
        return "User {category id=" + id + ", category name='" + categoryName + "', description='" + categoryDescription + "'}";
    }

    public String getCategoryPic() {
        return categoryPic;
    }

    public void setCategoryPic(String categoryPic) {
        this.categoryPic = categoryPic;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void showCategoryRecord(){

        System.out.println(categoryName+"\t"+ categoryDescription +"\t"+ categoryPic);
    }


    @Override
    public Prototype showCategory() {
        return new Category(categoryName, categoryDescription, categoryPic);
    }
}