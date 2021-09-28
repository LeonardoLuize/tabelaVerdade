import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        TabelaVerdade novaTabelaVerdade = new TabelaVerdade();

        System.out.println("\nInsira uma fórmula de até dois conectivos (sem espaço).");
        System.out.println("Valores aceitos (->/<->/^/v). Ex: p->q, q^p :");
        String formula = new Scanner(System.in).nextLine();


        var p = formula.substring(0, 1);
        var operacao = formula.substring(1, 2);
        var q = formula.substring(2, 3);

        if(formula.charAt(1) == '-'){
            operacao = formula.substring(1,3);
            q = formula.substring(3, 4);

        }else if(formula.charAt(1) == '<'){
            operacao = formula.substring(1,4);
            q = formula.substring(4, 5);
        }

        novaTabelaVerdade.atribuicaoDeValores(p, q);

        if(operacao.equals("->")){
            novaTabelaVerdade.calcImplicacao();
        }else if(operacao.equals("<->")){
            novaTabelaVerdade.calcBicondicional();
        }else if(operacao.equals("^")){
            novaTabelaVerdade.calcE();
        }else if(operacao.equals("v")){
            novaTabelaVerdade.calcOu();
        }

        novaTabelaVerdade.printTabelaVerdade();

    }
}
