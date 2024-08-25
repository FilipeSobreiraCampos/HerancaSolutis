package Exercicio3;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado();
        System.out.println("Empregado 1: " + empregado1);

        Empregado empregado2 = new Empregado("Ana Silva", "Avenida Principal, 100", "9876-5432", 5, 3000.00, 12.0);
        System.out.println("Empregado 2: " + empregado2);

        empregado1.setNome("Pedro Souza");
        empregado1.setEndereco("Rua do Comércio, 456");
        empregado1.setTelefone("1234-5678");
        empregado1.setCodigoSetor(3);
        empregado1.setSalarioBase(2500.00);
        empregado1.setImposto(10.0);
        System.out.println("Empregado 1 após modificações: " + empregado1);

        System.out.println("Salário líquido do Empregado 2: " + empregado2.calcularSalario());
        System.out.println("Salário líquido do Empregado 1: " + empregado1.calcularSalario());
    }
}
