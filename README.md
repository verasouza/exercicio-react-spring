## Exercício Spring Boot + ReactJS
- exercício para aprender a criar uma chamada API usando Spring Boot e ReactJS, essa é uma primeira tentativa visto que tinha conhecimentos limitados em ambas tecnologias

#### Ideia Geral
- Digitar na caixa de busca o nome de um personagem da Marvel(em inglês);
- Se existir dados na API, vai mostrar imagem, nome do personagem, breve descrição e botão que direciona para o site da Marvel. Se não existir não exibe nada.

#### Obter chaves de API MARVEL
- Se inscrever no https://developer.marvel.com/
- No arquivo _application-properties_ substituir o valor das variaveis pelas suas chaves:

  _apikey={private key}_

  _pkey={public key}_

#### Tecnologias
- Spring boot v2.2.6;
- ReatcJS 16.13.1 (Dependencias: fontawesome, axios, bootstrap, react-dom)
