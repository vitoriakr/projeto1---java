import java.util.Scanner;

public class DesafioTemperatura {
    public static void main(String[] args){
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner =  new Scanner(System.in);
        // Exibe uma mensagem pedindo para o usuário digitar algo
        System.out.println("Digite o valor de celsius:");
        //Lê a string digitada pelo usuário
        double celsius = Double.parseDouble(scanner.nextLine());
        double fahrenheit = (celsius * 1.8) + 32;
        // Exibe a entrada do usuário
        System.out.println("Esse valor convertido para fahrenheit é igual: "+fahrenheit);

        // Fecha o Scanner
        scanner.close();
    }
}
