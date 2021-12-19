package com.ramotion.paperonboarding;

import com.ramotion.paperonboarding.utils.TextStyle;

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

    private String imageUrl;
    private int imageHeight;
    private int imageWidth;

    private int titleTextColor;
    private int titleTextSize;
    private int descriptionTextColor;
    private int descriptionTextSize;
    private TextStyle titleTextStyle;
    private TextStyle descriptionTextStyle;

    public PaperOnboardingPage() {
    }

    public PaperOnboardingPage(String titleText, String descriptionText, int bgColor, int contentIconRes, int bottomBarIconRes) {
        this.bgColor = bgColor;
        this.contentIconRes = contentIconRes;
        this.bottomBarIconRes = bottomBarIconRes;
        this.descriptionText = descriptionText;
        this.titleText = titleText;
    }

    public PaperOnboardingPage(String titleText, String descriptionText, String imageUrl, int bgColor, int bottomBarIconRes) {
        this.titleText = titleText;
        this.descriptionText = descriptionText;
        this.bgColor = bgColor;
        this.bottomBarIconRes = bottomBarIconRes;
        this.imageUrl = imageUrl;
    }

    public TextStyle getTitleTextStyle() {
        return titleTextStyle;
    }

    public void setTitleTextStyle(TextStyle titleTextStyle) {
        this.titleTextStyle = titleTextStyle;
    }

    public TextStyle getDescriptionTextStyle() {
        return descriptionTextStyle;
    }

    public void setDescriptionTextStyle(TextStyle descriptionTextStyle) {
        this.descriptionTextStyle = descriptionTextStyle;
    }

    public int getTitleTextSize() {
        return titleTextSize;
    }

    public void setTitleTextSize(int titleTextSize) {
        this.titleTextSize = titleTextSize;
    }

    public int getDescriptionTextSize() {
        return descriptionTextSize;
    }

    public void setDescriptionTextSize(int descriptionTextSize) {
        this.descriptionTextSize = descriptionTextSize;
    }

    public int getTitleTextColor() {
        return titleTextColor;
    }

    public void setTitleTextColor(int titleTextColor) {
        this.titleTextColor = titleTextColor;
    }

    public int getDescriptionTextColor() {
        return descriptionTextColor;
    }

    public void setDescriptionTextColor(int descriptionTextColor) {
        this.descriptionTextColor = descriptionTextColor;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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
