package questao1;

public class ResumoAereo implements Resumo{

    @Override
    public Frete criarFrete() {
        return new FreteAereo(500, "Escobar", true);
    }
    
}
