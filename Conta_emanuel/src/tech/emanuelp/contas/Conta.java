package tech.emanuelp.contas;


public class Conta {
    private int numero;
    private double saldo;


    public Conta() {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        this.saldo = this.saldo - valor;
    }

    public void depositar(double valor) {
            this.saldo = this.saldo + valor;
    }


    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double novoSaldo) {
        this.saldo = novoSaldo;
    }


}


