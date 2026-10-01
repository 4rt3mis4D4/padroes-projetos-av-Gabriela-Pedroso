package questao2.pagamento;

public class PagamentoSPEI implements Pagamento{

    @Override
    public String gerarPagamento() {
        return "Pagamento: Processado via SPEI";
    }
    
}
