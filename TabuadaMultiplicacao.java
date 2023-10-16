import java.util.Scanner;

public class TabuadaMultiplicacao {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // recebe o número da tabuada
        System.out.print("Informe um número: ");
        int numero = input.nextInt();
        
        // calcula e mostrar a tabuada de multiplicação
        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    //Nesta parte do código, um loop for é usado para iterar de 0 a 10. Durante cada iteração, o número inserido pelo usuário é multiplicado pelo valor do iterador (i). O resultado é armazenado na variável resultado e é exibido na saída padrão usando System.out.println(). Isso cria a tabuada de multiplicação do número fornecido pelo usuário, mostrando todas as multiplicacões de 0 a 10.
        input.close();
    }
}