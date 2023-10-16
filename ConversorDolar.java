import java.util.Scanner;

public class ConversorDolar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // recebe a cotação do dólar em reais
        System.out.print("Digite a cotação do dólar em reais: ");
        double cotacaoDolar = input.nextDouble();
        
        // receber o valor em dólares que a pessoa possui
        System.out.print("Digite o valor em dólares: ");
        double valorDolares = input.nextDouble();
        
        // calcular o valor em reais
        double valorReais = valorDolares * cotacaoDolar;
        
        // exibi o valor em reais
        System.out.println("O valor em reais é: R$" + valorReais);
        
        input.close();
    }
}