# Laduma Toolkit - Final Android Build Project

This is the corrected Android Studio project for the Laduma Toolkit.

## Build

1. Install Android Studio with Android SDK Platform 35 and Android SDK Build-Tools.
2. Open this folder in Android Studio.
3. Allow Gradle to sync.
4. Select **Build > Build APK(s)**.
5. The debug APK will be under:
   `app/build/outputs/apk/debug/app-debug.apk`

## Install

Copy `app-debug.apk` to the Android phone, open it, and allow installation from the source you used if Android asks.

For USB installation from Android Studio, connect the phone with USB debugging enabled and press Run.

## Android integration

- Camera capture is routed through the Android camera app.
- Gallery selection uses Android's document picker and supports multiple images.
- WebView DOM storage is enabled for the offline app data used by the supplied UI.
- App data is local to the device.
- Android back navigation is handled.
- FileProvider is used for secure camera image output.
- Room dependencies are included for native structured storage migration.

## Important

The supplied UI is preserved as the application front end. The app does not require an internet connection for its local toolkit data.
