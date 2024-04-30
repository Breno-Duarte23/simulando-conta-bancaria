package application;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		//TODO: Importar o Scanner
		//Permitir que o usuário interaja com a aplicação para inserção de dados
		//Exibir mensagens para o usuário
	    Scanner sc = new Scanner(System.in); //Instanciando o Scanner
	    
		System.out.println("Por favor, digite o número da conta: ");
		int numeroConta = sc.nextInt();
		System.out.println("Por favor, digite o número da sua agencia: ");
		String numeroAgencia = sc.nextLine();
		sc.nextLine();
		System.out.println("Por favor, digite o seu nome: ");
		String nomeCliente = sc.nextLine();
		System.out.println("Por favor, digite o seu saldo bancário: ");
		double saldoBancario = sc.nextDouble();
		
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta" + numeroConta + " e seu saldo " + saldoBancario + " já está disponível para saque!");
		sc.close();
	}
}
