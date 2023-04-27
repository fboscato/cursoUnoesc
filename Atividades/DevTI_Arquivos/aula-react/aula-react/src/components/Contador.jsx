function Contador() {
  const [contador, setContador] = useState(0);

  function incrementar() {
    setContador(contador + 1);
  }

  return (
    <div>
      <h1>Contador</h1>
      <h2>{contador}</h2>
      <button onClick={incrementar}>Incrementar</button>
    </div>
  );
}