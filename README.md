![header](./header.png)
![Animation](onboarding_preview.gif)

# Paper Onboarding for Android
[![CircleCI](https://circleci.com/gh/Ramotion/paper-onboarding-android.svg?style=svg)](https://circleci.com/gh/Ramotion/paper-onboarding-android)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/ed1eb5c89dfc45eabb80e93c6a124012)](https://www.codacy.com/app/Ramotion/paper-onboarding-android?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=ramotion/paper-onboarding-android&amp;utm_campaign=Badge_Grade)
[![Twitter](https://img.shields.io/badge/Twitter-@Ramotion-blue.svg?style=flat)](http://twitter.com/Ramotion)

# Check this library on other platforms:
<a href="https://github.com/Ramotion/paper-onboarding"> 
<img src="https://github.com/ramotion/navigation-stack/raw/master/Swift@2x.png" width="178" height="81"></a>

**Looking for developers for your project?**<br>
This project is maintained by Ramotion, Inc. We specialize in the designing and coding of custom UI for Mobile Apps and Websites.

<a href="https://ramotion.com/?utm_source=gthb&utm_medium=special&utm_campaign=paper-onboarding-android-contact-us/#Get_in_Touch"> 
<img src="https://github.com/ramotion/gliding-collection/raw/master/contact_our_team@2x.png" width="187" height="34"></a> <br>


The [Android mockup](https://store.ramotion.com?utm_source=gthb&utm_medium=special&utm_campaign=paper-onboarding-android) available [here](https://store.ramotion.com?utm_source=gthb&utm_medium=special&utm_campaign=paper-onboarding-android).

## Requirements
​
- Android 4.0.3 IceCreamSandwich (API lvl 15) or greater
- Your favorite IDE

## Installation
​
Just download the package from [here](http://central.maven.org/maven2/com/ramotion/paperonboarding/paper-onboarding/1.1.1/paper-onboarding-1.1.1.aar) and add it to your project classpath, or just use the maven repo:
​
Gradle:
```groovy
'com.ramotion.paperonboarding:paper-onboarding:1.1.1'
```
SBT:
```scala
libraryDependencies += "com.ramotion.paperonboarding" % "paper-onboarding" % "1.1.1"
```
Maven:
```xml
<dependency>
    <groupId>com.ramotion.paperonboarding</groupId>
    <artifactId>paper-onboarding</artifactId>
    <version>1.1.1</version>
    <type>aar</type>
</dependency>
```

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
Paper onboarding is released under the MIT license.
See [LICENSE](./LICENSE) for details.

<br>

# Get the Showroom App for Android to give it a try
Try our UI components in our mobile app. Contact us if interested.

<a href="https://play.google.com/store/apps/details?id=com.ramotion.showroom" >
<img src="https://raw.githubusercontent.com/Ramotion/react-native-circle-menu/master/google_play@2x.png" width="104" height="34"></a>
<a href="https://ramotion.com/?utm_source=gthb&utm_medium=special&utm_campaign=paper-onboarding-contact-us/#Get_in_Touch"> 
<img src="https://github.com/ramotion/gliding-collection/raw/master/contact_our_team@2x.png" width="187" height="34"></a>
<br>
<br>
Follow us for the latest updates 
<br>

[![Twitter URL](https://img.shields.io/twitter/url/http/shields.io.svg?style=social)](https://twitter.com/intent/tweet?text=https://github.com/ramotion/paper-onboarding-android)
[![Twitter Follow](https://img.shields.io/twitter/follow/ramotion.svg?style=social)](https://twitter.com/ramotion)
