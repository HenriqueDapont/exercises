import util.FileUtil;
import java.util.List;
import java.util.stream.Collectors;

public class TestaIo1 {

    public static void main(String[] args) {

        FileUtil fileUtil = new FileUtil();

        List<String> requestList = fileUtil.readFile("Request.txt");
        List<String> filterList = filterList(requestList);
        List<String> nameList = mapListByName(filterList);
        fileUtil.writeFile("Response.txt", nameList);
    }

    public static List<String> filterList(List<String> list) {
        return list.stream().filter(line -> {
            List<String> content = List.of(line.split(":"));
            return Integer.parseInt(content.get(1)) < 3000 && content.get(2).equals("funcionario");
        }).collect(Collectors.toList());
    }

    public static List<String> mapListByName(List<String> list) {
        return list.stream().map(line -> {
            return line.split(":")[0];
        }).collect(Collectors.toList());
    }
}
