import java.util.Scanner;

public class CalculadoraMultaPesca {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para leitura de entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira o peso de peixes em quilos
        System.out.print("Digite o peso de peixes em quilos: ");
        double peso = scanner.nextDouble(); // Lê o peso de peixes digitado pelo usuário

        double limite = 50.0; // Limite estabelecido pelo regulamento de pesca em quilos
        double excesso = 0.0; // Variável para armazenar o excesso de peso em quilos
        double multa = 0.0; // Variável para armazenar o valor da multa em reais

        // Calcular o excesso e a multa, se houver
        if (peso > limite) { // Se o peso informado for maior que o limite
            excesso = peso - limite;
            multa = excesso * 4.0;
        }

        // Exibir os resultados
        if (excesso > 0) {
            System.out.println("Peso de peixes: " + peso + " kg");
            System.out.println("Limite de peso permitido: " + limite + " kg");
            System.out.println("Excesso de peso: " + excesso + " kg");
            System.out.println("Valor da multa: R$ " + multa);
        } else {
            System.out.println("Peso de peixes: " + peso + " kg");
            System.out.println("Limite de peso permitido: " + limite + " kg");
            System.out.println("Excesso de peso: 0 kg");
            System.out.println("Valor da multa: R$ 0.00");
        }

        // Fechar o objeto Scanner
        scanner.close();
    }
}
