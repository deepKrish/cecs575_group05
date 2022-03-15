package com.ooad.cecs575_group05.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private @NotNull String prodName;
    private @NotNull String prodPic;
    private @NotNull double prodPrice;
    private @NotNull String prodDescription;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "category_id", nullable = false)
    Category category;


    public Product(String prodName, String prodPic, double prodPrice, String prodDescription, Category category) {
        super();
        this.prodName = prodName;
        this.prodPic = prodPic;
        this.prodPrice = prodPrice;
        this.prodDescription = prodDescription;
        this.category = category;
    }

    public Product() {
    }


    //BUILDER PATTERN
    static class ProductBuilder{
        private Integer id;
        private @NotNull String prodName;
        private @NotNull String prodPic;
        private @NotNull double prodPrice;
        private @NotNull String prodDescription;
        Category category;


        public void ProductBuilder(Integer id){
            this.id = id;
            this.category = category;
        }

        public ProductBuilder prodName(String prodName){
            this.prodName = prodName;
            return this;
        }
        public ProductBuilder prodPic(String prodPic){
            this.prodPic = prodPic;
            return this;
        }

        public ProductBuilder prodPrice(double prodPrice){
            this.prodPrice = prodPrice;
            return this;
        }
        public ProductBuilder prodDescription(String prodDescription){
            this.prodDescription = prodDescription;
            return this;
        }

        public ProductBuilder build(){
                return this;
            }
        }






    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public String getProdPic() {
        return prodPic;
    }

    public void setProdPic(String prodPic) {
        this.prodPic = prodPic;
    }

    public double getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(double prodPrice) {
        this.prodPrice = prodPrice;
    }

    public String getProdDescription() {
        return prodDescription;
    }

    public void setProdDescription(String prodDescription) {
        this.prodDescription = prodDescription;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + prodName + '\'' +
                ", imageURL='" + prodPic + '\'' +
                ", price=" + prodPrice +
                ", description='" + prodDescription + '\'' +
                '}';
    }
}