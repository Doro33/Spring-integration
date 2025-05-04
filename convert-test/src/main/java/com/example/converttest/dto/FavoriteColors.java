package com.example.converttest.dto;

import javax.xml.bind.annotation.XmlElement;
public class FavoriteColors {
    private String FavoriteColorsItem;

    public void setFavoriteColorsItem(String favoriteColorsItem) {
        FavoriteColorsItem = favoriteColorsItem;
    }

    @XmlElement(name = "FavoriteColorsItem", namespace = "http://tempuri.org")
    public String getFavoriteColorsItem() {
        return FavoriteColorsItem;
    }

    @Override
    public String toString() {
        return "FavoriteColors{" +
                "FavoriteColorsItem= " + FavoriteColorsItem  +
                '}';
    }
}
