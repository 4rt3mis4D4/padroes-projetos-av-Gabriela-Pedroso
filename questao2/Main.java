package questao2;

import questao2.relatorio_factorys.BrasilRelatorioFactory;
import questao2.relatorio_factorys.MexicoRelatorioFactory;
import questao2.relatorio_factorys.Relatorio;
import questao2.relatorio_factorys.RelatorioFactory;

public class Main {
    public static void main(String[] args) {
        // Pedido para o Brasil
        System.out.println("País do Cliente: Brasil");
        RelatorioFactory brasilFactory = new BrasilRelatorioFactory();
        Relatorio relatorioBrasil = new Relatorio(brasilFactory);
        relatorioBrasil.exibirRelatorio();

        // Pedido para o México
        System.out.println("País do Cliente: México");
        RelatorioFactory mexicoFactory = new MexicoRelatorioFactory();
        Relatorio relatorioMexico = new Relatorio(mexicoFactory);
        relatorioMexico.exibirRelatorio();
    }
}
