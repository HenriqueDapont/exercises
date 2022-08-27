package ExercisesNormal.Exercise5;

public class Cliente extends Usuario {
    private double saldo;

    public Cliente(String nome, int idade, String cpf, double saldo) {
        super(nome, idade, cpf);
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}
