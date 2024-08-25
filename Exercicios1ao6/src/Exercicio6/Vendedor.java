package Exercicio6;

import Exercicio3.Empregado;

public class Vendedor extends Empregado {
    private double valorVendas;
    private double comissao;

    public Vendedor() {
        super();
        this.valorVendas = 0.0;
        this.comissao = 0.0;
    }

    public Vendedor(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto, double valorVendas, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario() {
        double salarioBase = super.calcularSalario();
        double comissaoTotal = valorVendas * comissao / 100;
        return salarioBase + comissaoTotal;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", valorVendas=" + valorVendas +
                ", comissao=" + comissao +
                ", salarioTotal=" + calcularSalario();
    }
}
