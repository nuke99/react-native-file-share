
# react-native-file-share

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

#### Windows
[Read it! :D](https://github.com/ReactWindows/react-native)

1. In Visual Studio add the `RNFileShare.sln` in `node_modules/react-native-file-share/windows/RNFileShare.sln` folder to their solution, reference from their app.
2. Open up your `MainPage.cs` app
  - Add `using File.Share.RNFileShare;` to the usings at the top of the file
  - Add `new RNFileSharePackage()` to the `List<IReactPackage>` returned by the `Packages` method


## Usage
```javascript
import RNFileShare from 'react-native-file-share';

// TODO: What to do with the module?
RNFileShare;
```
  