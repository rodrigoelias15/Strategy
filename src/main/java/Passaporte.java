public class Passaporte implements EmissaoDocumento {

    @Override
    public String emiteDocumento(String nomeCidadao, int dataNascimentoCidadao) {

        String numPassaporte;
        numPassaporte = "BR123456";
        return "Nome: " + nomeCidadao + ", "
                + "Nascido em: " + dataNascimentoCidadao
                + ", Numero Passaporte: " + numPassaporte;

    }
}

