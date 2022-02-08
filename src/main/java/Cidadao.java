import java.util.Date;

public class Cidadao {

    private String dados;

    public String getDados() {
        return dados;
    }

    public void setDados(String dados) {
        this.dados = dados;
    }

    public void emitirIdentidade(String nomeCidadao, int anoNascimentoCidadao) {
        UAI uai = new UAI(nomeCidadao, anoNascimentoCidadao);
        this.dados = uai.emiteDocumento(new CarteiraMotorista());
    }

}
