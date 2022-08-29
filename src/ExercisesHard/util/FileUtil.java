package ExercisesHard.util;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    public List<String> readFile(String file) {
        List<String> list = new ArrayList<String>();
        try {
            InputStream input = new FileInputStream(file);
            Reader reader = new InputStreamReader(input);
            BufferedReader bufferRead = new BufferedReader(reader);

            String linha = bufferRead.readLine();
            while(linha != null){
                list.add(linha);
                linha = bufferRead.readLine();
            }
            bufferRead.close();
            return list;
        } catch (Exception e) {
            return null;
        }
    }

    public boolean writeFile(String file, List<String> content) {
        try {
            OutputStream output = new FileOutputStream(file);
            Writer writer = new OutputStreamWriter(output);
            BufferedWriter bufferWrite = new BufferedWriter(writer);

            for(String line : content) {
                bufferWrite.write(line);
                bufferWrite.newLine();
            }

            bufferWrite.close();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
