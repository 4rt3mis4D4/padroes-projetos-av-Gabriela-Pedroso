package questao2.comprovante_fiscal;

public class ComprovanteFiscalCfdi extends ComprovanteFiscal{
    private double valorIva = 0.16;

    public ComprovanteFiscalCfdi(double valorProduto) {
            super(valorProduto);
    }
    
        @Override
    public double gerarComprovanteFiscal() {
       return getValorProduto() * valorIva;
    }
    
}
