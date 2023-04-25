const roteador = require('express').Router();
const { PrismaClient } = require('@prisma/client');

const {Usuario} = new PrismaClient();

roteador.get('/', async (req, res) => {
    const {nome, email} = req.body;

    try {
        let usuario = await Usuario.findUnique({ where: { email } });
        if (usuario) {
            return res.status(401).json({ erro: 'Usuário já cadastrado' });
        }
        usuario = await Usuario.create({ data: { nome, email } });

        res.status(200).json({ mensagem: 'Usuário incluído com sucesso!', usuario });
    } catch (error) {
        res.json(error);
    }
});

module.exports = roteador;