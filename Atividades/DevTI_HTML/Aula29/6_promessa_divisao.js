let log = console.log;

function dividir(a,b) {
    return a/b;
}

log('Divisão de 10 por 2: ', dividir(10,2));
log('Divisão de 10 por 0: ', dividir(10,0));
log('Divisão de 0 por 0: ', dividir(0,0));
log('');


function promessaDivisao(num,den) {
    return new Promise((resolve, reject) => {
        if (den == 0) {
            reject (new Error('Não é possível dividir por zero'));
            return;
        } 
        resolve(num/den);
    });
}
log(promessaDivisao(10,0).then(function (resultado) {
    log('Sucesso: ' + resultado);
}).catch(function (erro) {
    log('Erro na divisão!');
    log(erro);
}));
