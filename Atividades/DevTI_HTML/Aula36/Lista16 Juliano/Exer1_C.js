const numeros = [1, 2, 3, 4, 5];

const produtorio = numeros.reduce(function(produtorio, numeros) {
    return produtorio * numeros;
});

console.log('Produtório dos números = ',produtorio);
