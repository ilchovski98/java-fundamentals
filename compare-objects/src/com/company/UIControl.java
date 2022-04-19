package com.company;

public class UIControl {
    boolean isEnabled = true;

    public UIControl(boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

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
