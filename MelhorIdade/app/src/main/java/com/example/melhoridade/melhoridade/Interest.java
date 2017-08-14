package com.example.melhoridade.melhoridade;

/**
 * Created by Luiz Fonseca on 07/08/2017.
 */

public class Interest {

    private String name;
    private int normalImage;
    private int itemSelectedImage;
    private boolean isSelected = false;

    public Interest(String name, int normalImage, int itemSelectedImage) {
        this.name = name;
        this.normalImage = normalImage;
        this.itemSelectedImage = itemSelectedImage;
    }

    public int getImage() {
       if (isSelected) {
           return itemSelectedImage;
       } else {
           return normalImage;
       }
    }

    public void changeIcon() {
        if (isSelected) {
            isSelected = false;
        } else {
            isSelected = true;
        }
    }

    public boolean isSelected() {
        return isSelected;
    }

    public String getName() {
        return name;
    }
}
