package questao2.relatorio_factorys;

import questao2.comprovante_fiscal.ComprovanteFiscal;
import questao2.comprovante_fiscal.ComprovanteFiscalNfse;
import questao2.pagamento.Pagamento;
import questao2.pagamento.PagamentoPix;
import questao2.termo_privacidade.TermoPrivacidade;
import questao2.termo_privacidade.TermoPrivacidadeLgpd;

public class BrasilRelatorioFactory implements RelatorioFactory{

    @Override
    public ComprovanteFiscal criarComprovanteFiscal() {
        return new ComprovanteFiscalNfse(8000);
    }

    @Override
    public Pagamento criarPagamento() {
        return new PagamentoPix();
    }

    @Override
    public TermoPrivacidade criarTermoPrivacidade() {
        return new TermoPrivacidadeLgpd(true);
    }
    
}
