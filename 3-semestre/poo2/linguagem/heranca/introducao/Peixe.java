package heranca.introducao;

public class Peixe extends Animal {
    private String caracteristicas;

    public Peixe(String nome, float comprimento, int patas, String cor, String ambiente, float velocidadeMedia, String caracteristicas) {
        super(nome, comprimento, patas, cor, ambiente, velocidadeMedia);
        this.caracteristicas = caracteristicas;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public void dadosPeixe() {
        super.dado();
        System.out.println("Peixe{" + "caracteristicas='" + caracteristicas + '\'' + '}');
    }
}
