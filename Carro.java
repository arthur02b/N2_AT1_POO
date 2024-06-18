package AT1N2POO;

public class Carro extends Veiculo{
    int numeroDePortas;

    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public double calcularCustoManutencao() {
        return 500.00;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Número de portas: " + this.numeroDePortas);
    }
}
