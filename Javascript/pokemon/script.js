const baseUrl = 'https://pokeapi.co/api/v2/pokemon/';

const buscaInput = getElement('.busca-input'),
      buscaButton = getElement('.busca-button'),
      container = getElement('.pokemon'),
      erroMenssage = getElement('.erro');

var pokeNome, pokemon, card;

function getElement(element) {
  return document.querySelector(element);
}

function solicitarInfoPoke(url, name) {
  fetch(url + name)
    .then(response => response.json())
    .then(data => {
      pokemon = data;
    })
    .catch(err => console.log(err));
}

function criarCard () {
  card = `
    <div class="pokemon-picture">
      <img src="${pokemon.sprites.front_default}" alt="Sprite of ${pokemon.name}">
    </div>
    <div class="pokemon-info">
        <h1 class="nome">Nome: ${pokemon.name}</h1>
        <h2 class="numero">Nº: ${pokemon.id}</h2>
        <h3 class="tipo">Tipo: ${pokemon.types.map(item => item.type.name).toString()}</h3>
        <h3 class="habilidades">Habilidades: ${pokemon.moves.map(item => ' ' + item.move.name).toString()}</h3>
        <h3 class="peso">Peso: ${pokemon.weight  / 10}kg</h3>
        <h3 class="altura">Altura: ${pokemon.height  / 10}m</h3>
    </div>`;
  return card;
}

function iniciar(pokeNome) {
  solicitarInfoPoke(baseUrl, pokeNome);

  setTimeout(function () {

    if(pokemon.detail) {
      erroMenssage.style.display = 'block';
      container.style.display = 'none';
    }else{
      erroMenssage.style.display = 'none';
      container.style.display = 'flex';
      container.innerHTML = criarCard();
    }
  }, 2000);
}

buscaButton.addEventListener('click', event => {
  event.preventDefault();
  pokeNome = buscaInput.value.toLowerCase();
  iniciar(pokeNome);
  container.classList.add('fade');

  setTimeout(() => {
    container.classList.remove('fade');
  }, 3000);
});