package Exercicio6;

public class TesteVendedor {
    public static void main(String[] args) {
        Vendedor vendedor1 = new Vendedor();
        System.out.println("Vendedor 1: " + vendedor1);

        Vendedor vendedor2 = new Vendedor("João Almeida", "Avenida das Vendas, 300", "7890-1234", 4, 3500.00, 8.0, 20000.00, 10.0);
        System.out.println("Vendedor 2: " + vendedor2);

        vendedor1.setNome("Mariana Santos");
        vendedor1.setEndereco("Rua do Comércio, 321");
        vendedor1.setTelefone("5678-1234");
        vendedor1.setCodigoSetor(1);
        vendedor1.setSalarioBase(2800.00);
        vendedor1.setImposto(12.0);
        vendedor1.setValorVendas(15000.00);
        vendedor1.setComissao(7.0);
        System.out.println("Vendedor 1 após modificações: " + vendedor1);

        System.out.println("Salário total do Vendedor 2: " + vendedor2.calcularSalario());
        System.out.println("Salário total do Vendedor 1: " + vendedor1.calcularSalario());
    }
}
