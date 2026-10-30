# FIT TO FIT (Android)

Kotlin + Jetpack Compose fitness app. UI follows the poster: Profile, Daily Activity ring,
Weekly Progress bars, Workout card, Category tabs, Goal tracker, Achievements,
Exercise cards, Heart-rate widget, bottom navigation.

## Run
1. Android Studio (Koala or newer) -> Open -> select the `FitToFit` folder, let Gradle sync.
2. Run on a real phone (Bluetooth does not work in the emulator), Android 8.0+ (minSdk 26).

## Smartwatch (Bluetooth)
`BleHeartRateManager.kt` scans BLE devices and connects to the standard Heart Rate
service (0x180D). Works with any watch/band that exposes live heart rate over BLE
(turn on "heart rate broadcast / share heart rate" on the watch).

## Google Fit data
Google is retiring the Google Fit Android API; the official replacement is Health Connect.
`HealthConnectManager.kt` reads steps, distance, calories and heart rate from Health Connect,
which Google Fit and most watch apps sync into. Install "Health Connect" on Android 13 or
lower (built in on Android 14+), and in Google Fit enable sync to Health Connect.
Tap "Tap to sync Google Fit data" in the app to grant permission.

## Notes
- Workout, badges and exercise cards are static sample content for now.
- Before publishing on Play Store, Health Connect requires a privacy policy and a
  permissions declaration form.
