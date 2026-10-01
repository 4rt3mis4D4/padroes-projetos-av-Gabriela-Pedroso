package questao2.termo_privacidade;

public class TermoPrivacidadeLfpdppp implements TermoPrivacidade{
    private boolean temLfpdppp;
    
    public TermoPrivacidadeLfpdppp(boolean temLfpdppp) {
        this.temLfpdppp = temLfpdppp;
    }

    @Override
    public String gerarTermoPrivacidade() {
        if (temLfpdppp == true){
            return "Termo de Privacidade Conforme à LFPDPPP.";
        } else {
            return "Termo de Privacidade Desconforme à LFPDPPP.";
        }
    }
}
