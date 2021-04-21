package exemploclasses;
public class DigitaConta {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        ContaCorrente cr = new ContaCorrente();
        int x;
            
            System.out.println("Digite sua Conta Corrente");
            System.out.println("Numero da Conta");
            cr.numeroConta = scan.nextInt();
            
            System.out.println("Numero do Cliente");
            cr.numeroCliente = scan.nextInt();
            
            System.out.println("Data de Abertura");
            cr.dataAbertura = scan.next();
            
            System.out.println("Voce quer fazer deposito (1) ou saque (2)");
            x=scan.nextInt();
          if (x == 1) {
            System.out.println("Valor do Deposito");
            cr.depositoConta(scan.nextInt());
          } else if (x == 2) {
              System.out.println("Valor do Saque");
              cr.saqueConta(scan.nextInt());
          
          }
          System.out.println("Seu saldo atual é " + cr.saldo);
            
        
        }
    }
    

