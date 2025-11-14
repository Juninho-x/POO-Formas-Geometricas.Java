public class Main {
    public static void main(String[] args) {

        //Erro de compilação
        //FormaGeometrica forma = new FormaGeometrica("Azul");

        FormaGeometrica circulo = new Circulo(cor:"Azul", raio: 5);
        FormaGeometrica retangulo = new Retangulo(cor:"Verde", largura: 4.0, altura: 5.0);

        circulo.exibirDetalhes();
        retangulo.exibirDetalhes();

    }