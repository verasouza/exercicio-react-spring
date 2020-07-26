import React, { Component } from 'react';
import { Card, Button } from 'react-bootstrap';



export default class InfoCharacter extends Component {

    render() {
        const personagem = this.props.personagem;



        const myStyle = {
            maxWidth: 535,
            marginBottom: 30


        }
        const media = {
            height: "25rem",

        }

        return (
            personagem.length === 0 ? 
            <div>Nada para mostrar</div>

            :
            personagem.map(p => (
                <Card key={p.id} style={myStyle}>

                    <Card.Img style={media} variante="top" src={p.thumbnail.path + ".jpg"} />

                    <Card.Body >
                        <Card.Title>{p.name}</Card.Title>
                        <Card.Text>
                            {p.description}
                        </Card.Text>
                        
                        {p.urls.map(u => u.type === 'wiki' ?
                         <Button href={u.url} variant="primary">Wiki</Button>
                         :  null  )             

                                      
                        
                        }
                    </Card.Body>
                </Card>

            ))


            

           
           


        )
    }

}