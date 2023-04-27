const alunos = [
    { nome: 'Fulana', nota: 7.3, bolsista: false },
    { nome: 'Beltrana', nota: 9.2, bolsista: true },
    { nome: 'Sicrana', nota: 9.8, bolsista: false },
    { nome: 'Maria das Dores', nota: 8.7, bolsista: true },
];

//somar notas
const somarNotas = (resultado, aluno) => resultado + aluno.nota;
console.log(alunos.map(a => a.nota).reduce(somarNotas));

//Retorna true ou false
const todosBolsistas = (resultado, bolsista) => resultado && bolsista;
console.log(alunos.map(a => a.bolsista).reduce(todosBolsistas));

//Retorna true ou false
const bolsa = (resultado, bolsa) => resultado || bolsa;
console.log(alunos.map(a => a.bolsista).reduce(bolsa));
