const express = require('express');
const bodyParser = require('body-parser');

const app = express();
const porta = 8080;

app.use(express.static('public'));
app.use(bodyParser.urlencoded({ extended: false }));

let texto1, resultado;

app.get('/processar_dados', function (req, res) {
    texto1 = (req.query['fTexto1']);

    processaRequisicao(res, texto1);
});

app.listen(porta,
    () => console.log(`Servidor iniciado: ${porta}`)
);

function processaRequisicao(res, texto1) {
    let msgAlert = 'A ordem inversa do texto informado é : ';
    resultado = texto1.split('').reverse().join('');


    msgAlert += resultado;
    let mensagem = `<h3><div class="alert alert-danger">${msgAlert}</div></h3>`;

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
            <button type="button" onclick="alert('${msgAlert}');" class="btn btn-primary">
                <i class="fab fa-js-square"></i></i>
                JavaScript
            </button>
        </div>
    `;
    res.send(HTML);
}