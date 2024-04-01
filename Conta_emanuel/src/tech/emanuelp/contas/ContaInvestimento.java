package tech.emanuelp.contas;

public class ContaInvestimento extends Conta {
    private double taxa;
    private int prazo;

    public ContaInvestimento() {
        super();
    }

    public ContaInvestimento(int numero, double saldo, double taxa, int prazo) {

        this.taxa = taxa;
        this.prazo = prazo;
    }

    @Override
    public void sacar(double valor) {
        double novoSaldo = getSaldo() - (valor * this.taxa);
        setSaldo(novoSaldo);
    }

    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + (valor * this.taxa));
    }

    public void aplicarRendimento(double v) {
        double rendimento = getSaldo() * taxa;
        setSaldo(getSaldo() + rendimento);
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    public double getTaxa() {
        return taxa;
    }

    public int getPrazo() {
        return prazo;
    }
}
