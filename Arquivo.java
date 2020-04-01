import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {

    private String entrada;
    private String saida;
    private List<String> leitura = new ArrayList<>();

    public Arquivo(String entrada, String saida) {
        this.entrada = entrada;
        this.saida = saida;

        this.readAllLine();
    }

    private void readAllLine() {
        try (BufferedReader br = new BufferedReader(new FileReader(this.getEntrada()))) {

            String line = br.readLine();

            while (line != null) {
                leitura.add(line);
                line = br.readLine();
            }

        } catch (IOException e) {
            e.getMessage();
        }

    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getSaida() {
        return saida;
    }

    public void setSaida(String saida) {
        this.saida = saida;
    }

    public List<String> getLeitura() {
        return leitura;
    }

    public void setLeitura(List<String> leitura) {
        this.leitura = leitura;
    }
}
