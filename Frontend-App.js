import React, { Component } from 'react';
import './App.css';
class App extends Component {
state = {
clients: []
 };
 async componentDidMount() {
    const response = await fetch('/clients');
    const body = await response.json();
 this.setState({clients: body});
 }
 render() {
 const {clients} = this.state;
 return (
 <div className="App">
 <header className="App-header">

 <div className="App-intro">
 <h2>Clients</h2>
 {clients.map(client =>
 <div key={client.id}>
 {client.name} {client.lastname}({client.email}){client.area}
 </div>
 )}
 </div>
 </header>
 </div>
 );
 }
}
export default App;
