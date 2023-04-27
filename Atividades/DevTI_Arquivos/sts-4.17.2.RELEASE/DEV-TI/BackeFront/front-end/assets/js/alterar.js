let id, idForm, descrForm, qtdForm, vlrForm;
const sURL = 'http://localhost:8080/api/produtos/';

window.onload = async function (e) {
    const query = window.location.search;
    const parametros = new URLSearchParams(query);
    id = parametros.get('id');

    idForm = document.querySelector('#iID');
    descrForm = document.querySelector('#iDescricao');
    qtdForm = document.querySelector('#iQuantidade');
    vlrForm = document.querySelector('#iValor');

    const produto = await buscarProduto(id);
    preencherForm(produto);
};

function preencherForm(produto) {
    idForm.value = produto.id;
    descrForm.value = produto.descricao;
    qtdForm.value = produto.quantidade;
    vlrForm.value = produto.valor;
}

async function buscarProduto(id) {
    const resposta = await axios.get(sURL + id);

    return resposta.data;
}

async function alterarProduto() {
    const id = idForm.value;
    const descricao = descrForm.value; 
    const quantidade = qtdForm.value;
    const valor = vlrForm.value;

    axios.put(sURL, { id, descricao, quantidade, valor })
        .then(res => {
            alert(JSON.stringify(res.data));
            console.log(res.data);
            setTimeout(() => window.location.href = '/', 100);
        })
        .catch(res => console.log(res.response.data));
}