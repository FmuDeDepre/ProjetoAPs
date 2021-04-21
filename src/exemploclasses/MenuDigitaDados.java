package exemploclasses;
public class MenuDigitaDados {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int x = 9;
        ContaCorrente cc;
        ContaPoupança cp;
        
        while (x != 0) {
            cc = new ContaCorrente();
            cp = new ContaPoupança();
            System.out.println("Que tipo de conta deseja acessar ");
            System.out.println("<1> Conta Corrente <2> Conta Poupança ou <0> se deseja Sair");
            
            x = scan.nextInt();
            
                if (x == 1) {
                   do {
                    System.out.println("****Conta Corrente****");
                    System.out.println("Digite o que sera pedido a seguir");
                    System.out.println("Numero da Conta");
                    cc.numeroConta = scan.nextInt();
                     if (cc.numeroConta != 0) {
                        System.out.println("Numero do Cliente");
                        cc.numeroCliente = scan.nextInt();
                        System.out.println("Data de Abertura");
                        cc.dataAbertura = scan.next();
                        System.out.println("Codigo do Gerente");
                        cc.gerente = scan.nextInt();
                        System.out.println("Limite de Credito");
                        cc.limite = scan.nextDouble();
                        System.out.println("Taxa Mensal");
                        cc.taxaMensal = scan.nextDouble();
                        System.out.println("Seu Saldo Atual é " + cc.saldo);
                        System.out.println("Quanto deseja depositar");
                        cc.depositoConta(scan.nextDouble());
                        System.out.println("Quanto deseja sacar");
                        cc.saqueConta(scan.nextDouble());
                        System.out.println("Seu saldo Atual é " + cc.saldo);
                        System.out.println("Finalizado");
                   }
                  } while (cc.numeroConta != 0);             
                } if (x == 2 ) {
                   do {
                     System.out.println("****Conta Poupança****");
                    System.out.println("Digite o que sera pedido a seguir");
                    System.out.println("Numero da Conta");
                    cp.numeroConta = scan.nextInt();
                      if (cp.numeroConta != 0) {
                        System.out.println("Numero do Cliente");
                        cp.numeroCliente = scan.nextInt();
                        System.out.println("Data de Abertura");
                        cp.dataAbertura = scan.next();
                        System.out.println("Data de Aniversario");
                        cp.datasAniversarios = scan.next();
                        System.out.println("Seu Saldo Atual é " + cp.saldo);
                        System.out.println("Quanto deseja depositar");
                        cp.depositoConta(scan.nextDouble());
                        System.out.println("Quanto deseja sacar");
                        cp.saqueConta(scan.nextDouble());
                        System.out.println("Seu saldo Atual é " + cp.saldo);
                        System.out.println("Finalizado");
                   }
                  } while (cp.numeroConta != 0);  
            }
        
        }
    }
    
}
