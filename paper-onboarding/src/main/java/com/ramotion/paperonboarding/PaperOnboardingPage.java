package com.ramotion.paperonboarding;

import java.io.Serializable;

/**
 * Represents content for one page of Paper Onboarding
 */
public class PaperOnboardingPage implements Serializable {

    private String titleText;
    private String descriptionText;
    private int bgColor;
    private int contentIconRes;
    private int bottomBarIconRes;
    private int textColor = 0;
    private int titleTextSize = 0;
    private int descTextSize = 0;
    private int titleTextStyle = 0;
    private int descTextStyle = 0;

    public static class Builder {
        private String titleText;
        private String descriptionText;
        private int bgColor;
        private int contentIconRes;
        private int bottomBarIconRes;
        private int textColor = 0;
        private int titleTextSize = 0;
        private int descTextSize = 0;
        private int titleTextStyle = 0;
        private int descTextStyle = 0;


        public Builder(String titleText, String descriptionText) {
            this.titleText = titleText;
            this.descriptionText = descriptionText;
        }

        public Builder backgroundColor(int bgColor) {
            this.bgColor = bgColor;
            return this;
        }

        public Builder contentIconResource(int contentIconRes) {
            this.contentIconRes = contentIconRes;
            return this;
        }

        public Builder bottomBarIconResource(int bottomBarIconRes) {
            this.bottomBarIconRes = bottomBarIconRes;
            return this;
        }

        public Builder textColor(int textColor) {
            this.textColor = textColor;
            return this;
        }

        public Builder titleTextSize(int titleTextSize) {
            this.titleTextSize = titleTextSize;
            return this;
        }

        public Builder descTextSize(int descTextSize) {
            this.descTextSize = descTextSize;
            return this;
        }

        public Builder titleTexStyle(int textStyle) {
            this.titleTextStyle = textStyle;
            return this;
        }

        public Builder descTextStyle(int textStyle) {
            this.descTextStyle = textStyle;
            return this;
        }

        public PaperOnboardingPage build() {
            return new PaperOnboardingPage(this);
        }

    }

    private PaperOnboardingPage(Builder builder) {
        this.titleText = builder.titleText;
        this.descriptionText = builder.descriptionText;
        this.bgColor = builder.bgColor;
        this.contentIconRes = builder.contentIconRes;
        this.bottomBarIconRes = builder.bottomBarIconRes;
        this.textColor = builder.textColor;
        this.titleTextSize = builder.titleTextSize;
        this.descTextSize = builder.descTextSize;
        this.titleTextStyle = builder.titleTextStyle;
        this.descTextStyle = builder.descTextStyle;
    }


    public int getDescTextStyle() {
        return descTextStyle;
    }

    public int getDescTextSize() {
        return descTextSize;
    }

    public int getTextColor() {
        return textColor;
    }

    public int getTitleTextSize() {
        return titleTextSize;
    }

    public int getTitleTextStyle() {
        return titleTextStyle;
    }

    public String getTitleText() {
        return titleText;
    }

    public void setTitleText(String titleText) {
        this.titleText = titleText;
    }

    public String getDescriptionText() {
        return descriptionText;
    }

    public void setDescriptionText(String descriptionText) {
        this.descriptionText = descriptionText;
    }

    public int getContentIconRes() {
        return contentIconRes;
    }

    public void setContentIconRes(int contentIconRes) {
        this.contentIconRes = contentIconRes;
    }

    public int getBottomBarIconRes() {
        return bottomBarIconRes;
    }

    public void setBottomBarIconRes(int bottomBarIconRes) {
        this.bottomBarIconRes = bottomBarIconRes;
    }

    public int getBgColor() {
        return bgColor;
    }

    public void setBgColor(int bgColor) {
        this.bgColor = bgColor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PaperOnboardingPage that = (PaperOnboardingPage) o;

        if (bgColor != that.bgColor) return false;
        if (contentIconRes != that.contentIconRes) return false;
        if (bottomBarIconRes != that.bottomBarIconRes) return false;
        if (titleText != null ? !titleText.equals(that.titleText) : that.titleText != null)
            return false;
        return descriptionText != null ? descriptionText.equals(that.descriptionText) : that.descriptionText == null;

    }

    @Override
    public int hashCode() {
        int result = titleText != null ? titleText.hashCode() : 0;
        result = 31 * result + (descriptionText != null ? descriptionText.hashCode() : 0);
        result = 31 * result + bgColor;
        result = 31 * result + contentIconRes;
        result = 31 * result + bottomBarIconRes;
        return result;
    }

    @Override
    public String toString() {
        return "PaperOnboardingPage{" +
                "titleText='" + titleText + '\'' +
                ", descriptionText='" + descriptionText + '\'' +
                ", bgColor=" + bgColor +
                ", contentIconRes=" + contentIconRes +
                ", bottomBarIconRes=" + bottomBarIconRes +
                '}';
    }
}
