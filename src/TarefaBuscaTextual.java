import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TarefaBuscaTextual implements Runnable {

    private String nomeArquivo;
    private String nome;

    public TarefaBuscaTextual(String nomeArquivo, String nome) {
        this.nomeArquivo = nomeArquivo;
        this.nome = nome;
    }

    @Override
    public void run() {
        try {
            Scanner sc = new Scanner(new File(nomeArquivo));
            int contadorLinha = 1;
            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                if (linha.toLowerCase().contains(nome.toLowerCase())) {
                    System.out.println(
                            nomeArquivo
                            + " - "
                            + contadorLinha
                            + " - "
                            + linha);
                }
                contadorLinha++;
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
