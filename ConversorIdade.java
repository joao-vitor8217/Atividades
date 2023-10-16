import java.util.Scanner;

public class CalculoIdade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // recebe o ano de nascimento
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = input.nextInt();
        
        // coloco o ano atual
        int anoAtual = 2023; // Você pode substituir isso pelo ano atual
        
        // calcula a idade da pessoa no ano atual
        int idadeAtual = anoAtual - anoNascimento;
        System.out.println("A idade da pessoa no ano atual é: " + idadeAtual + " anos.");
        
        // calcula a idade que a pessoa terá em 2050
        int anoFuturo = 2050;
        int idadeFutura = anoFuturo - anoNascimento;
        System.out.println("A idade que a pessoa terá em 2050 é: " + idadeFutura + " anos.");
        
        input.close();
    }
}
