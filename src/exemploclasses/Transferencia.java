//luis otavio
package exemploclasses;



public class Transferencia extends Conta {

void transferir(Conta outraConta, double valor){
    this.saqueConta(valor);
    outraConta.depositoConta(valor);
    System.out.println("Valor Depositado :" + valor);

}
    
    
    
}