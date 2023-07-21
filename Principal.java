public class Principal {
    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.nome = "Hugo Leo";
        titular1.cpf = 1245515123;
        Conta minhaConta = new Conta(titular1, 1,123,100_000);

        Pessoa titular2 = new Pessoa();
        titular2.nome = "Gabriela Quadra";
        titular2.cpf = 123421545;
        Conta suaConta = new Conta(titular2, 2,321,150_000);

        minhaConta.depositar(15_000);
        minhaConta.sacar(300,1.5);

        suaConta.depositar(30_000);
        suaConta.sacar(15_000);

        System.out.println("Titular: " + titular1.nome);
        System.out.println("Saldo: " + minhaConta.saldo);
        System.out.println("Número conta: " + minhaConta.numero);
        System.out.println("Agência: " + minhaConta.agencia);

        System.out.println("Titular: " + titular2.nome);
        System.out.println("Saldo: " + suaConta.saldo);
        System.out.println("Número conta: " + suaConta.numero);
        System.out.println("Agência: " + suaConta.agencia);

    }
}
