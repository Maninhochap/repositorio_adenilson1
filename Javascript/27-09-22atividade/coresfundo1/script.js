function mudar_cor_de_fundo(){
  // lê o valor de cor escolhido pelo usuário.
  var cor = document.getElementById("seletor_de_cores").value;
  // muda a formatação CSS do <body> background para a cor escolhida
  document.getElementById("pagina").style.backgroundColor = cor;
  // opcional: escreve na página a cor escolhida
  document.getElementById("cor_escolhida").innerHTML = "A Cor escolhida é "+ cor;
  }