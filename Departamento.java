import java.util.ArrayList;

public class Departamento {
    
    private String nome;
    private ArrayList<FuncionarioBase> funcionarios;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public String getNome(){
        return nome;    
    }

    public void adicionarFuncionario(FuncionarioBase funcionario) {
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(FuncionarioBase funcionario) {
        funcionarios.remove(funcionario);
    }

    public double calcularFolhaPagamento() {
        double total = 0;
        for (FuncionarioBase funcionario : funcionarios) {
            total += funcionario.calcularSalario();
        }
        return total;
    }

    public void imprimirSalariosFuncionarios() {
        System.out.println("Departamento: " + nome);
        for (FuncionarioBase funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome() + 
                                ", Cargo: " +funcionario.getCargo()+
                                ", Salário: " + funcionario.calcularSalario());
        }
    }
}
