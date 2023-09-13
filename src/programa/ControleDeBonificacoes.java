package programa;

public class ControleDeBonificacoes {
    private double totalBonificacao = 0;
    public void registra(EmpregadoDaFaculdade f){
        System.out.println("Adicionando bonificação do funcionario");
        this.totalBonificacao += f.getBonificacao();
    }
    public double getTotalBonificacao(){
        return this.totalBonificacao;
    }
}
