package com.ramotion.paperonboarding.listeners;

import android.animation.Animator;

/**
 * Just sugar for code clean
 */
public abstract class AnimatorEndListener implements Animator.AnimatorListener {

    @Override
    public void onAnimationStart(Animator animation) {
        //do nothing
    }

    @Override
    public void onAnimationCancel(Animator animation) {
        //do nothing
    }

    @Override
    public void onAnimationRepeat(Animator animation) {
        //do nothing
    }
}
