# Paper Onboarding for Android

![Animation](onboarding_preview.gif)

## Requirements
​
- Android 5.0 Lollipop (API lvl 21) or greater
- Your favorite IDE

## Installation
​
*coming soon*

## Basic usage

Paper Onboarding is a simple and easy to use onboarding slider for your app. You just need to provide content for each slider page - a main icon, text, and small round icon for the bottom.

1 Use `PaperOnboardingPage` to prepare your data for slider:
```java
PaperOnboardingPage scr1 = new PaperOnboardingPage("Hotels",
	"All hotels and hostels are sorted by hospitality rating",
        Color.parseColor("#678FB4"), R.drawable.hotels, R.drawable.key);
PaperOnboardingPage scr2 = new PaperOnboardingPage("Banks",
	"We carefully verify all banks before add them into the app",
        Color.parseColor("#65B0B4"), R.drawable.banks, R.drawable.wallet);
PaperOnboardingPage scr3 = new PaperOnboardingPage("Stores",
	"All local stores are categorized for your convenience",
        Color.parseColor("#9B90BC"), R.drawable.stores, R.drawable.shopping_cart);

ArrayList<PaperOnboardingPage> elements = new ArrayList<>();
elements.add(scr1);
elements.add(scr2);
elements.add(scr3);
```


2 Create a fragment from `PaperOnboardingFragment` and provide your data.
```java
PaperOnboardingFragment onBoardingFragment = PaperOnboardingFragment.newInstance(elements);
```

3 Done! Now you can use this fragment as you want in your activity, for example :

```java
FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
fragmentTransaction.add(R.id.fragment_container, onBoardingFragment);
fragmentTransaction.commit();
```

4 Extra step : You can add event listeners to fragments with your logic, like replacing this fragment to another when the user swipes next from the last screen:

```java
onBoardingFragment.setOnRightOutListener(new PaperOnboardingOnRightOutListener() {
    @Override
    public void onRightOut() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Fragment bf = new BlankFragment();
        fragmentTransaction.replace(R.id.fragment_container, bf);
        fragmentTransaction.commit();
    }
});
```
Currently, there are three listeners that cover all events - onRightOut, onLeftOut and onChange; see code examples and usage in the repo.

## Licence
​
Folding cell is released under the MIT license.
See [LICENSE](./LICENSE) for details.
​
## About
The project maintained by [app development agency](https://ramotion.com?utm_source=gthb&utm_medium=special&utm_campaign=foolding-cell-android) [Ramotion Inc.](https://ramotion.com?utm_source=gthb&utm_medium=special&utm_campaign=foolding-cell-android)
See our other [open-source projects](https://github.com/ramotion) or [hire](https://ramotion.com?utm_source=gthb&utm_medium=special&utm_campaign=foolding-cell-android) us to design, develop, and grow your product.
​
[![Twitter URL](https://img.shields.io/twitter/url/http/shields.io.svg?style=social)](https://twitter.com/intent/tweet?text=https://github.com/ramotion/foolding-cell-android)
[![Twitter Follow](https://img.shields.io/twitter/follow/ramotion.svg?style=social)](https://twitter.com/ramotion)
