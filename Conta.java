import java.util.Objects;

public class Conta {
    Pessoa titular;
    int agencia;
    int numero;
    double saldo;

    Conta(Pessoa titular, int agencia, int numero, double saldo){

        Objects.requireNonNull(titular);
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
    }
    void depositar(double valor){
        if(valor <= 0){
            throw new IllegalArgumentException("Valror deve ser maior que 0!");
        }
            saldo += valor;

        }

    void sacar(double valor){
        if(saldo - valor < 0){
           throw new IllegalStateException("Saldo insuficiente!");
        }
        saldo -= valor;
    }

    void sacar(double valor, double taxaSaque) {
        sacar(valor+taxaSaque);
    }
}
