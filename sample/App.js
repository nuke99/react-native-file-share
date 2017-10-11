/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, { Component } from 'react';
import {
  Platform,
  StyleSheet,
  Text,
  View,
  Image,
  Button
} from 'react-native';

import RNFileShare from 'react-native-file-share';

// const instructions = Platform.select({
//   ios: 'Press Cmd+R to reload,\n' +
//     'Cmd+D or shake for dev menu',
//   android: 'Double tap R on your keyboard to reload,\n' +
//     'Shake or press menu button for dev menu',
// });

export default class App extends Component<{}> {

  constructor() {
    super();
    this.state = {
      images : [
        './assets/img1.jpg',
        './assets/img2.jpg'
      ]
    }
  }

  shareImages() {

  }


  render() {
    return (
      <View style={styles.container}>
        <Image source={require('./assets/img1.jpg')} style={styles.image} />
        <Image source={require('./assets/img2.jpg')} style={styles.image} />

        <Button title="Share Images" />
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F5FCFF',
  },
  image : {
    width:200,
    height:100,
    margin:10
  },
 
 
});
