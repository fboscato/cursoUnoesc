//comentario de uma linha
//comentario de mais de uma linha
//alert("Oi Juliano!");

//let email = prompt("Digite seu e-mail","");
//alert("O email " + email + " será usado para spam. :) é mentira");

//let notaStr = prompt("Qual a sua nota?","");
//let trabStr = prompt("Qual o valor do trabalho?","");
//let nota = parseFloat(notaStr,10); // parseInt
//let trab = parseFloat(trabStr,10);
//	 nota = nota + trab;
//  	 alert("Sua nota é: " + nota ); 

//let vegetariano = confirm("Você é vegetariano?");
//       if (vegetariano == true) {
//           alert("Coma mais proteínas vegetais");
//      }
//       else {
//           alert("Coma menos gordura");
//       } 

const form = document.querySelector('#formulario'); //antigamente usava-se o getElementById

form.addEventListener('submit', function (e) { //quero saber se o evento do submit ocorreu
  e.preventDefault();
  const nome = e.target.querySelector('#nome');


  const msg = `Seu Nome é ${nome.value} .`;
  
  setResultado(msg, true);
});

function criaP () {
  const p = document.createElement('p'); //função para criar paragrafo.. é opcional
  return p;
}

function setResultado (msg, isValid) {
  const resultado = document.querySelector('#resultado');
  resultado.innerHTML = '';

  const p = criaP();

  if (isValid) {
    p.classList.add('paragrafo-resultado');
  } else {
    p.classList.add('bad');
  }

  p.innerHTML = msg;
  resultado.appendChild(p);
} 
