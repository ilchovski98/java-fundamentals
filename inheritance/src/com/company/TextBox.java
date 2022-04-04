package com.company;

public class TextBox extends UIControl {
    private String text = "";

    public void setText(String input) {
        text = input;
    }

    public String getText() {
        return text;
    }

    public void clear() {
        text = "";
    }
}
