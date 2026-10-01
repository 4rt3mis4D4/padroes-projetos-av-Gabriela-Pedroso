package questao1;

public class FreteRodoviario extends Frete{
    private boolean temCTE;
    private boolean temMDFe;

    public FreteRodoviario(double valorCarga, String nomeCliente, boolean temCTE, boolean temMDFe) {
        super(valorCarga, nomeCliente);
        this.temCTE = temCTE;
        this.temMDFe = temMDFe;
    }

    @Override
    public double calcularValorDoFrete() {
        return valorCarga * 0.02;
    }

    @Override
    public void imprimirResumo() {
        double frete = calcularValorDoFrete();
        System.out.println("=== FRETE RODOVIÁRIO ===");
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Valor Frete: R$" + frete);
        System.out.println("Valor Total: R$" + (frete+valorCarga));
        System.out.println("Documentos Exigidos:");
        System.out.println("CT-e: " + temCTE);
        System.out.println("MDF-e: " + temMDFe);
        System.out.println();
    }
}
