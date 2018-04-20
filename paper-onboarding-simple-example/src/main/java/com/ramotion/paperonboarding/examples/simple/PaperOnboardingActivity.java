package com.ramotion.paperonboarding.examples.simple;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.ramotion.paperonboarding.PaperOnboardingEngine;
import com.ramotion.paperonboarding.PaperOnboardingPage;
import com.ramotion.paperonboarding.listeners.PaperOnboardingOnChangeListener;
import com.ramotion.paperonboarding.listeners.PaperOnboardingOnRightOutListener;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class PaperOnboardingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboarding_main_layout);

        PaperOnboardingEngine engine = new PaperOnboardingEngine(findViewById(R.id.onboardingRootView), getDataForOnboarding(), getApplicationContext());

        engine.setOnChangeListener(new PaperOnboardingOnChangeListener() {
            @Override
            public void onPageChanged(int oldElementIndex, int newElementIndex) {
                Toast.makeText(getApplicationContext(), "Swiped from " + oldElementIndex + " to " + newElementIndex, Toast.LENGTH_SHORT).show();
            }
        });

        engine.setOnRightOutListener(new PaperOnboardingOnRightOutListener() {
            @Override
            public void onRightOut() {
                // Probably here will be your exit action
                Toast.makeText(getApplicationContext(), "Swiped out right", Toast.LENGTH_SHORT).show();
            }
        });

    }

    // Just example data for Onboarding
    private ArrayList<PaperOnboardingPage> getDataForOnboarding() {
        // prepare data
        PaperOnboardingPage scr1 = new PaperOnboardingPage(
                R.drawable.hotels,
                "Hotels",
                "All hotels and hostels are sorted by hospitality rating",
                "Slide to continue",
                "",
                R.drawable.key,
                Color.parseColor("#678FB4"),
                Color.parseColor("#ffffff"),
                Color.parseColor("#ffffff"),
                View.VISIBLE,
                View.GONE);

        PaperOnboardingPage scr2 = new PaperOnboardingPage(
                R.drawable.banks,
                "Banks",
                "We carefully verify all banks before add them into the app",
                "",
                "",
                R.drawable.wallet,
                Color.parseColor("#65B0B4"),
                Color.parseColor("#ffffff"),
                Color.parseColor("#ffffff"),
                View.GONE,
                View.GONE);


        PaperOnboardingPage scr3 = new PaperOnboardingPage(
                R.drawable.stores,
                "Stores",
                "All local stores are categorized for your convenience",
                "",
                "Let's go!",
                R.drawable.shopping_cart,
                Color.parseColor("#9B90BC"),
                Color.parseColor("#ffffff"),
                Color.parseColor("#ffffff"),
                View.GONE,
                View.VISIBLE);

        ArrayList<PaperOnboardingPage> elements = new ArrayList<>();
        elements.add(scr1);
        elements.add(scr2);
        elements.add(scr3);
        return elements;
    }
}
