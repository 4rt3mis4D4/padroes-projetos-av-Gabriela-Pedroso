package questao2.pagamento;

public class PagamentoPix implements Pagamento{

    @Override
    public String gerarPagamento() {
        return "Pagamento: Processado via Pix";
    }
    
}
