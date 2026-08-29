import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {
            //criando instâncias de guerreiro e mago
            Guerreiro arthus = new Guerreiro("Arthus", 10, 85, 100.0, 10.0);
            Mago lyrenna = new Mago("Lyrenna", 19, 95, 80.0, 15.0);

            //exibindo status
            arthus.exibirStatus();
            lyrenna.exibirStatus();

            //usando habilidades especiais
            arthus.usarHabilidadeEspecial();
            lyrenna.usarHabilidadeEspecial();

            System.out.println("\n---Demonstrando polimorfismo---");
            List<Personagem> herois = new ArrayList<>();
            herois.add(arthus);
            herois.add(lyrenna);

            herois.add(new Guerreiro("Thorin", 12, 90, 55.0, 8.0));
            herois.add(new Mago("Gandalf", 15, 80, 70.0, 20.0));

            for (Personagem heroi : herois) {
                heroi.exibirStatus();
                heroi.usarHabilidadeEspecial();
                System.out.println("----------------------------------");
            }
        }

//     public static void main(String[] args) {
//         Personagem heroi1 = new Personagem("Aragorn", "Guerreiro", 10, 100, 50.0);
//         Personagem heroi2 = new Personagem("Gandalf", "Mago", 15, 80, 70.0);
//         Personagem heroi3 = new Personagem("Arthemis", "Arqueira", 5, 80, 12.5);
//         Personagem heroi4 = new Personagem("Lyrenna", "Maga", 8, 60, 30.0);
//         Personagem heroi5 = new Personagem("Thorin", "Guerreiro", 12, 90, 55.0);
//         Personagem heroi6 = new Personagem("Legolas", "Arqueiro", 7, 75, 25.0);

}