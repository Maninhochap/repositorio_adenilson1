package almeida.adenilson.uno.desenvolvedoresemti;

public class PerguntasRespostas {

   public PerguntasRespostas(){

   }

    public String pergunta2(){
        return ("2- Cite pelo menos 3 situações onde a referência “this” pode ser" +
                "usada. E onde não pode ser usada?");
    }

    public String resposta2(){
        return ("É usado quando o nome de um parâmetro for igual ao nome de um atributo da classe, " +
                "usado para indicar que o escopo pretendido para a invocação de um método ou acesso" +
                "a um atributo é o do próprio objeto corrente. Também utilizado para fazer " +
                "referência a um outro construtor da mesma classe. É usado ainda como forma de " +
                "refereir a instância que encapsula a instância corrente quando em uma classe " +
                "aninhada. Se eu coloco o 'this' função fora do (onCreate), a coisa muda e a " +
                "seguinte função não funciona. o compilador não aceita esse 'this' pois ele " +
                "não acha o onCreate.");
    }

    public String pergunta3(){
        return ("3- Quais detalhes importantes podem ser observados na" +
                "declaração de uma classe Java?");
    }

    public String resposta3(){
        return ("A palavra (class) é usada pois é como declaramos uma classe, o corpo da classe" +
                "onde é escrito os métodos e construtores é especificado dentro de um par de {}. " +
                "E a palavra que nomeia a classe sempre começa com letra maiúscula.");
    }

    public String pergunta4(){
        return ("4- Explique o conceito de escopo presente na linguagem Java?");
    }

    public String resposta4(){
        return ("Escopo é a acessibilidade de objetos, variáveis e funções em diferentes partes" +
                " do código. Em outras palavras, o que determina quais são os dados que podem ser" +
                " acessados em uma determinada parte do código é o escopo.");
    }

    public String pergunta5(){
        return ("5- Como funciona a sobrecarga (overload) de métodos no Java?");
    }

    public String resposta5(){
        return ("A sobrecarga (overload) consiste em permitir, dentro da mesma classe, mais de " +
                "um método com o mesmo nome, eles necessariamente devem possuir " +
                "argumentos diferentes para funcionar.");
    }

    public String pergunta6(){
        return ("6- Explique o conceito de cast. Quais os tipos existentes?");
    }

    public String resposta6(){
        return ("O cast é uma conversão, é quando convertemos um valor de um tipo para " +
                "outro tipo. Basicamente existem dois tipos de conversão(Cast), as " +
                "conversões explicitas e implícitas.");
    }
}
