package com.ramotion.paperonboarding;

import java.io.Serializable;

/**
 * Represents content for one page of Paper Onboarding
 */
public class PaperOnboardingPage implements Serializable {

    private int contentIconRes;
    private String titleText;
    private String descriptionText;
    private String slideText;
    private String buttonText;
    private int bottomBarIconRes;
    private int bgColor;
    private int titleColor;
    private int descriptionColor;
    private int  sliderVisibility;
    private int buttonVisibility;

    public PaperOnboardingPage() {
    }

    public PaperOnboardingPage(
            int contentIconRes,
            String titleText,
            String descriptionText,
            String slideText,
            String buttonText,
            int bottomBarIconRes,
            int bgColor,
            int titleColor,
            int descriptionColor,
            int sliderVisibility,
            int buttonVisibility
    ) {
        this.contentIconRes = contentIconRes;
        this.titleText = titleText;
        this.descriptionText = descriptionText;
        this.slideText = slideText;
        this.buttonText = buttonText;
        this.bottomBarIconRes = bottomBarIconRes;
        this.bgColor = bgColor;
        this.titleColor = titleColor;
        this.descriptionColor = descriptionColor;
        this.sliderVisibility = sliderVisibility;
        this.buttonVisibility = buttonVisibility;
    }

    public int getContentIconRes() {
        return contentIconRes;
    }

    public String getTitleText() {
        return titleText;
    }

    public String getDescriptionText() {
        return descriptionText;
    }

    public String getSlideText() {
        return slideText;
    }

    public String getButtonText() {
        return buttonText;
    }

    public int getBottomBarIconRes() {
        return bottomBarIconRes;
    }

    public int getBgColor() {
        return bgColor;
    }

    public int getTitleColor() {
        return titleColor;
    }

    public int getDescriptionColor() {
        return descriptionColor;
    }

    public int getSliderVisibility() {
        return sliderVisibility;
    }

    public int getButtonVisibility() {
        return buttonVisibility;
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
                "contentIconRes=" + contentIconRes +
                ", titleText='" + titleText  + '\'' +
                ", descriptionText='" + descriptionText + '\'' +
                ", bottomBarIconRes=" + bottomBarIconRes +
                ", bgColor=" + bgColor +
                ", titleColor=" + titleColor +
                ", descriptionColor=" + descriptionColor +
                '}';
    }
}
