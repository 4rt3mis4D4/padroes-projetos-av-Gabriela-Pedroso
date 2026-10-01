package questao1;

// valor do frete igual a 1% do valor da carga. Documentos exigidos: BL (Bill ofLading) 
// e fatura comercial
public class FreteMaritimo extends Frete {
    private boolean temBl;
    private boolean temFaturaComercial;

    public FreteMaritimo(double valorCarga, String nomeCliente, boolean temBl, boolean temFaturaComercial) {
        super(valorCarga, nomeCliente);
        this.temBl = temBl;
        this.temFaturaComercial = temFaturaComercial;
    }

        @Override
    public double calcularValorDoFrete() {
        return valorCarga * 0.01;
    }

    @Override
    public void imprimirResumo() {
        double frete = calcularValorDoFrete();
        System.out.println("=== FRETE AÉREO ===");
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Valor Frete: R$" + frete);
        System.out.println("Valor Total: R$" + (frete+valorCarga));
        System.out.println("Documentos Exigidos:");
        System.out.println("Bill ofLading: " + temBl);
        System.out.println("Fatura Comercial: " + temFaturaComercial);
        System.out.println();
    }
    
}
