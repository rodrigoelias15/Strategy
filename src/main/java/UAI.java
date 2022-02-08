public class UAI {

    private String nomeCidadao;
    private int dataNascimentoCidadao;

    public UAI(String nomeCidadao, int dataNascimentoCidadao) {
        this.nomeCidadao = nomeCidadao;
        this.dataNascimentoCidadao = dataNascimentoCidadao;
    }

    String emiteDocumento(EmissaoDocumento emissaoDocumento){
        return emissaoDocumento.emiteDocumento(nomeCidadao, dataNascimentoCidadao);
    }
}
