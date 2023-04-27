import { useState } from 'react';
import './App.css';

function App() {
let arrayDaLista = useState(["Tarefa1" , "Tarefa2" , "Tarefa3" , "Tarefa4"]);
let lista = arrayDaLista[0];
console.log(lista);
let funcaoParaAtualizarLista = arrayDaLista[1];
funcaoParaAtualizarLista(["Tarefa1" , "Tarefa2" , "Tarefa3" , "Tarefa4" , "Tarefa5"]);
console.log(lista);
    return (
        <ul>
            <li>Tarefa 1</li>
            <li>Tarefa 2</li>
            <li>Tarefa 3</li>
            <li>Tarefa 4</li>
        </ul>
    );
    }

    export default App;