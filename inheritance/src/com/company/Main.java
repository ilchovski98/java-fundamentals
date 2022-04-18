package com.company;

public class Main {
    public static void main(String[] args) {
        var control = new UIControl(true);
        var textBox = new TextBox();
        show(control);
    }

    public static void show(UIControl control) {
        var textBox = (TextBox)control;
        System.out.println(control);
    }
}
