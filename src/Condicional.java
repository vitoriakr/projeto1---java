public class Condicional {
    public static void main(String[]args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.2;
        String tipoPlano = "normal";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão curtindo");
        } else {
            System.out.println("Filme retrô que vale apena assistir");
        }

        if(incluidoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("filme liberado");
        }else{
            System.out.println("deve pagar a locação");
        }
    }
}



