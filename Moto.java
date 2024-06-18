package AT1N2POO;

public class Moto extends Veiculo {
    int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public double calcularCustoManutencao() {
        return 300.00;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Cilindradas: " + this.cilindradas + "cc");
    }
}
