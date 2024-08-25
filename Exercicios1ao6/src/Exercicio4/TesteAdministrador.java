package Exercicio4;

public class TesteAdministrador {
    public static void main(String[] args) {
        Administrador admin1 = new Administrador();
        System.out.println("Administrador 1: " + admin1);

        Administrador admin2 = new Administrador("Laura Costa", "Rua das Indústrias, 200", "2345-6789", 2, 5000.00, 15.0, 1000.00);
        System.out.println("Administrador 2: " + admin2);

        admin1.setNome("Roberto Lima");
        admin1.setEndereco("Rua do Comércio, 789");
        admin1.setTelefone("3456-7890");
        admin1.setCodigoSetor(4);
        admin1.setSalarioBase(4000.00);
        admin1.setImposto(10.0);
        admin1.setAjudaDeCusto(500.00);
        System.out.println("Administrador 1 após modificações: " + admin1);

        System.out.println("Salário total do Administrador 2: " + admin2.calcularSalario());
        System.out.println("Salário total do Administrador 1: " + admin1.calcularSalario());
    }
}
