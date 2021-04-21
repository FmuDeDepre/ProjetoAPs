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
    
    void transferir(Conta outraConta, double valor){ // Luis Otavio
    this.saqueConta(valor);
    outraConta.depositoConta(valor);
    System.out.println("Valor Depositado :" + valor);
    }
    
    Conta(){
        saldo = 100;
        dataAbertura = "21/4/2021";
    }
}

