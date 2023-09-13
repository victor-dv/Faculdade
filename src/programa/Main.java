package programa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      ProfessorDaFaculdade prof = new ProfessorDaFaculdade();

      prof.setNome("Joao");
      prof.setSalario(17.000);

      GeradorRelatorio relatorio = new GeradorRelatorio();

      relatorio.adiciona(prof);


    }
}
