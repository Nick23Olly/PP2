import java.util.Scanner;

public class capitulo {
   String título; //atributos do capítulo
   Personagem personagem;
   int alteracaoCoragem;
   String texto;
   String pergunta;
   String escolha1;
   String escolha2;
   Scanner escaneador;

   capitulo (String título, Personagem personagem, int alteracaoCoragem, 
   String texto, String pergunta, String escolha1, String escolha2, Scanner escaneador){ //construtor com parâmetros

    this.título = título;
    this.personagem = personagem;
    this.alteracaoCoragem = alteracaoCoragem;
    this.texto = texto;
    this.pergunta = pergunta;
    this.escolha1 = escolha1;
    this.escolha2 = escolha2;
    this.escaneador = escaneador;
    
}

    void mostrar (){ //método void sem retorno para mostrar as atribuições de e em cada cap.
        System.out.println("\n______________________________________\n");
        System.out.println(this.título);
        System.out.println("______________________________________\n\n");
        this.personagem.alterarCoragem(this.alteracaoCoragem);
        System.out.println(this.texto);     
    }

    int escolher (){
        int escolha = -1; //um valor para representar um caso de erro
        
        if(this.pergunta != null){
           while (escolha == -1){ //significa que se nenhuma escolha válida foi selecionada continua pedindo para seleconar uma escolha
            System.out.println(this.pergunta);
            if (escolha1 != null && escolha2 != null){
                System.out.println("-" + this.escolha1);
                System.out.println("-" + this.escolha2);
                String escolhaDigitada = escaneador.nextLine(); //capturar o que o usuário escolheu/escreveu
                System.out.println();
                
                if (escolhaDigitada.equals(escolha1)){
                    escolha = 1;
                }

                else if (escolhaDigitada.equals(escolha2)){
                    escolha = 2;
                }
                }
            }}
        return escolha;
    }
}