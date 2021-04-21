package exemploclasses;
public abstract class Conta {
    int numeroConta;
    int numeroCliente;
    double saldo;
    String dataAbertura;
    
    void saqueConta(double valor) {
        saldo = saldo - valor;
    }
    
    void depositoConta(double valor){
        saldo = saldo + valor;
    }
    
    Conta(){
        saldo = 100;
        dataAbertura = "5/4/2021";
    }
}