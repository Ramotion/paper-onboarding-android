<a href="https://www.ramotion.com/agency/app-development/?utm_source=gthb&utm_medium=repo&utm_campaign=paper-onboarding-android"><img src="https://github.com/Ramotion/folding-cell/blob/master/header.png"></a>

<a href="https://github.com/Ramotion/paper-onboarding-android">
<img align="left" src="https://github.com/Ramotion/paper-onboarding-android/blob/master/onboarding_preview.gif" width="480" height="360" /></a>

<p><h1 align="left">PAPER ONBOARDING</h1></p>

<h4>Android library Paper Onboarding is a material design UI slider written on Java</h4>


___


<p><h6>We specialize in the designing and coding of custom UI for Mobile Apps and Websites.</h6>
<a href="https://www.ramotion.com/agency/app-development/?utm_source=gthb&utm_medium=repo&utm_campaign=paper-onboarding-android">
<img src="https://github.com/ramotion/gliding-collection/raw/master/contact_our_team@2x.png" width="187" height="34"></a>
</p>
<p><h6>Stay tuned for the latest updates:</h6>
<a href="https://goo.gl/rPFpid" >
<img src="https://i.imgur.com/ziSqeSo.png/" width="156" height="28"></a></p>

</br>

[![CircleCI](https://circleci.com/gh/Ramotion/paper-onboarding-android.svg?style=svg)](https://circleci.com/gh/Ramotion/paper-onboarding-android)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/ed1eb5c89dfc45eabb80e93c6a124012)](https://www.codacy.com/app/Ramotion/paper-onboarding-android?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=ramotion/paper-onboarding-android&amp;utm_campaign=Badge_Grade)
[![Twitter](https://img.shields.io/badge/Twitter-@Ramotion-blue.svg?style=flat)](http://twitter.com/Ramotion)
[![Donate](https://img.shields.io/badge/Donate-PayPal-blue.svg)](https://paypal.me/Ramotion)

## Requirements
​
- Android 4.0.3 IceCreamSandwich (API lvl 15) or greater
- Your favorite IDE

## Installation
​
Just download the package from [here](http://central.maven.org/maven2/com/ramotion/paperonboarding/paper-onboarding/1.1.3/paper-onboarding-1.1.3.aar) and add it to your project classpath, or just use the maven repo:
​
Gradle:
```groovy
'com.ramotion.paperonboarding:paper-onboarding:1.1.3'
```
SBT:
```scala
libraryDependencies += "com.ramotion.paperonboarding" % "paper-onboarding" % "1.1.3"
```
Maven:
```xml
<dependency>
    <groupId>com.ramotion.paperonboarding</groupId>
    <artifactId>paper-onboarding</artifactId>
    <version>1.1.3</version>
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

<br>

## 🗂 Check this library on other language:
<a href="https://github.com/Ramotion/paper-onboarding"> 
<img src="https://github.com/ramotion/navigation-stack/raw/master/Swift@2x.png" width="178" height="81"></a>


## 📄 License

Paper Onboarding Android is released under the MIT license.
See [LICENSE](./LICENSE) for details.

This library is a part of a <a href="https://github.com/Ramotion/android-ui-animation-components-and-libraries"><b>selection of our best UI open-source projects</b></a>

If you use the open-source library in your project, please make sure to credit and backlink to www.ramotion.com

## 📱 Get the Showroom App for Android to give it a try
Try this UI component and more like this in our Android app. Contact us if interested.

<a href="https://play.google.com/store/apps/details?id=com.ramotion.showroom" >
<img src="https://raw.githubusercontent.com/Ramotion/react-native-circle-menu/master/google_play@2x.png" width="104" height="34"></a>

<a href="https://www.ramotion.com/agency/app-development/?utm_source=gthb&utm_medium=repo&utm_campaign=paper-onboarding-android">
<img src="https://github.com/ramotion/gliding-collection/raw/master/contact_our_team@2x.png" width="187" height="34"></a>
