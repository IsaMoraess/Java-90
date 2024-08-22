import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        
        System.out.print("Digite sua altura (em metros): ");
        double altura = sc.nextDouble();
        
        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        
        System.out.println("\nInformações do usuário:");
        System.out.println("Nome: " + nome);
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Idade: " + idade + " anos");
    }
}