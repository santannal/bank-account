import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // Conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in);

        // Exibir mensagens para a inserção de dados

        // Obter os dados
        System.out.println("Por favor digite o número da conta: ");
        int numAgencia = scanner.nextInt();

        System.out.println("Digite sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.next();

        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numAgencia + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
