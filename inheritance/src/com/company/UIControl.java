package com.company;

public class UIControl {
    private boolean isEnabled = true;

    public void disable() {
        isEnabled = false;
    }

    public void enable() {
        isEnabled = true;
    }

    public boolean isEnabled() {
        return isEnabled;
    }
}
