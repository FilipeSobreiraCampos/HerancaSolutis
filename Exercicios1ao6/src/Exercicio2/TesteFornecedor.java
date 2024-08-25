package Exercicio2;

public class TesteFornecedor {
    public static void main(String[] args) {
        Fornecedor fornecedor1 = new Fornecedor();
        System.out.println("Fornecedor 1: " + fornecedor1);

        Fornecedor fornecedor2 = new Fornecedor("Empresa ABC", "Rua das Empresas, 789", "1234-9876", 10000.00, 2000.00);
        System.out.println("Fornecedor 2: " + fornecedor2);

        fornecedor1.setNome("Fornecedor XYZ");
        fornecedor1.setEndereco("Avenida dos Fornecedores, 101");
        fornecedor1.setTelefone("9876-5432");
        fornecedor1.setValorCredito(5000.00);
        fornecedor1.setValorDivida(1500.00);
        System.out.println("Fornecedor 1 após modificações: " + fornecedor1);

        System.out.println("Saldo do Fornecedor 2: " + fornecedor2.obterSaldo());
        System.out.println("Saldo do Fornecedor 1: " + fornecedor1.obterSaldo());
    }
}
