package questao1;

//  criar o frete, calcular o valor do frete e imprimir o resumo.
public abstract class Frete {
    protected double valorCarga;
    protected String nomeCliente;

    public Frete(double valorCarga, String nomeCliente) {
        this.valorCarga = valorCarga;
        this.nomeCliente = nomeCliente;
    }

    public abstract double calcularValorDoFrete();

    public abstract void imprimirResumo();
}
