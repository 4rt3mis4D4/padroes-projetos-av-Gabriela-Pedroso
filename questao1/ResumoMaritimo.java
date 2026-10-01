package questao1;

public class ResumoMaritimo implements Resumo{

    @Override
    public Frete criarFrete() {
        return new FreteMaritimo(900, "Roberta", true, true);
    }
    
}
