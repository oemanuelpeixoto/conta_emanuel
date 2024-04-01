package tech.emanuelp.contas;

public class ContaEspecial extends Conta {
    private double limite;

    public ContaEspecial() {
        super();
    }

    public ContaEspecial(int numero, double saldo, double limite) {

        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (getSaldo() >= valor) {
            double novoSaldo = getSaldo() - valor;
            setSaldo(novoSaldo);
        }
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }
}
