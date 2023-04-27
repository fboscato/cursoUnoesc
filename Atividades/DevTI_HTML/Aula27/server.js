const express = require('express');
const bodyParser = require('body-parser');

const app = express();
const porta = 9090;

app.listen(porta,
    function () {
        return console.log(`Servidor rodando na porta ${porta}`);
    }
);

app.get('/acessar', function (req, res) {
    let email, senha;

    email = req.query['fEmail'];
    senha = req.query['fSenha'];
    processarAcesso(res, email, senha);
});

function processarAcesso(res, email, senha) {

    const dados = {
        usuarios: [
            { email: 'juliano.pilger@gmail.com', senha: '1234' },
            { email: 'juliano.pilger@gmail.com.br', senha: '12345' },
        ]
    };
    for (let i = 0; i < dados.usuarios.length; i++) {
        if ((email == dados.usuarios[i].email) && (senha == dados.usuarios[i].senha)) {
            msgAlert = ('Acesso permitido!');
            break;
        } else {
            msgAlert = ('Acesso negado!!!');
        }
        resposta(res, msgAlert);
    }
}

function resposta(res, mensagem) {

    HTML = `
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" 
    rel="stylesheet">
<link rel="stylesheet" 
    href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" 
    crossorigin="anonymous">

<div class="container" style="margin-top: 0.5rem">
    ${mensagem}

    <button type="button" onclick="window.history.back()" class="btn btn-outline-danger">
        <i class="fas fa-door-open"></i>
        Voltar
    </button>
    &nbsp
</div>
`;
    res.send(HTML);

}