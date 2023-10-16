import java.util.Scanner;

public class CalculoHipotenusa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // recebe os valores dos catetos do triângulo
        System.out.print("Digite o valor do primeiro cateto: ");
        double cateto1 = input.nextDouble();
        
        System.out.print("Digite o valor do segundo cateto: ");
        double cateto2 = input.nextDouble();
        
        // calcula o valor da hipotenusa usando o teorema de pitágoras
        double hipotenusa = Math.sqrt(cateto1 * cateto1 + cateto2 * cateto2);
        
        // exibi o valor da hipotenusa
        System.out.println("O valor da hipotenusa é: " + hipotenusa);
        
        input.close();
    }
}