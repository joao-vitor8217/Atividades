import java.util.Scanner;

public class CalculoSalariosMinimos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // recebe o valor do salário mínimo
        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = input.nextDouble();
        
        // recebe o salário do funcionário
        System.out.print("Digite o salário do funcionário: ");
        double salarioFuncionario = input.nextDouble();
        
        // calcula a quantidade de salários mínimos que o funcionário recebe
        double quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;
        
        // exibi a quantidade de salários mínimos
        System.out.println("O funcionário recebe " + quantidadeSalariosMinimos + " salários mínimos.");
        
        input.close();
    }
}



