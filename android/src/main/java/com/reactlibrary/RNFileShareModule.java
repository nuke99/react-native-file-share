
package com.reactlibrary;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.io.File;
import java.util.ArrayList;

public class RNFileShareModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNFileShareModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNFileShare";
  }
  
}