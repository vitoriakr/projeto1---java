import java.util.Scanner;

public class Outro_Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;
        while (nota != -1) {
            System.out.println("Avalie o filme: ou -1 para encerrar");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
            System.out.printf("Média de avaliação: %.2f%n", mediaAvaliacao / totalDeNotas);
        }
    }
}