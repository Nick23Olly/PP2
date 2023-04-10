import java.util.ArrayList;
import java.util.Scanner;

public class capitulo {
   String título; //atributos do capítulo
   Personagem personagem;
   int alteracaoCoragem;
   String texto;
   String pergunta;
   ArrayList<Escolha> escolhas;
   Scanner escaneador;

   capitulo (String título, Personagem personagem, int alteracaoCoragem, 
   String texto, String pergunta, Scanner escaneador){ //construtor com parâmetros

    this.título = título;
    this.personagem = personagem;
    this.alteracaoCoragem = alteracaoCoragem;
    this.texto = texto;
    this.pergunta = pergunta;
    this.escaneador = escaneador;
    this.escolhas = new ArrayList<Escolha>();   
}

    void mostrar (){ //método void sem retorno para mostrar as atribuições de e em cada cap.
        System.out.println("\n______________________________________\n");
        System.out.println(this.título);
        System.out.println("______________________________________\n\n");
        this.personagem.alterarCoragem(this.alteracaoCoragem);
        System.out.println(this.texto);  
        
        if (this.escolhas.size() != 0){ //se tiver escolhas elas seram mostradas
            for (Escolha escolha : escolhas) {
                System.out.println("-" + escolha.texto);
            }
            int idEscolha = escolher (); //e irá executar o método escolher. ele irá retornar um id de uma escolha
            this.escolhas.get(idEscolha).proximo.mostrar(); //o id é capturado, a escolha é acessada pega o cap para qual ela aponta e pede para
            } 
        System.out.println();
    }

    int escolher (){
        int idescolha = -1; //um valor para representar um caso de erro
        
          if (escolhas != null){  
           while (idescolha == -1){ //significa que se nenhuma escolha válida foi selecionada continua pedindo para seleconar uma escolha
            System.out.println(this.pergunta);
            String escolhaDigitada = escaneador.nextLine(); //capturar o que o usuário escolheu/escreveu
            System.out.println();
                
                for (int i = 0; i < escolhas.size(); i++) {
                    if (escolhaDigitada.equals(escolhas.get(i).texto)){ // get (i) é ppelo fato de usar-se arraylist então para acessar a posição usamos ele e.texto para comparar a escolha digitada com o texto da escolha que está lá
                    idescolha = i;
                }
                }
            }}
        return idescolha;
    }
}