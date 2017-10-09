
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
  
  @ReactMethod
  public void ShareImage(){
    Intent share = new Intent(Intent.ACTION_SEND_MULTIPLE);

    File path = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)+ "/Cat.jpg");
    File path2 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)+ "/Dog.jpg");

    Uri uri = Uri.fromFile(path);
    Uri uri2 = Uri.fromFile(path2);

    ArrayList<Uri> mylist = new ArrayList<Uri>();
    mylist.add(uri);
    mylist.add(uri2);

    Intent shareIntent = new Intent();
    shareIntent.setAction(Intent.ACTION_SEND_MULTIPLE);
    shareIntent.putParcelableArrayListExtra(Intent.EXTRA_STREAM, mylist);
    shareIntent.setType("image/*");
    getCurrentActivity().startActivity(Intent.createChooser(shareIntent, "Share images to.."));

  }



}