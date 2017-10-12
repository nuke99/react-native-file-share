
# react-native-file-share


![Gif](https://raw.githubusercontent.com/nuke99/react-native-file-share/master/anim.gif)


## Getting started

`$ npm install react-native-file-share --save`

### Mostly automatic installation

`$ react-native link react-native-file-share`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-file-share` and add `RNFileShare.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNFileShare.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

**Note: Please add the necessary permissions to the info.plist**
    - Privacy - Photo Library Additions Usage Description


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.reactlibrary.RNFileSharePackage;` to the imports at the top of the file
  - Add `new RNFileSharePackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-file-share'
  	project(':react-native-file-share').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-file-share/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-file-share')
  	```


## Usage
```javascript
import React, { Component } from 'react';
import {
  StyleSheet,
  View,
  Image,
  Button
} from 'react-native';

import RNFileShare from 'react-native-file-share'

export default class App extends Component<{}> {

  constructor() {
    super();
    this.state = {
      images : [
        '/full/path/to/img1.jpg',
        '/full/path/to/img2.jpg'
      ]
    }
  }

  shareImages() {
    RNFileShare.shareFiles(this.state.images);
  }
  
  render() {
    return (
      <View style={styles.container}>
       <Button onPress={this.shareImages} title="Share Images" />
      </View>
    );
  }
}

```
  