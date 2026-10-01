package questao2.termo_privacidade;

public class TermoPrivacidadeLgpd implements TermoPrivacidade{
    private boolean temLgpd;
    
    public TermoPrivacidadeLgpd(boolean temLgpd) {
        this.temLgpd = temLgpd;
    }

    @Override
    public String gerarTermoPrivacidade() {
        if (temLgpd == true){
            return "Termo de Privacidade Conforme à LGDP.";
        } else {
            return "Termo de Privacidade Desconforme à LGDP.";
        }
    }
}
