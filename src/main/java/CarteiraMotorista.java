import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Random;

public class CarteiraMotorista implements EmissaoDocumento {

    Date date = new Date();
    ZoneId timeZone = ZoneId.systemDefault();
    LocalDate dataAtual = date.toInstant().atZone(timeZone).toLocalDate();

    @Override
    public String emiteDocumento(String nomeCidadao, int dataNascimentoCidadao) {
        if ((dataAtual.getYear() - dataNascimentoCidadao) < 18) {
            throw new IllegalArgumentException("Cidadão menor de idade");
        } else {
            String numRegistro;
            numRegistro = "06598132587";
            return "Nome: " + nomeCidadao + ", "
                    + "Nascido em: " + dataNascimentoCidadao
                    + ", Numero de registro: " + numRegistro;

        }
    }
}
