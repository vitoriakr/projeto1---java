import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;

        for (int i = 0; i  < 3; i++) {
            System.out.println("Avalie o filme:");
            nota =leitura.nextDouble();
            mediaAvaliacao += nota;
        }
        System.out.printf("Média de avaliação: %.2f%n", mediaAvaliacao / 3);
    }
}
