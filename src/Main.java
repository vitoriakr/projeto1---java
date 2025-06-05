 public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lançamento" + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.2;
        double media = (6.0+10.0+8.0)/3;/*media feita por 3 notas aleatorias*/
        System.out.println(media);
        String sinopse = """
                Filme de aventura comgalã dos anos 80
                Muito bom!
                """;
        System.out.println(sinopse);
        //casting inplicito double classificacao = media/2;
        int classificacao = (int) (media/2);/*casting explicito*/
        System.out.println(classificacao);
    }
}
