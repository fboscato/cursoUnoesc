const carrinho = [
    '{ "nome": "Borracha", "preco": 3.45 }',
    '{ "nome": "Caderno", "preco": 13.90 }',
    '{ "nome": "Lápis", "preco": 2.5 }',
    '{ "nome": "Caneta", "preco": 7.5 }',
];

const produtos = json => JSON.parse(json);
const Preco = produto => produto.preco;

const resultado = carrinho.map(produtos).map(Preco);
console.log(resultado);
