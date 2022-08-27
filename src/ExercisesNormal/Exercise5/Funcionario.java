package ExercisesNormal.Exercise5;

public class Funcionario extends Usuario {
    private double salario;
    private String cargo;

    public Funcionario(String nome, int idade, String cpf, double salario, String cargo) {
        super(nome, idade, cpf);
        this.salario = salario;
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }
}
