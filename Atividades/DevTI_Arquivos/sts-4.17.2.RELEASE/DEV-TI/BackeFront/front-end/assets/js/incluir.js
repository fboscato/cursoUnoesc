let idForm, descrForm, qtdForm, vlrForm;
const sURL = 'http://localhost:8080/api/produtos/';

window.onload = function (e) {
    idForm = document.querySelector('#iID');
    descrForm = document.querySelector('#iDescricao');
    qtdForm = document.querySelector('#iQuantidade');
    vlrForm = document.querySelector('#iValor');
};

async function incluirProduto() {
    const id = idForm.value;
    const descricao = descrForm.value; 
    const quantidade = qtdForm.value;
    const valor = vlrForm.value;

    axios.post(sURL, { id, descricao, quantidade, valor })
        .then(res => {
            res.data.toString = function() {
                return 'ID: ' + this.id + '\nDescrição: ' + this.descricao +
                    '\nQuantidade: ' + this.quantidade + '\nValor: ' + this.valor;
                }

            alert(res.data.toString());
            console.log(res.data);
            setTimeout(() => window.location.href = '/', 100);
        })
        .catch(res => console.log(res.response.data));
}