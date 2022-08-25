import java.io.*;
import java.nio.Buffer;
import java.util.Arrays;

public class TestaIo2 {

    public static void main(String[] args) throws IOException {
//        InputStream input = new FileInputStream("File_A.rodrigo");
//        Reader reader = new InputStreamReader(input);
//        BufferedReader bufferRead = new BufferedReader(reader);
//
//        String linha = bufferRead.readLine();
//
//        while(linha != null){
//            System.out.println(linha);
//            linha = bufferRead.readLine();

        FileFilter filter = file -> file.getName().endsWith(".rodrigo");

        File dir = new File("D:/Documentos/NTConsult/Exercicios");
        File[] files = dir.listFiles(filter);
        System.out.println(files.length);

        OutputStream output = new FileOutputStream("Agrupamento.txt");
        Writer writer = new OutputStreamWriter(output);
        BufferedWriter bufferWrite = new BufferedWriter(writer);



        bufferWrite.close();

    }
}
