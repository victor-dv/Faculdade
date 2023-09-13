package programa;

public class ProfessorDaFaculdade extends EmpregadoDaFaculdade{
    private int horasDeAula;
    public double getGastos(){
        return super.getGastos() + this.horasDeAula * 10;
    }

    public String getInfo(){
        String informacaoBasica = super.getInfo();
        String informacao = informacaoBasica + " horas de aula: " + this.horasDeAula;

        return informacao;

    }

    public int getHorasDeAula() {
        return horasDeAula;
    }

    public void setHorasDeAula(int horasDeAula) {
        this.horasDeAula = horasDeAula;
    }
}
