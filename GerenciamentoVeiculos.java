package AT1N2POO;

public class GerenciamentoVeiculos {
    public static void main(String[] args) {
        Veiculo carro1 = new Carro("Toyota", "Corolla", 2012, 4);
        //Veiculo carro2 = new Carro("Honda", "Civic", 2015, 4);
        Veiculo moto1 = new Moto("Honda", "Bros", 2019, 160);
        //Veiculo moto2 = new Moto("Honda", "XRE", 2024, 300);

        carro1.exibirDetalhes();
        System.out.println("Custo de Manutenção: R$ " + carro1.calcularCustoManutencao());
        System.out.println();
    
        /*carro2.exibirDetalhes();
        System.out.println("Custo de Manutenção: R$ " + carro2.calcularCustoManutencao());
        System.out.println();*/
    
        moto1.exibirDetalhes();
        System.out.println("Custo de Manutenção: R$ " + moto1.calcularCustoManutencao());
        System.out.println();
    
        /*moto2.exibirDetalhes();
        System.out.println("Custo de Manutenção: R$ " + moto2.calcularCustoManutencao());
        System.out.println();*/
    
    }
}
    
    
