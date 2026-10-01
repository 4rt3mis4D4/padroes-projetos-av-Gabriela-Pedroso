package questao1;

// valor do frete igual a 6% do valor da carga. Documentos exigidos: AWB (AirWaybill).
public class FreteAereo extends Frete {
    private boolean temAWB;
    
    public FreteAereo(double valorCarga, String nomeCliente, boolean temAWB) {
        super(valorCarga, nomeCliente);
        this.temAWB = temAWB;
    }

        @Override
    public double calcularValorDoFrete() {
        return valorCarga*0.06;
    }

    @Override
    public void imprimirResumo() {
        double frete = calcularValorDoFrete();
        System.out.println("=== FRETE AÉREO ===");
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Valor Frete: R$" + frete);
        System.out.println("Valor Total: R$" + (frete+valorCarga));
        System.out.println("Documentos Exigidos:");
        System.out.println("AirWaybill: " + temAWB);
        System.out.println();
    }
    
}
