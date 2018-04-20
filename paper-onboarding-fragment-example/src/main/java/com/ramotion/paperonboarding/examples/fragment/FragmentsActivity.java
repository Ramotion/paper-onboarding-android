package com.ramotion.paperonboarding.examples.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

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
