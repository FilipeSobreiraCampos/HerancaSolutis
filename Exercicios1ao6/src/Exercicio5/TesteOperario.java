package Exercicio5;

public class TesteOperario {
    public static void main(String[] args) {
        Operario operario1 = new Operario();
        System.out.println("Operário 1: " + operario1);

        Operario operario2 = new Operario("Carlos Pereira", "Rua da Produção, 123", "3456-7890", 3, 3000.00, 12.0, 10000.00, 5.0);
        System.out.println("Operário 2: " + operario2);

        // Modificando atributos
        operario1.setNome("Ana Souza");
        operario1.setEndereco("Avenida dos Operários, 456");
        operario1.setTelefone("4567-8901");
        operario1.setCodigoSetor(2);
        operario1.setSalarioBase(2500.00);
        operario1.setImposto(10.0);
        operario1.setValorProducao(8000.00);
        operario1.setComissao(4.0);
        System.out.println("Operário 1 após modificações: " + operario1);

        System.out.println("Salário total do Operário 2: " + operario2.calcularSalario());
        System.out.println("Salário total do Operário 1: " + operario1.calcularSalario());
    }
}
