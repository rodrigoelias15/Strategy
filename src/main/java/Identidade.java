
public class Identidade implements EmissaoDocumento {

    @Override
    public String emiteDocumento(String nomeCidadao, int dataNascimentoCidadao) {
        String numIdentidade, numCPF;
        numCPF = "10198726873";
        numIdentidade = "13806837";
        return "Nome: " + nomeCidadao + ", "
                + "Nascido em: " + dataNascimentoCidadao
                + ", Numero de identidade: " + numIdentidade
                + ", Numero de CPF: " + numCPF;

    }
}

