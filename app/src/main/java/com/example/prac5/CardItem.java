package com.example.prac5;

public class CardItem {
    private String title;
    private String element1;
    private String element2;
    private String element3;
    private String element4;

    public CardItem(String title,String element1, String element2, String element3, String element4) {
        this.title = title;
        this.element1 = element1;
        this.element2 = element2;
        this.element3 = element3;
        this.element4 = element4;
    }

    public String getTitle() {
        return title;
    }

    public String getElement1() {
        return element1;
    }

    public String getElement2() {
        return element2;
    }

    public String getElement3() {
        return element3;
    }

    public String getElement4() {
        return element4;
    }
}

