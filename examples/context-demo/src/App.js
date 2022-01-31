import logo from './logo.svg';
import './App.css';
import React from 'react';
import ThemedButton from './themed-button';
import { ThemeContext, themes } from './theme-context';

function Page(){
  return(
    <div>
<h1>Welcome to page.</h1>
    </div>
  );
}

function Section(){
  return(
    <div>
      <h2>Welcome to section.</h2>
    </div>
  );
}

function Toolbar(props){
  return(
    <ThemedButton onClick={props.changeTheme}>
      ChangeTheme
    </ThemedButton>
  );
}

class App extends React.Component{
  constructor(props){
    super(props);
    this.state = {theme:themes.light};

  this.toggleTheme = () =>{
    this.setState(state => (
      {theme:state.theme === themes.dark ? themes.light: themes.dark}
    ));
  };
}

  render(){
    return(
      <div>
        <ThemeContext.Provider value={this.state.theme} >
            <Toolbar changeTheme={this.toggleTheme}/>
        </ThemeContext.Provider>        
        <ThemedButton />        
      </div>
    );
  };
}
export default App;
