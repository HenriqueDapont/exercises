package ExercisesHard;

import ExercisesHard.util.FileUtil;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class TestaIo3 {

    public static void main(String[] args) throws IOException, InterruptedException {
        int i = 1;
        while (i == 1) {
            FileUtil fileUtil = new FileUtil();
            List<String> file = fileUtil.readFile("in.txt");
            Writer out = new FileWriter("in.txt");
            out.write("");
            fileUtil.writeFile("out.txt", file);

            TimeUnit.SECONDS.sleep(10);
        }
    }
}
