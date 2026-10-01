package questao2.comprovante_fiscal;

public abstract class ComprovanteFiscal {
    private double valorProduto;

    public ComprovanteFiscal(double valorProduto) {
        this.valorProduto = valorProduto;
    }
    
    public double getValorProduto() {
        return valorProduto;
    }

    public abstract double gerarComprovanteFiscal();
}
