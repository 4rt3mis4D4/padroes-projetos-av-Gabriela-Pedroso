package questao2.comprovante_fiscal;

public class ComprovanteFiscalNfse extends ComprovanteFiscal{
    private double porcentagemIss = 0.05;

    public ComprovanteFiscalNfse(double valorProduto) {
            super(valorProduto);
        }
    
        @Override
    public double gerarComprovanteFiscal() {
        return getValorProduto() * porcentagemIss;
    }
}
