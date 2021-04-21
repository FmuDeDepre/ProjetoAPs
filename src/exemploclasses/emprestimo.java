package exemploclasses;
public class emprestimo extends Conta {  // feito por Matheus Siqueira / Gabriel Ribeiro
    double juros = 0.3;
    String dataPagamento;
    int parcelas;
    double valorFinal;
    double valorParcelado;
    double valor;
    
    
    void emprestimo(double valorEmprestimo){
        System.out.println("Voce devera pagar");
        valor = valorEmprestimo * juros;
        valorFinal = valorEmprestimo + valor;
        System.out.println(valorFinal);        
    }
    void parcelar(int parcelas) {
        valorParcelado = valorFinal / parcelas;
        System.out.format("O valor sera " + valorParcelado);
    }
}
