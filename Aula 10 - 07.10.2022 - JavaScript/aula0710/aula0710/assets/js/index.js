/*console.log("Hello 'word'");
console.log('Quebra "linha"');
//comentário de uma linha 
console.log('Meu nome é Fran estudo Js às', 19, 'horas'); // posso concatenar valores

/* comentario de bloco  */


/*let nome; //declarou a variável
nome = "Franciele";
console.log(nome);
//não posso começar variáveis com números
//usar variáveis significativas
//não pode conter espaços e traços
//de preferencia começa com letra minúscula nomeSobrenome
//Js é case sensitive teste x TESTE
// Não utilize Var, utilize let 


const sobrenome =  "Petry";
console.log(sobrenome);*/
//não posso começar constantes com números
//usar variáveis significativas
//não pode conter espaços e traços
//utilizamos camelcase
// Não utilize Var, utilize const

/*const idade = 29;
const peso = 50;
const altura = 1.63; // constante não muda de valor
let indiceMassaCorporal; // variável muda de valor ao decorrer do tempo

indiceMassaCorporal = peso/(altura * altura)

console.log("IMC = ", indiceMassaCorporal)*/

/*const idade = 16;
if (idade >= 16 && idade < 18) {
	console.log("voto facultativo");
} */

/*let semaforo = "verde";

if (semaforo == "verde") {
    console.log("Pode passar");
} else if (semaforo == "vermelho") {
    console.log("Pare");
} else {
    console.log("Atenção");
} */

/*let username = "usuario123";
let password = "123456";

if (username == "usuario123" && password == "123456") {
    console.log("Usuário autenticado");
} else {
    console.log("Login e/ou senha incorrretos");
} */


 /*const count = 10;

if (count === 0) {
  console.log('Não tem estudantes');
} else if (count === 1) {
  console.log('Tem somente um estudante');
} else {
  console.log(`estamos em ${count} estudantes`);
} */

/*let condition = true; 

if (condition == true) {
	console.log('A condição é verdadeira');  
} else {
	console.log('A condição é falsa');  
} */


 /*const qtd = 12;
const texto = "Carrinho (qtd)";
console.log(texto); */

/*const qtd = 12;
const texto = `Carrinho (${qtd})`;
console.log(texto); */

/* Exercicios:

1) Dados dois números e informe qual é o menor e qual é o maior. (const ou let)*/

let num1 = 10
let num2 = 1

if (num1 > num2) {
  console.log(`O numero ${num1} é maior que o numero ${num2}`)
} else if (num1 < num2) {
  console.log(`O numero ${num2} é maior que o numero ${num1}`)
}

/*2) Dados 3 notas, informe a média. Se o aluno tirou acima de 7 
está com status de aprovado, menos de 4 status de reprovado, 4 a 6,99
em recuperação. (const ou let) */

const nota1 = 6
const nota2 = 6
const nota3 = 6
const media = (nota1+nota2+nota3)/3
if(media >=7){
console.log(`${media} aprovado`)

} else if(media <7 && media >=4){
    console.log(`${media} em recuperação`)
} else{
    console.log(`${media} reprovado`)
}
