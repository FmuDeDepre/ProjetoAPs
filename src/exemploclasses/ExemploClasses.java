package exemploclasses;
public class ExemploClasses {
    public static void main(String[] args) {
      emprestimo e = new emprestimo();
        java.util.Scanner scan = new java.util.Scanner(System.in);
        System.out.println("Quanto voce deseja em Emprestimo");
        e.emprestimo(scan.nextDouble());
        System.out.println("Em quantas vezes deseja Parcelar");
        e.parcelar(scan.nextInt());
    }
    
}
