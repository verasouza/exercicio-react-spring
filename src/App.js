import React, { Component } from 'react';
import { library } from '@fortawesome/fontawesome-svg-core'
import { fab } from '@fortawesome/free-brands-svg-icons'
import { fas } from '@fortawesome/free-solid-svg-icons';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome'
import axios from 'axios';

library.add(fab, fas)

const api = axios.create({
    baseURL: 'http://localhost:8080/',
});

const usuario = "user"
const password = "dummy"

class App extends Component {
    state = {
        personagem: [],
        name: '',

    };

    handleClick = (e) => {

        //const { data: personagem } = await api.get('/api/characters' + "/?name=" + this.state.name);
    };

    /* loadPersonagem = () => {
        // e.preventDefault();

        fetch('/api/characters' + "/?name=" + "spider-man")
            .then(res => res.json())
            .then(res => {
                this.setState({ 
                    personagem: res || [] 
                })
            });
    
    }*/
    
    componentDidMount(){
        this.findCharacters();
    } 

    findCharacters(){
        axios.get("http://localhost:8080/api/characters/?name=captain america", { headers: { authorization: 'Basic ' + window.btoa(usuario + ":" + password) } })
            .then(response => response.data)
            .then((data) => {
                this.setState({ personagem: data.data.results });

            });

    }

  
    render() {
        return (
            <div className="container">
                <div className="jumbotron">
                    <h1><FontAwesomeIcon icon={['fas', 'database']} /> Marvel API</h1>
                    <p>Buscar informações dos heróis da Marvel</p>
                </div>
                <div className="row">
                    <div className="col-12 col-sm-6 col-md-8">
                        <div className="container">
                            <div className="input-group-append">
                                <input onInput={(e) => this.setState({ name: e.target.value })}
                                    id="nome"
                                    type="text"
                                    className="form-control"></input>
                                <button
                                    onClick={this.handleClick}
                                    className="btn btn-outline-secondary"
                                    type="submit" id="btn-search">
                                    <FontAwesomeIcon icon={['fas', 'search']} />
                                </button>
                            </div>
                            <ul>
                                {this.state.personagem.map(p => (
                                    <li key={p.id}>
                                        <strong>Nome: </strong>{p.name}
                                    </li>

                                ))}


                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        )
    }
}


export default App;