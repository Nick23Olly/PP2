public class Personagem{
String nome;
int coragem;

Personagem(String nome, int coragem){
    this.nome = nome;
    this.coragem = coragem;
}

void alterarCoragem(int alteracao){
    this.coragem += alteracao;

    if (this.coragem > 100){
        this.coragem = 100;
    }

    if (this.coragem < 0){
        this.coragem = 0;
        System.out.println(this.nome + " perdeu toda a sua coragem\n");
    }

    if (this.coragem > 0){
        System.out.println(this.nome + " ganhou " + alteracao + " de coragem\n");
    }
    //else {
    // System.out.println(this.nome + " perdeu coragem\n");
    //}
}
}