function dentro(){
  document.getElementById("meuInput").style.background= "red";
}
function fora(){
  document.getElementById("meuInput").style.background= "blue";
}

function myFunction() {
  var x = document.getElementById('mySelect').value
  if (x == 'Audi') {
    var valor = 160000
    document.getElementById('demo').innerHTML =
      'Você selecionou ' + x + ' R$: ' + valor
  }
  if (x == 'BMW') {
    var valor = 200000
    document.getElementById('demo').innerHTML =
      'Você selecionou ' + x + ' R$: ' + valor
  }
  if (x == 'Mercedes') {
    var valor = 180000
    document.getElementById('demo').innerHTML =
      'Você selecionou ' + x + ' R$: ' + valor
  }
  if (x == 'Volvo') {
    var valor = 140000
    document.getElementById('demo').innerHTML =
      'Você selecionou ' + x + ' R$: ' + valor
  }
}

function GetChar (event){
  var chCode = ('charCode' in event) ? event.charCode : event.keyCode;
  alert ("O código deste caractere é: " + chCode);
}


function detecta(event)
{
    var tecla = event.key;
    if (tecla == "a")
     alert ("Você apertou 'a'");
 if (tecla == "e")
     alert ("Você apertou 'e'");
 if (tecla == "i")
     alert ("Você apertou 'i'");
 if (tecla == "o")
     alert ("Você apertou 'o'");
 if (tecla == "u")
     alert ("Você apertou 'u'");
}

function imagemCarregada() {
  alert("Imagem completamente carregada!");
}

function mouseOver () {
  document.getElementById("exemplo").innerHTML = "Evento onmouseover quando o usuário passa o mouse em cima";
}

function mouseOut () {
  document.getElementById("exemplo").innerHTML = "Evento onmouseout quando retira o mouse";
}


function Geeks() {
  alert("Formulário enviado com sucesso.") ;
}
