package questao2.relatorio_factorys;

import questao2.comprovante_fiscal.ComprovanteFiscal;
import questao2.pagamento.Pagamento;
import questao2.termo_privacidade.TermoPrivacidade;

public class Relatorio {
    private ComprovanteFiscal comprovanteFiscal;
    private Pagamento pagamento;
    private TermoPrivacidade termoPrivacidade;

    public Relatorio(RelatorioFactory factory) {
        this.comprovanteFiscal = factory.criarComprovanteFiscal();
        this.pagamento = factory.criarPagamento();
        this.termoPrivacidade = factory.criarTermoPrivacidade();
    }

    public void exibirRelatorio(){
        System.out.println("=== Relatorio SaaS ====");
        System.out.println("Valor Comprovante Fiscal: R$" + comprovanteFiscal.gerarComprovanteFiscal());
        System.out.println(pagamento.gerarPagamento());
        System.out.println(termoPrivacidade.gerarTermoPrivacidade());
        System.out.println();
    }
}
