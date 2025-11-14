public class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(String cor) {
        super(cor);
        this.raio = raio;

        @Override
        public double calcularArea() {
            return Math.PI * raio * raio;;
        }
    }
