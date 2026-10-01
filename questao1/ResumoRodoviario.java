package questao1;

public class ResumoRodoviario implements Resumo{

    @Override
    public Frete criarFrete() {
        return new FreteRodoviario(600, "Gabriela", true, true);
    }
    
}
