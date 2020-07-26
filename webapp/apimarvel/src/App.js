import React, { Component } from 'react';
import NavigationBar from './components/NavigationBar';
import Welcome from './components/welcome';
import Footer from './components/Footer';
import About from './components/About';
import { Container, Row, Col, InputGroup, FormControl, Button } from 'react-bootstrap';
import { BrowserRouter as Router, Switch, Route } from 'react-router-dom';
import { library } from '@fortawesome/fontawesome-svg-core'
import { fab } from '@fortawesome/free-brands-svg-icons'
import { fas } from '@fortawesome/free-solid-svg-icons';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';
import './App.css';
import InfoCharacter from './components/InfoCharacter';
import axios from 'axios';

library.add(fab, fas)

const api = axios.create({
  baseURL: 'http://localhost:8080/',
});

const usuario = "user"
const password = "dummy"

const headers = {
  'headers': {
    authorization: 'Basic ' + window.btoa(usuario + ":" + password)
  }
}


class App extends Component {
  state = {
    personagem: [],
    name: '',
  };

  findCharacters = () => {
    axios.get('api/characters/?name=' + this.state.name, headers)
      .then(response => response.data)
      .then((data) => {
        this.setState({ personagem: data.data.results });
      });
  }

  inputChange = (event) => {
    this.setState({
      [event.target.name]: event.target.value
    });
  }

  submitName = (e) => {
    const name = this.state.name;
    this.findCharacters()
    //e.preventDefault();
  }

  render() {
    

    const marginTop = {
      marginTop: 20
    }
    return (
      <Router>
        <NavigationBar />
        <Container>
          <Row>
            <Col lg={12} style={marginTop}>
              <Switch>
                <Route path="/" exact component={Welcome} />
                <Route path="/about" exact component={About} />
              </Switch>

              <Row>
                <Col xs={12} md={8} sm={6}>
                  <Container>
                    <InputGroup className="mb-3">
                      <FormControl
                        name="name"
                        value={this.state.name}
                        onChange={this.inputChange}
                        placeholder="nome personagem"

                      />
                      <InputGroup.Append>
                        <Button onClick={() => this.submitName(this.state.name)} variant="dark" type="submit"><FontAwesomeIcon icon={['fas', 'search']} /></Button>
                      </InputGroup.Append>
                    </InputGroup>
                    <InfoCharacter 
                    key={this.state.personagem.id}
                    personagem={this.state.personagem}/>
                  </Container>
                </Col>
              </Row>

            </Col>
          </Row>
        </Container>
        <Footer />
      </Router>
    );

  }


}

export default App;
