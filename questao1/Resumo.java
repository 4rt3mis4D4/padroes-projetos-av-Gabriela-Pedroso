package questao1;

public interface Resumo {
    public abstract Frete criarFrete();

    default void exibirFrete(){
        Frete frete = criarFrete();
        System.out.println("Criando Frete...");
        System.out.println();
        frete.calcularValorDoFrete();
        frete.imprimirResumo();
    }
}
