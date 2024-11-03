public class Gerente extends FuncionarioBase implements Beneficios{
    
    private double bonusPercentual;


    public Gerente (String nome, double salarioBase, double bonusPercentual){
        super(nome, salarioBase, "Gerente");
        this.bonusPercentual =  bonusPercentual;
    }
    
    public double getBonusPercentual() {
        return bonusPercentual;
    }

    public void setBonusPercentual(double bonusPercentual) {
        this.bonusPercentual = bonusPercentual;
    }

    @Override
    public double calcularSalario(){
        return getSalarioBase()+ (getSalarioBase() * bonusPercentual/100);
    }

    @Override 
    public double calcularBonus(double Percentual){
        return getSalarioBase() * (Percentual/100);
    }

    @Override
    public double calcularAuxilioMoradia(double valorFixado){
        return 0;
    }
    

}
