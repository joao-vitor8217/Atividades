import java.util.Scanner;

public class CalculoNovoPeso {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // recebe o peso da pessoa
        System.out.print("Digite o peso da pessoa: ");
        double peso = input.nextDouble();
        
        // calcula o novo peso se a pessoa engordar 15%
        double pesoEngordar = peso + (peso * 0.15);
        System.out.println("Se a pessoa engordar 15%, o novo peso será: " + pesoEngordar + " kg");
        
        // calcula o novo peso se a pessoa emagrecer 20%
        double pesoEmagrecer = peso - (peso * 0.20);
        System.out.println("Se a pessoa emagrecer 20%, o novo peso será: " + pesoEmagrecer + " kg");
        
        input.close();
    }
}
