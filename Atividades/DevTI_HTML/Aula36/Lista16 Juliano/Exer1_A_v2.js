const produtos = [
    { nome: 'Notebook Samsumg', preco: 4999.99, vendido: true, tipo: 'notebook' },
    { nome: 'Notebook Sony', preco: 5999.99, vendido: false, tipo: 'notebook' },
    { nome: 'iPad', preco: 6999.99, vendido: false, tipo: 'tablet' },
    { nome: 'iPhone', preco: 7999.99, vendido: true, tipo: 'smartphone' },
    { nome: 'Copo de plástico', preco: 1.99, vendido: false, tipo: 'copo' },
    { nome: 'Copo de vidro', preco: 10.99, vendido: true, tipo: 'copo' },
];

console.table(produtos);

const produtosMaior5000 = produtos.filter(function(produtosMaior5000) {
    return produtosMaior5000.preco > 5000;
});
console.log('Produtos com preço acima de R$5000,00', produtosMaior5000.map(function(produtosMaior5000) {
    return produtosMaior5000.nome;
}));
