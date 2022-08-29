package ExercisesHard;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class TestaIo2 {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:/Documentos/NTConsult/ExerciciosTeste");
        List<Path> paths = findByFileExtension(path, ".rodrigo");
        paths.forEach(x -> System.out.println(x));

        Path finalPath = Paths.get("Agrupamento.txt");
        writeList(paths, finalPath);
        System.out.println(writeList(paths, finalPath));
    }
    public static List<Path> findByFileExtension(Path path, String fileExtension) throws IOException {
        if (!Files.isDirectory(path)) {
            throw new IllegalArgumentException("O caminho deve ser um diretório");
        }
        List<Path> result;
        try (Stream<Path> walk = Files.walk(path)) {
            result = walk
                    .filter(Files::isRegularFile)
                    .filter(p -> p.getFileName().toString().endsWith(fileExtension))
                    .collect(Collectors.toList());
        }
        return result;
    }
    public static List<String> writeList(List<Path> paths, Path finalPath) throws IOException {
        List<String> requestList = new ArrayList<>();
        for(int i = 0; i < paths.size(); i++) {
            Files.readString(paths.get(i));
            requestList.add(Files.readString(paths.get(i)));
        }
        Files.write(finalPath, requestList.stream().toList());
        return requestList;
    }
}
