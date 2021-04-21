package exemploclasses;
public class TestaExemplodeClasses {
    public static void main(String[] args) {
        java.util.Scanner scan = new java.util.Scanner(System.in);
        int x = 3;
        ContaCorrente cr = new ContaCorrente();
        ContaPoupança cp = new ContaPoupança();
        
        while ( x != 0){   
        System.out.println("Qual conta deseja acessar 1 = Poupança 2 = Corrente 0 = sair");
         x = scan.nextInt(); 
        
         if (x == 1) {
            System.out.println("Cadastro em Poupança");
          while (cp.numeroConta == 0) {
           System.out.println("Digite o numero da Conta");
            cp.numeroConta = scan.nextInt();
         } do {
               System.out.println("Digite o numero do Cliente");
                 cp.numeroCliente = scan.nextInt();
         } while (cp.numeroCliente == 0); 
            System.out.println("Data de abertura");
            cp.dataAbertura = scan.next();
            System.out.println("Data de Aniversario");
            cp.datasAniversarios = scan.next();
            System.out.println("Seu Saldo é " + cp.saldo);
            System.out.println("Quanto deseja despositar");
             cp.depositoConta(scan.nextDouble());
            System.out.println("Quanto deseja sacar");
             cp.saqueConta(scan.nextDouble());
            System.out.println("Seu Saldo é " + cp.saldo);
         } if (x == 2) {
                System.out.println("Cadastro de Corrente");
                System.out.println("Digite o numero da Conta");
                 cr.numeroConta = scan.nextInt();
                System.out.println("Digite o numero do Cliente");
                 cr.numeroCliente = scan.nextInt();
                System.out.println("Data de Abertura");
                 cr.dataAbertura = scan.next();
                System.out.println("Digite o Cogigo do gerente");
                 cr.gerente = scan.nextInt();
                System.out.println("Limite de Credito");
                 cr.limite = scan.nextDouble();
                System.out.println("Digite a Taxa mensal");
                 cr.taxaMensal = scan.nextDouble();
                System.out.println("Seu saldo atual é " + cr.saldo);
                System.out.println("Deposito");
                 cr.depositoConta(scan.nextDouble());
                System.out.println("Saque");
                 cr.saqueConta(scan.nextDouble());
                System.out.println("Saldo é " + cr.saldo);
         }
         
           
      }
    }
    
}
