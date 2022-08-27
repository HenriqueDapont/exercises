package ExercisesNormal.Exercise5;

import java.util.Arrays;
import java.util.List;

public class TestaUsuario {

    public static void main(String[] args) {
        List<Usuario> funcionarioList = Arrays.asList(new Funcionario("Ana", 25, "065.982.345-89", 2000.00, "Dev. Jr."),
                new Funcionario("João", 25, "078.934.125-03", 1500.00, "Trainee"), new Funcionario("Marcelo", 25, "060.232.213-75", 7000.00, "Dev. Pleno"),
                new Funcionario("Rafael", 25, "996.223.556-55", 2000.00, "Dev. Jr." ), new Funcionario("Alessandra", 25, "993.123.456-78", 20000.00, "Dev. Senior"));

        List<Usuario> clienteList = Arrays.asList(new Cliente("Henrique", 28, "456.890.888-44", 2500.00),
                new Cliente("Jairo", 35, "987.534.677-99", 3000.00), new Cliente("Angela", 32, "333.847.911-02", 4000.00));

        listarNomes(funcionarioList);
        listarCpf(clienteList);
    }
    public static void listarNomes(List<Usuario> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNome());
        }
    }
    public static void listarCpf(List<Usuario> lista) {
        for(int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getCpf());
        }
    }
}
