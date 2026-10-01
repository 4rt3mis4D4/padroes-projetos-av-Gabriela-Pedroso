package questao2.relatorio_factorys;

import questao2.comprovante_fiscal.ComprovanteFiscal;
import questao2.comprovante_fiscal.ComprovanteFiscalCfdi;
import questao2.pagamento.Pagamento;
import questao2.pagamento.PagamentoSPEI;
import questao2.termo_privacidade.TermoPrivacidade;
import questao2.termo_privacidade.TermoPrivacidadeLfpdppp;

public class MexicoRelatorioFactory implements RelatorioFactory {

    @Override
    public ComprovanteFiscal criarComprovanteFiscal() {
        return new ComprovanteFiscalCfdi(650);
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoSPEI();
    }

    @Override
    public TermoPrivacidade criarTermoPrivacidade() {
        return new TermoPrivacidadeLfpdppp(false);
    }
    
}
