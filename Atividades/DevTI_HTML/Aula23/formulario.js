const formulario = document.getElementById('formulario');

formulario.addEventListener('submit', function (e) {
    e.preventDefault();
});

// validar senha informada
function validarSenha() {
    var senha = document.getElementById("senha").value;
    var confirmarSenha = document.getElementById("confirmarSenha").value;
    if (senha != confirmarSenha) {
        alert("Senhas não conferem!");
        return false;
    }
    return true;
}
