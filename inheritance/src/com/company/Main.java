package com.company;

public class Main {
    public static void main(String[] args) {
        var textBox = new TextBox();
        textBox.setText("Yeahw");
        System.out.println(textBox.getText());
        textBox.disable();
        System.out.println(textBox.isEnabled());
    }
}
