const express = require('express');
const cors = require('cors');
const formData = require('express-form-data');
const { request, response } = require('express');

const app = express();
const porta = 8081;

app.use(cors({ origin: '*' }));

app.use(express.urlencoded({ extended: true }));
app.use(express.json());

app.use(formData.parse());

app.use('/api/usuarios', require('./rotas'));

app.get('/',(request, response) => {
    response.status(200).send('Página home');
    });

app.listen(porta, () => {
    console.log(`Servidor rodando na porta ${porta}`);
});