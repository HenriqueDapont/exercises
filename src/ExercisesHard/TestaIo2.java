package ExercisesHard;

import ExercisesHard.util.FileUtil;

import java.util.Arrays;
import java.util.List;

public class TestaIo2 {

    public static void main(String[] args) {

        FileUtil fileUtil = new FileUtil();
        List<String> requestList1 = fileUtil.readFile("File_A.rodrigo");
        List<String> requestList2 = fileUtil.readFile("File_B.rodrigo");
        List<String> requestList3 = fileUtil.readFile("File_C.rodrigo");


        List<List<String>> listFiles = Arrays.asList(requestList1,requestList2,requestList3);
        System.out.println(listFiles);


        }

//        File dir = new File("D:/Documentos/NTConsult/ExerciciosTeste");
//        List<File> files = Arrays.asList(dir);


    }
