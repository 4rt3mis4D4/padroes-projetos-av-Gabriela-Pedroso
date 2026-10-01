package questao2.relatorio_factorys;

import questao2.comprovante_fiscal.ComprovanteFiscal;
import questao2.pagamento.Pagamento;
import questao2.termo_privacidade.TermoPrivacidade;

public interface RelatorioFactory {
    public ComprovanteFiscal criarComprovanteFiscal();
    public Pagamento criarPagamento();
    public TermoPrivacidade criarTermoPrivacidade();
}
