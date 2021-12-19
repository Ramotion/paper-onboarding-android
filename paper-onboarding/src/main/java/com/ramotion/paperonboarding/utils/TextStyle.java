package com.ramotion.paperonboarding.utils;

/**
 * TextView Text style values
 */
public enum TextStyle {

    NORMAL(0),
    BOLD(1),
    ITALIC(2),
    BOLD_ITALIC(3);

    public int value;

    TextStyle(int value) {
        this.value = value;
    }
}