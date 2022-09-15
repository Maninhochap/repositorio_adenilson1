function soma() {
    var a = parseInt(document.getElementById("a").value);
    var b = parseInt(document.getElementById("b").value);
    var soma = a + b;
    document.getElementById("resultado").innerHTML = "Resultado = " + soma; 
    //alert("resultado = " + soma);
}
function soma2() {
    var a = parseInt(prompt("Informe um numero"));
    var b = parseInt(prompt("Informe outro numero"));
    var soma2 = a+b;
    alert("Soma = " + soma2);
}
function soma3(){
    var a = parseInt(document.getElementById("a").value);
    var b = parseInt(document.getElementById("b").value);
    var c = parseInt(document.getElementById("c").value);
    if(a > b && a > c){
        alert("O maior numero = " + a)
    }
    if (b > a && b > c) {
        alert("O maior numero = " + b)
    }
    if (c > a && c > b) {
        alert("O maior numero = " + c)
        
    }
    var soma3 = a + b + c;
    document.getElementById("resultado3").innerHTML = "Resultado3 = " + soma3; 
}

function ex2(){
    var a = parseInt(prompt("Informe sua idade"));
    if(a >= 18){
        alert("maior de idade");
    }else{
        alert("menor de idade")
    }
}

function ex3(){
    var peso = parseFloat(document.getElementById("peso").value);
    var altura = parseFloat(document.getElementById("altura").value);
    var imc = peso / (altura * altura);
    document.getElementById("imc").innerHTML = "Resultado = " + imc;
    }

