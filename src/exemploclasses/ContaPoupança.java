package exemploclasses;

public class ContaPoupança extends Conta {
    String datasAniversarios;
    
    @Override
    void saqueConta(double valor){
    if((saldo-valor) < 0)
            System.out.println("Erro Valor abaixo de 0,00");
    
    else saldo = saldo-valor;
    } 
   
   ContaPoupança (){
   }
   
   ContaPoupança (String x, double y) {
       dataAbertura = x;
       saldo = y;
   }
   ContaPoupança (int numeroConta, String dataAbertura, double saldo) {
   this.numeroConta = numeroConta;
   this.dataAbertura = dataAbertura;
   this.saldo = saldo;
   }
}           
