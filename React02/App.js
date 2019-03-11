import React from 'react';
import { StyleSheet, Text, View,Image } from 'react-native';

export default class App extends React.Component {
  render() {

    img= {uri:'https://pokemonletsgo.pokemon.com/assets/img/common/char-eevee.png',
    width: 100,
    height : 150,

  };
    return (
      <View style={styles.container}>
        <Text>Evee</Text>
         <Image source={img} />
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});
