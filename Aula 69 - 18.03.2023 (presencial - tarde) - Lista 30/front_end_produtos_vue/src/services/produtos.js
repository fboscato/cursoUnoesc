import { http } from './ws-axios';

export default {
    listar() {
        return http.get('produtos');
    },

    salvar(produto) {
        return http.post('produtos', produto);
    },

    alterar(produto) {
        return http.put('produtos/' + produto.id, produto);
    },

    excluir(produto) {
        return http.delete('produtos/' + produto.id);
    }
}