function validar(){
    var nome = document.getElementById("nome").value;
    var email = document.getElementById("email").value;
    var telefone = document.getElementById("telefone").value;
    var cnpj = document.getElementById("cnpj").value;
    var cep = document.getElementById("cep").value;
    
    if(!nome){
        document.getElementById("erro").style.display = "block";
        document.getElementById("erro").innerHTML = "Preencha o campo nome";
        document.getElementById("nome").focus();
        return false;
    }
    if(!email){
        document.getElementById("erro").style.display = "block";
        document.getElementById("erro").innerHTML = "Preencha o campo email";
        document.getElementById("email").focus();
        return false;
    }
    if(!telefone){
        document.getElementById("erro").style.display = "block";
        document.getElementById("erro").innerHTML = "Preencha o campo telefone";
        document.getElementById("telefone").focus();
        return false;
    }
    if(!cnpj){
        document.getElementById("erro").style.display = "block";
        document.getElementById("erro").innerHTML = "Preencha o campo CNPJ";
        document.getElementById("cnpj").focus();
        return false;
    }
    if(!cep){
        document.getElementById("erro").style.display = "block";
        document.getElementById("erro").innerHTML = "Preencha o campo CEP";
        document.getElementById("cep").focus();
        return false;
    }
}