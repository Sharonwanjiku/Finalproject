package com.verees.gotrendy;

public class Buy {

    int images;
    String name,price;
    public Buy (int images,String name,String price){
        this.images = images;
        this.name= name;
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public int getImages() {
        return images;
    }

    public String getName() {
        return name;
    }


    }
