package tech.emanuelp.contas;

public class Main {
    public static void main(String[] args) {
        // Criando uma conta comum
        Conta minhaConta = new Conta();
        minhaConta.setNumero(123);
        minhaConta.setSaldo(1000.0);

        // Criando uma conta especial
        ContaEspecial minhaCEspecial = new ContaEspecial();
        minhaCEspecial.setNumero(456);
        minhaCEspecial.setSaldo(2000.0);
        minhaCEspecial.setLimite(500.0);

        // Criando uma conta de investimento
        ContaInvestimento minhaCInvestimento = new ContaInvestimento();
        minhaCInvestimento.setNumero(789);
        minhaCInvestimento.setSaldo(3000.0);
        minhaCInvestimento.setTaxa(0.05);
        minhaCInvestimento.setPrazo(12);

        // Realizando operações nas contas
        minhaConta.sacar(200.0);
        minhaCEspecial.sacar(300.0);
        minhaCInvestimento.sacar(400.0);
        minhaCInvestimento.depositar(500.0);
        minhaCInvestimento.aplicarRendimento(0.05);

        // Imprimindo informações das contas
        System.out.println("Informações das contas:");
        System.out.println("Conta comum: Número - " + minhaConta.getNumero() + ", Saldo inicial - 1000.0, Saldo atual - " + minhaConta.getSaldo());
        System.out.println("Conta especial: Número - " + minhaCEspecial.getNumero() + ", Saldo inicial - 2000.0, Saldo atual - " + minhaCEspecial.getSaldo() + ", Limite - " + minhaCEspecial.getLimite());
        System.out.println("Conta de investimento: Número - " + minhaCInvestimento.getNumero() + ", Saldo inicial - 3000.0, Saldo atual - " + minhaCInvestimento.getSaldo() + ", Taxa - " + minhaCInvestimento.getTaxa() + ", Prazo - " + minhaCInvestimento.getPrazo());
    }
}
