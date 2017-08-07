package com.example.melhoridade.melhoridade;

/**
 * Created by Luiz Fonseca on 07/08/2017.
 */

public class Interest {

    private int normalImage;
    private int itemSelectedImage;
    private boolean isSelected = false;

    public Interest(int normalImage, int itemSelectedImage) {
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
}
