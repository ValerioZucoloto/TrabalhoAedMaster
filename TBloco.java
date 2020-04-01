import java.util.List;

public class TBloco {

    private Bloco[] meusBlocos;
    private int qtd;
    private List<String> leitura;

    public TBloco(List<String> leitura) {
        this.leitura = leitura;

        this.readLine();
    }

    // Interpreta as linhas e executa os comandos corretos
    private void readLine(){

        int x = 0;

        for(String s : this.getLeitura()){

            if(!s.trim().equals("quit")){

                // Separa os elementos da linha
                String[] controle = s.split(" ");

                if(x == 0){

                    this.setQtd(Integer.parseInt(controle[0]));
                    System.out.println(controle[0]);
                    x++;
                }else {

                    // Ler os dois comandos de cada linha da instrução
                    String move1 = controle[0];
                    String move2 = controle[2];

                    // Ler os dois números de cada linha da instrução
                    int n1 = Integer.parseInt(controle[1]);
                    int n2 = Integer.parseInt(controle[3]);

                    if (move1.equals("move") && move2.equals("onto")) {
                        this.moveOnto(n1, n2);
                    } else if (move1.equals("move") && move2.equals("over")) {
                        this.moveOver(n1, n2);
                    } else if (move1.equals("pile") && move2.equals("onto")) {
                        this.pileOnto(n1, n2);
                    } else if (move1.equals("pile") && move2.equals("over")) {
                        this.pileOver(n1, n2);
                    } else {
                        System.err.println("Inválid");
                    }


                }

            }else{
                // Aqui ficará o método para exibir na tela e gravação do arquivo
                System.out.println(s);
            }

        }
    }

    private void pileOnto(int n1, int n2) {
    }

    private void pileOver(int n1, int n2) {
    }

    private void moveOver(int n1, int n2) {
    }

    private void moveOnto(int a, int b) {

    }

    private void validaMovimento(){

    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public List<String> getLeitura() {
        return leitura;
    }

    public void setLeitura(List<String> leitura) {
        this.leitura = leitura;
    }
}
