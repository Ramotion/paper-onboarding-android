package com.ramotion.paperonboarding;

import android.graphics.Color;
import android.os.Build;

import androidx.annotation.RequiresApi;

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

    private boolean showSkipButton;
    private boolean showNextButton;
    private boolean showPreviousButton;
    private String skipText;

    private int previousButtonColor;
    private int nextButtonColor;

    public static class Builder {
        private String titleText;
        private String descriptionText;
        private int bgColor;
        private int contentIconRes;
        private int bottomBarIconRes;

        private boolean showSkipButton;
        private boolean showNextButton;
        private boolean showPreviousButton;
        private String skipText;

        private int previousButtonColor;
        private int nextButtonColor;


        public Builder() {
            init();
        }

        public Builder(String titleText, String descriptionText) {
            init();
            this.titleText = titleText;
            this.descriptionText = descriptionText;
        }

        private void init() {
            titleText = "";
            descriptionText = "";
            bgColor = Color.TRANSPARENT;
            contentIconRes = -1;
            bottomBarIconRes = -1;
            showNextButton = false;
            showSkipButton = false;
            showPreviousButton = false;
            skipText = "";
            previousButtonColor = Color.BLACK;
            nextButtonColor = Color.BLACK;
        }

        public Builder setTitleText(String titleText) {
            this.titleText = titleText;
            return this;
        }

        public Builder setDescriptionText(String descriptionText) {
            this.descriptionText = descriptionText;
            return this;
        }

        public Builder setBgColor(int bgColor) {
            this.bgColor = bgColor;
            return this;
        }

        public Builder setContentIconRes(int contentIconRes) {
            this.contentIconRes = contentIconRes;
            return this;
        }

        public Builder setBottomBarIconRes(int bottomBarIconRes) {
            this.bottomBarIconRes = bottomBarIconRes;
            return this;
        }

        public Builder setShowSkipButton(boolean showSkipButton) {
            this.showSkipButton = showSkipButton;
            return this;
        }

        public Builder setShowNextButton(boolean showNextButton) {
            this.showNextButton = showNextButton;
            return this;
        }

        public Builder setShowPreviousButton(boolean showPreviousButton) {
            this.showPreviousButton = showPreviousButton;
            return this;
        }

        public Builder setSkipText(String skipText) {
            this.skipText = skipText;
            return this;
        }

        @RequiresApi(21)
        public Builder setPreviousButtonColor(int color) {
            this.previousButtonColor = color;
            return this;
        }

        @RequiresApi(21)
        public Builder setNextButtonColor(int color) {
            this.nextButtonColor = color;
            return this;
        }

        public PaperOnboardingPage create() {
            PaperOnboardingPage res = new PaperOnboardingPage(titleText, descriptionText, bgColor, contentIconRes, bottomBarIconRes);
            res.setShowNextButton(showNextButton);
            res.setShowSkipButton(showSkipButton);
            res.setShowPreviousButton(showPreviousButton);
            res.setSkipText(skipText);
            res.setNextButtonColor(nextButtonColor);
            res.setPreviousButtonColor(previousButtonColor);
            return res;
        }
    }

    public PaperOnboardingPage() {
    }

    public PaperOnboardingPage(String titleText, String descriptionText, int bgColor, int contentIconRes, int bottomBarIconRes) {
        this.bgColor = bgColor;
        this.contentIconRes = contentIconRes;
        this.bottomBarIconRes = bottomBarIconRes;
        this.descriptionText = descriptionText;
        this.titleText = titleText;
        this.showSkipButton = false;
        this.showNextButton = false;
        this.showPreviousButton = false;
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


    public boolean getShowSkipButton() {
        return showSkipButton;
    }

    public void setShowSkipButton(boolean showSkipButton) {
        this.showSkipButton = showSkipButton;
    }

    public boolean getShowNextButton() {
        return showNextButton;
    }

    public void setShowNextButton(boolean showNextButton) {
        this.showNextButton = showNextButton;
    }

    public boolean getShowPreviousButton() {
        return showPreviousButton;
    }

    public void setShowPreviousButton(boolean showPreviousButton) {
        this.showPreviousButton = showPreviousButton;
    }

    public int getPreviousButtonColor() {
        return this.previousButtonColor;
    }

    public void setPreviousButtonColor(int color) {
        this.previousButtonColor = color;
    }

    public int getNextButtonColor() {
        return this.nextButtonColor;
    }

    public void setNextButtonColor(int color) {
        this.nextButtonColor = color;
    }

    public String getSkipText() {
        return skipText;
    }

    public void setSkipText(String skipText) {
        this.skipText = skipText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PaperOnboardingPage that = (PaperOnboardingPage) o;

        if (bgColor != that.bgColor) return false;
        if (contentIconRes != that.contentIconRes) return false;
        if (bottomBarIconRes != that.bottomBarIconRes) return false;
        if (showNextButton != that.showNextButton) return false;
        if (showPreviousButton != that.showPreviousButton) return false;
        if (showSkipButton != that.showSkipButton) return false;

        if (titleText != null ? !titleText.equals(that.titleText) : that.titleText != null)
            return false;
        if (skipText != null ? !skipText.equals(that.skipText) : that.skipText != null)
            return false;
        return descriptionText != null ? descriptionText.equals(that.descriptionText) : that.descriptionText == null;

    }

    @Override
    public int hashCode() {
        int result = titleText != null ? titleText.hashCode() : 0;
        result = 31 * result + (descriptionText != null ? descriptionText.hashCode() : 0);
        result = 31 * result + (skipText != null ? skipText.hashCode() : 0);
        result = 31 * result + bgColor;
        result = 31 * result + contentIconRes;
        result = 31 * result + bottomBarIconRes;
        result = 31 * result + bottomBarIconRes;
        result = 31 * result + (showSkipButton? 1: 0);
        result = 31 * result + (showPreviousButton? 1: 0);
        result = 31 * result + (showNextButton? 1: 0);
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
