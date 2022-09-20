function validar(){
    var nome = document.getElementById("nome").value;
    var email = document.getElementById("email").value;
    var telefone = document.getElementById("telefone").value;
    var cpf = document.getElementById("cpf").value;
    var senha = document.getElementById("senha").value;
    var confirmSenha = document.getElementById("confirmSenha").value;
    
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
    if(!cpf){
        document.getElementById("erro").style.display = "block";
        document.getElementById("erro").innerHTML = "Preencha o campo CPF";
        document.getElementById("cpf").focus();
        return false;
    }
    if(!senha){
        document.getElementById("erro").style.display = "block";
        document.getElementById("erro").innerHTML = "Preencha o campo senha";
        document.getElementById("senha").focus();
        return false;
    }
    if(!confirmSenha){
        document.getElementById("erro").style.display = "block";
        document.getElementById("erro").innerHTML = "Preencha o campo confirmar senha";
        document.getElementById("confirmSenha").focus();
        return false;
    }
    if(senha != confirmSenha){
        document.getElementById("erro").style.display = "block";
        document.getElementById("erro").innerHTML = "Senhas diferentes";
        return false;
    }
}