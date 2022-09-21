var score = "";
function addbola(){
    var bola = document.createElement("div");
    bola.setAttribute("class", "bola");
    //floor arredonda os numeros, pis não podem ser quebrados.
    var p1 = Math.floor(Math.random() * 900);
    var p2 = Math.floor(Math.random() * 600);

    bola.setAttribute("style", "left:" + p1 + "px; top:" + p2 + "px;");
    bola.setAttribute("onclick", "estourar(this)");
    document.body.appendChild(bola);
}
function estourar(el) {
    var del = document.body.removeChild(el);
    if(del){
        score++;
        document.getElementById("score").innerHTML = "<h2>Pontos: " + score + "</h2>"
    }
}
function iniciar(){
    setInterval(addbola,1000);
    
}