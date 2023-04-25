<template>
<div id="app">
    <nav>
      <div class="nav-wrapper blue darken-1">
        <a href="#" class="brand-logo center"><em>Front-end</em> de Produtos</a>
      </div>
    </nav>

    <div class="container">
      <form @submit.prevent="desabilitado ? incluir() : salvar()">
        <label>ID</label> 
        <input disabled name="nID" type="number" placeholder="ID" v-model="produto.id">
        
        <label>Descrição</label> 
        <input :disabled=desabilitado type="text" name="nDescricao" placeholder="Descrição" v-model="produto.descricao" required/>

        <label>Quantidade</label>
        <input :disabled=desabilitado type="number" name="nQuantidade" placeholder="Quantidade" v-model="produto.quantidade" required/>

        <label>Valor</label>
        <input :disabled=desabilitado type="number" name="nValor" placeholder="Valor" step="any" v-model="produto.valor" required/>
        
        <label>Data de compra</label>
        <input :disabled=desabilitado type="date" name="nDataCompra" placeholder="Data de compra" step="any" v-model="produto.dataCompra" required/>

        <button type="submit" class="waves-effect waves-light btn-small">
          {{ desabilitado ? 'Incluir' : 'Salvar' }}
          <i class="material-icons left">save</i>
        </button>
      </form>

      <table>
        <thead>
          <tr>
            <th>ID</th> 
            <th>Descrição</th> 
            <th>Quantidade</th>
            <th>Valor</th> 
            <th>Data de compra</th> 
            <th>Ações</th>
          </tr>
        </thead>
        <tbody>
          <tr v-for="produto of produtos.slice()" :key="produto.id">
            <td>{{ produto.id }}</td>
            <td>{{ produto.descricao }}</td>
            <td>{{ produto.quantidade }}</td>
            <td>{{ produto.valor.toLocaleString() }}</td>
            <td>{{ new Date(produto.dataCompra + 'T00:00:00').toLocaleDateString() }}</td>
            <td>
              <button @click="editar(produto)" class="waves-effect btn-small blue darken-1">
                <i class="material-icons">create</i>
              </button>

              <button @click="excluir(produto)" class="waves-effect btn-small red darken-1">
                <i class="material-icons">delete_sweep</i>
              </button>
            </td>
          </tr>
        </tbody>
      </table>
    </div>
  </div>
</template>

<script>
  import Produto from './services/produtos';

  export default {
    data() {
      return {
        produto: {
          id: '',
          descricao: '',
          quantidade: '',
          valor: '',
          dataCompra: ''
        },
        produtos: [],
        desabilitado: true,
      }
    },

    mounted() {
      this.listar();
    },

    methods: {
      listar() {
        Produto.listar()
          .then(resposta => {
            console.log(resposta);
            this.produtos = resposta.data;
          })
          .then( () => { this.limpar(true) } )
      },
      
      limpar(desabilitado = false) {
        this.produto = { };
        this.desabilitado = desabilitado;
      },

      incluir() {
        this.limpar();
      },

      editar(produto) {
        this.limpar();
        
        // Clona o objeto
        this.produto = Object.assign({}, produto);
      },

      excluir(produto) {
        if (confirm('Deseja mesmo excluir o produto?')) {
          Produto.excluir(produto)
            .then(() => {
              alert('Produto excluído com sucesso!');
              this.listar();
            });
        }
      },

      salvar() {
        if (!this.produto.id) {
          Produto.salvar(this.produto).
            then(() => {
              alert('Produto salvo com sucesso!');
              this.listar();
            });
        } else {
          Produto.alterar(this.produto).
            then(() => {
              alert('Produto alterado com sucesso!');
              this.listar();
            });
        }
      }
    }
  };
</script>

<style>

</style>
