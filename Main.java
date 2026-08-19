public class Main {
    public static void main(String[] args) {
        Personagem heroi1 = new Personagem("Aragorn", "Guerreiro", 10, 100, 50.0);
        Personagem heroi2 = new Personagem("Gandalf", "Mago", 15, 80, 70.0);
        Personagem heroi3 = new Personagem("Arthemis", "Arqueira", 5, 80, 12.5);
        Personagem heroi4 = new Personagem("Lyrenna", "Maga", 8, 60, 30.0);
        Personagem heroi5 = new Personagem("Thorin", "Guerreiro", 12, 90, 55.0);
        Personagem heroi6 = new Personagem("Legolas", "Arqueiro", 7, 75, 25.0);

        System.out.println("Status do Personagem 1:");
        heroi1.exibirStatus();

        System.out.println("\nStatus do Personagem 2:");
        heroi2.exibirStatus();

        System.out.println("\nStatus do Personagem 3:");
        heroi3.exibirStatus();

        System.out.println("\nStatus do Personagem 4:");
        heroi4.exibirStatus();

        System.out.println("\nStatus do Personagem 5:");
        heroi5.exibirStatus();

        System.out.println("\nStatus do Personagem 6:");
        heroi6.exibirStatus();
    }
}