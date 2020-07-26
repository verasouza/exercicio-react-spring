import React from 'react';
import {Navbar, Nav} from 'react-bootstrap';
import {Link} from 'react-router-dom';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';

class NavigationBar extends React.Component{

    render(){
        return(
            <Navbar bg="dark" variant="dark" className="text-white">
                <Link to={""} className="navbar-brand">
                <FontAwesomeIcon icon={['fas', 'home']} /> Home
                </Link>
                <Nav className="mr-auto">
                    <Link to={"about"} className="nav-link">About</Link>
                </Nav>

            </Navbar>
        )
    }
}

export default NavigationBar;