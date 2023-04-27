// funcao par ou impar

// 1 - (A) _____________________________________________________________

function parOuImpar(numero) {
    if (numero % 2 == 0) {
        console.log(`O número ${numero} é par`);
    } else {
        console.log(`O número ${numero} é impar`);
    }
}
parOuImpar(5);

// 1 - (B) _____________________________________________________________

let parOuImpar2 = (numero) => {
    if (numero % 2 == 0) {
        console.log(`O número ${numero} é par`);
    } else {
        console.log(`O número ${numero} é impar`);
    }
}
parOuImpar2(18);

// 1 - (C) _____________________________________________________________

let parOuImpar3 = numero => numero % 2 == 0 ? `O número ${numero} é par` : `O número ${numero} é impar`;{
    console.log(parOuImpar3(13));
}