import React, { Component } from 'react';
import { Jumbotron, Row } from 'react-bootstrap';
import InfoCharacter from './InfoCharacter';
import { library } from '@fortawesome/fontawesome-svg-core'
import { fab } from '@fortawesome/free-brands-svg-icons'
import { fas } from '@fortawesome/free-solid-svg-icons';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';

library.add(fab, fas)


export default class Welcome extends Component {

    render() {
        return (
            
                <Jumbotron className="bg-dark text-white">

                    <h1><FontAwesomeIcon icon={['fas', 'database']} /> Marvel API</h1>
                    <p>Buscar informações dos heróis da Marvel</p>

                </Jumbotron>
                

               
            
        )
    }
}

