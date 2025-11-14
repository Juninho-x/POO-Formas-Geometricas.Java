public class  FormaGeometrica {
    protected String cor;

    public FormaGeometrica(String cor) {
        this.cor = cor
    }
    public void exibirCor(){
        System.out.println("A cor da forma é: " + cor);
    }
    // Método abstrato para ser implementado nas subclasses
    public abstract double calcularArea();

    public void exibirDetalhes() {
        System.out.println("A cor da forma é: " + cor);
        System.out.println("Área: " + calcularArea());
    }

    public String getcor() {
        return cor;
    }
}
