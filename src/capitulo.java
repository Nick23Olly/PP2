import java.util.Scanner;

public class capitulo {
   String título; //atributos do capítulo
   Personagem personagem;
   int alteracaoCoragem;
   String texto;
   String pergunta;
   String[] escolhas;
   Scanner escaneador;

   capitulo (String título, Personagem personagem, int alteracaoCoragem, 
   String texto, String pergunta, String[] escolhas, Scanner escaneador){ //construtor com parâmetros

    this.título = título;
    this.personagem = personagem;
    this.alteracaoCoragem = alteracaoCoragem;
    this.texto = texto;
    this.pergunta = pergunta;
    this.escolhas = escolhas;
    this.escaneador = escaneador;
    
}

    void mostrar (){ //método void sem retorno para mostrar as atribuições de e em cada cap.
        System.out.println("\n______________________________________\n");
        System.out.println(this.título);
        System.out.println("______________________________________\n\n");
        this.personagem.alterarCoragem(this.alteracaoCoragem);
        System.out.println(this.texto);  
        
        if (escolhas != null){
            for (String escolha : escolhas) {
                System.out.println("-" + escolha);
            }
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
                
                for (int i = 0; i < escolhas.length; i++) {
                    if (escolhaDigitada.equals(escolhas[i])){
                    idescolha = i;
                }
                }
            }}
        return idescolha;
    }}