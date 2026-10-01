package questao1;

public class Cliente {
    public static void criarFrete(Resumo resumo){
        resumo.exibirFrete();
    }
    public static void main(String[] args) {
        System.out.println("Emissão do Frete: ");

        Resumo resumoRodoviario = new ResumoRodoviario();
        System.out.println("Frete Rodoviário...");
        criarFrete(resumoRodoviario);

        Resumo resumoMaritimo = new ResumoMaritimo();
        System.out.println("Frete Maritimo...");
        criarFrete(resumoMaritimo);

        Resumo resumoAereo = new ResumoAereo();
        System.out.println("Frete Aereo...");
        criarFrete(resumoAereo);
    }
}
