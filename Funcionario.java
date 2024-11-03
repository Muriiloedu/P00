
public class Funcionario extends FuncionarioBase{
    
    public Funcionario (String nome, double salarioBase){
        super(nome, salarioBase, "Funcionário");
    }

    @Override
    public double calcularSalario(){
        return getSalarioBase();
    }
}
