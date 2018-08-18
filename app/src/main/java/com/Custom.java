package com;

public class Custom {
    int images;
    String name,description,phonenumber,price;
    public Custom(int images,String name,String description,String phonenumber,String price){
        this.images = images;
        this.name= name;
        this.description=description;
        this.phonenumber=phonenumber;
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public int getImages() {
        return images;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
