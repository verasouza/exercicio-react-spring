/* import React, {Components} from 'react';
import axios from 'axios';

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

findCharacters = (e) => {
    axios.get(api + 'api/characters/${e}', headers)
    .then(response => console.log(response.data));
}

export default springservices; */