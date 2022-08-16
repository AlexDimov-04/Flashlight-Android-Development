# Flashlight-Android-Development

The Flashlight (Torch) application is a basic mobile app to show the magnificent functionalities of the CameraManager in Android Studio. It shows you the possibilities and the magic that your hardware is capable of. 🌠🌪️ 

More about the topic: https://developer.android.com/reference/android/hardware/camera2/CameraManager 

# Look-through-steps-for-building-the-app

----------MainActivity.java----------

1) We use package com.example.flashlight and import the additional libraries for it and then create a Main Activity class declare 4 variables(layout, CameraManager, cameraid, boolean state=false(by default))

2) In the OnCreate() method we set a onClickListener and findViewById to sync the data between the declarations and the following lines of layout(code).

3) Then we set a public method (onClick) with the main activity that the flashlight can do (on/off) status.

4) We must initialize if and else statements to manage the state of the 4-th variable (Boolean-state=false) and with each click on the screen we change the state (if -> else / false off -> true on) working directly with the onClickListener to turn the flash on and off.

5) In the conditional statements we must add try and catch methods to define a block of code to be tested for errors while it is being executed (try) and define a block of code to be executed, if an error occurs in the try block (catch) where we handle only the CameraAccessExceptions, but we can also handle all exceptions to make the app more optimized and with less probability of errors.

----------activity_main.xml----------

MediaFire link for the (on/off) images of the flashlight - https://www.mediafire.com/folder/5l7r8djm3ue7i/flashlight
