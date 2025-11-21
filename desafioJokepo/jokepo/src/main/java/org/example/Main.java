import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Cria o Scanner para ler a entrada do usuário
        Scanner teclado = new Scanner(System.in);

        // Exibe as opções do jogo
        System.out.println("Jokenpô || Digite uma das opções abaixo");
        System.out.println("========================================");
        System.out.println("Pedra");
        System.out.println("Papel");
        System.out.println("Tesoura");
        System.out.println("========================================");

        // Lê a escolha do jogador
        String jogador = teclado.nextLine();

        // Gera um número aleatório entre 1 e 3 para a escolha do computador
        int numero = (int) ((Math.random() * 3) + 1);

        // Fecha o Scanner para evitar warnings
        teclado.close();

        // Converte o número aleatório na escolha do computador
        String computador = "";
        if (numero == 1) {
            computador = "Pedra";
        } else if (numero == 2) {
            computador = "Papel";
        } else {
            computador = "Tesoura";
        }

        // Mostra a escolha do computador
        System.out.println("O computador escolheu: " + computador);

        // Compara a escolha do jogador com a do computador
        switch (jogador.toLowerCase()) {
            case "pedra":
                if (computador.equalsIgnoreCase("pedra")) {
                    System.out.println("Empate");
                } else if (computador.equalsIgnoreCase("tesoura")) {
                    System.out.println("Você ganhou!");
                } else {
                    System.out.println("Você perdeu!");
                }
                break;

            case "papel":
                if (computador.equalsIgnoreCase("papel")) {
                    System.out.println("Empate");
                } else if (computador.equalsIgnoreCase("pedra")) {
                    System.out.println("Você ganhou!");
                } else {
                    System.out.println("Você perdeu!");
                }
                break;

            case "tesoura":
                if (computador.equalsIgnoreCase("tesoura")) {
                    System.out.println("Empate");
                } else if (computador.equalsIgnoreCase("pedra")) {
                    System.out.println("Você perdeu");
                } else {
                    System.out.println("Você ganhou!");
                }
                break;

            default:
                // Caso o jogador digite algo inválido
                System.out.println("Opção inválida!");
        }
    }
}
