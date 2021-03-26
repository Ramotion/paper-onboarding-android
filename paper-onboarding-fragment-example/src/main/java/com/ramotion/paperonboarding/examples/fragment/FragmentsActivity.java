package com.ramotion.paperonboarding.examples.fragment;

import android.graphics.Color;
import android.os.Bundle;

import com.ramotion.paperonboarding.PaperOnboardingFragment;
import com.ramotion.paperonboarding.PaperOnboardingPage;
import com.ramotion.paperonboarding.listeners.PaperOnboardingOnRightOutListener;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class FragmentsActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragments_activity_layout);
        fragmentManager = getSupportFragmentManager();

        final PaperOnboardingFragment onBoardingFragment = PaperOnboardingFragment.newInstance(getDataForOnboarding());

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fragment_container, onBoardingFragment);
        fragmentTransaction.commit();

        onBoardingFragment.setOnRightOutListener(new PaperOnboardingOnRightOutListener() {
            @Override
            public void onRightOut() {
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                Fragment bf = new BlankFragment();
                fragmentTransaction.replace(R.id.fragment_container, bf);
                fragmentTransaction.commit();
            }
        });
    }

    private ArrayList<PaperOnboardingPage> getDataForOnboarding() {
        // prepare data
        PaperOnboardingPage scr1;
        PaperOnboardingPage.Builder builder = new PaperOnboardingPage.Builder("Hotels", "All hotels and hostels are sorted by hospitality rating")
                .setSkipText("Skip")
                .setShowSkipButton(true)
                .setShowNextButton(true)
                .setShowPreviousButton(true)
                .setContentIconRes(R.drawable.hotels)
                .setBgColor(Color.parseColor("#678FB4"))
                .setBottomBarIconRes(R.drawable.key);

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.LOLLIPOP) {
            builder.setNextButtonColor(Color.RED);
        }
        scr1 = builder.create();


        PaperOnboardingPage scr2 = new PaperOnboardingPage.Builder("Banks", "We carefully verify all banks before add them into the app")
                .setSkipText("Skip")
                .setShowSkipButton(true)
                .setShowNextButton(true)
                .setShowPreviousButton(true)
                .setContentIconRes(R.drawable.banks)
                .setBgColor(Color.parseColor("#65B0B4"))
                .setBottomBarIconRes(R.drawable.wallet)
                .create();

        PaperOnboardingPage scr3 = new PaperOnboardingPage.Builder("Stores", "All local stores are categorized for your convenience")
                .setSkipText("Skip")
                .setShowSkipButton(true)
                .setShowNextButton(true)
                .setShowPreviousButton(true)
                .setContentIconRes(R.drawable.stores)
                .setBgColor(Color.parseColor("#9B90BC"))
                .setBottomBarIconRes(R.drawable.shopping_cart)
                .create();

        ArrayList<PaperOnboardingPage> elements = new ArrayList<>();
        elements.add(scr1);
        elements.add(scr2);
        elements.add(scr3);
        return elements;
    }
}
