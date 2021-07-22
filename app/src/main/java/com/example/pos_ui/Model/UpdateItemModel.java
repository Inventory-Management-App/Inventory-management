package com.example.pos_ui.Model;

public class UpdateItemModel {
    private String AddCode;
    private String AddName;
    private String AddInitialPrice;
    private String AddSellingPrice;
    private String AddQuantity;
    private String AddMinQuantity;

    public UpdateItemModel(String addCode, String addName, String addInitialPrice, String addSellingPrice, String addQuantity, String addMinQuantity) {
        AddCode = addCode;
        AddName = addName;
        AddInitialPrice = addInitialPrice;
        AddSellingPrice = addSellingPrice;
        AddQuantity = addQuantity;
        AddMinQuantity = addMinQuantity;
    }

    public String getAddCode() {
        return AddCode;
    }

    public void setAddCode(String addCode) {
        AddCode = addCode;
    }

    public String getAddName() {
        return AddName;
    }

    public void setAddName(String addName) {
        AddName = addName;
    }

    public String getAddInitialPrice() {
        return AddInitialPrice;
    }

    public void setAddInitialPrice(String addInitialPrice) {
        AddInitialPrice = addInitialPrice;
    }

    public String getAddSellingPrice() {
        return AddSellingPrice;
    }

    public void setAddSellingPrice(String addSellingPrice) {
        AddSellingPrice = addSellingPrice;
    }

    public String getAddQuantity() {
        return AddQuantity;
    }

    public void setAddQuantity(String addQuantity) {
        AddQuantity = addQuantity;
    }

    public String getAddMinQuantity() {
        return AddMinQuantity;
    }

    public void setAddMinQuantity(String addMinQuantity) {
        AddMinQuantity = addMinQuantity;
    }
}
