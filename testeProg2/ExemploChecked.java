package testeProg2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExemploChecked {
    public static void main(String[] args) {
        try {
            // Tentando ler um arquivo que não existe
            lerArquivo("arquivo_inexistente.txt");
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

    public static void lerArquivo(String nomeArquivo) throws IOException {
        // Tentando abrir um arquivo (o que pode gerar uma IOException)
        File file = new File(nomeArquivo);
        FileReader fileReader = new FileReader(file);
        fileReader.close();
    }
}
