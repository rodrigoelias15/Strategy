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
        this.dados = uai.emiteDocumento(new Identidade());
    }

    public void emitirPassaporte(String nomeCidadao, int anoNascimentoCidadao) {
        UAI uai = new UAI(nomeCidadao, anoNascimentoCidadao);
        this.dados = uai.emiteDocumento(new Passaporte());
    }

    public void emitirCarteiraMotorista(String nomeCidadao, int anoNascimentoCidadao) {
        UAI uai = new UAI(nomeCidadao, anoNascimentoCidadao);
        this.dados = uai.emiteDocumento(new CarteiraMotorista());
    }

}
