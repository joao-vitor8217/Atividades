import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // receber a temperatura em celsius
        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperaturaCelsius = input.nextDouble();
        
        // calcula a temperatura em fahrenheit
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
        
        // exibi a temperatura em fahrenheit
        System.out.println("A temperatura em graus Fahrenheit é: " + temperaturaFahrenheit);
        
        input.close();
    }
}