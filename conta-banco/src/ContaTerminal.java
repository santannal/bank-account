import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String name = scanner.next();

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        System.out.println("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.println(name + " possui " + idade + " anos, com uma altura de: " + altura + " e peso de: " + peso);
    }
}
