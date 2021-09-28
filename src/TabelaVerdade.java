import java.util.ArrayList;

public class TabelaVerdade {

    private ArrayList<ArrayList<String>> valores;

    public TabelaVerdade(){
        this.valores = new ArrayList<>();
    }

    public ArrayList<ArrayList<String>> getValores() {
        return valores;
    }

    public void printTabelaVerdade(){
        for(int i = 0; i < valores.toArray().length; i++){
            System.out.println("\n");

            for(int j = 0; j < valores.get(i).toArray().length; j++){
                System.out.printf("| %s |", valores.get(i).get(j));
            }
        }
    }

    public void atribuicaoDeValores(String a, String b){

        var p = new ArrayList<String>();
        var q = new ArrayList<String>();
        var nP = new ArrayList<String>();
        var nQ = new ArrayList<String>();

        p.add(a);
        q.add(b);
        nP.add("~" + a);
        nQ.add("~" + b);

        p.add("V");
        p.add("V");
        p.add("F");
        p.add("F");

        q.add("V");
        q.add("F");
        q.add("V");
        q.add("F");

        nP.add("F");
        nP.add("F");
        nP.add("V");
        nP.add("V");

        nQ.add("F");
        nQ.add("V");
        nQ.add("F");
        nQ.add("V");

        valores.add(p);
        valores.add(q);
        valores.add(nP);
        valores.add(nQ);

    }

    public void calcImplicacao(){

        var implicacao = new ArrayList<String>();

        implicacao.add("->");

        for(int i = 1; i < 5; i++){

            if(valores.get(2).get(i).equals("V") || valores.get(1).get(i).equals("V")){
                implicacao.add("V");
            }else{
                implicacao.add("F");
            }
        }

        valores.add(implicacao);

        System.out.println(valores);

    }

    public void calcE(){

        var e = new ArrayList<String>();

        e.add("^");

        for(int i = 1; i < 5; i++){

            if(valores.get(0).get(i).equals("V") && valores.get(1).get(i).equals("V")){
                e.add("V");
            }else{
                e.add("F");
            }
        }

        valores.add(e);

        System.out.println(valores);

    }

    public void calcOu(){

        var ou = new ArrayList<String>();

        ou.add("v");

        for(int i = 1; i < 5; i++){

            if(valores.get(0).get(i).equals("V") || valores.get(1).get(i).equals("V")){
                ou.add("V");
            }else{
                ou.add("F");
            }
        }

        valores.add(ou);

        System.out.println(valores);

    }

    public void calcBicondicional(){

        var bicondicional = new ArrayList<String>();

        bicondicional.add("<->");

        for(int i = 1; i < 5; i++){

            if((valores.get(2).get(i).equals("V") || valores.get(1).get(i).equals("V")) && (valores.get(3).get(i).equals("V") || valores.get(0).get(i).equals("V"))){
                bicondicional.add("V");
            }else{
                bicondicional.add("F");
            }
        }

        valores.add(bicondicional);

        System.out.println(valores);

    }
}
