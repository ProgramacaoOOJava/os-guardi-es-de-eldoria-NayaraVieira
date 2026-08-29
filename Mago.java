//subclass
public class Mago extends Personagem {
    double inteligencia;
///////////////String nome, int nivel, int pontosDeVida, double poderBase, double forca
    public Mago(String nome, int nivel, int pontosDeVida, double poderBase, double inteligencia) {
        super(nome, "Mago", nivel, pontosDeVida, poderBase);
        this.inteligencia = inteligencia;
    }
    @Override
    public void usarHabilidadeEspecial() {
        System.out.println("O Mago usa sua habilidade especial: Bola de Fogo!");
    }

}