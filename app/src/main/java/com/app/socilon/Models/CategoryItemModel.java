package com.app.socilon.Models;

public class CategoryItemModel {
    private int drawableId;
    private String text;

    public CategoryItemModel(int drawableId, String text) {
        this.drawableId = drawableId;
        this.text = text;
    }

    public int getDrawableId() {
        return drawableId;
    }

    public String getText() {
        return text;
    }
}
