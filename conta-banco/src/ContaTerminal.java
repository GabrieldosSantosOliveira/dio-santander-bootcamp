import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da Conta !");
        System.out.print("Conta: ");
        int conta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite o número da Agência !");
        System.out.print("Agência: ");
        String agencia = scanner.nextLine();
        System.out.println("Por favor, digite o nome do cliente !");
        System.out.print("Nome do cliente: ");
        String cliente = scanner.nextLine();
        System.out.println("Por favor, digite o saldo da conta !");
        System.out.print("Saldo: ");
        Double saldo = scanner.nextDouble();
        String message = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque.", cliente,agencia,conta,saldo);
        System.out.println(message);
        scanner.close();
    }
}
