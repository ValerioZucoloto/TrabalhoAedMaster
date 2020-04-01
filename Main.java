public class Main {

    public static void main(String[] args) {

        String entrada = "C:\\temp\\entrada.txt";
        String saida = "C:\\temp\\saida.txt";

        // Leitor e escritor
        Arquivo arquivo = new Arquivo(entrada, saida);

        new TBloco(arquivo.getLeitura());

    }

}
