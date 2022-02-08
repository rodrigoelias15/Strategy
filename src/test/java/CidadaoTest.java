import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CidadaoTest {

    @Test
    void deveEmitirCarteiraMotorista() {
        Cidadao cidadao = new Cidadao();
        cidadao.emitirCarteiraMotorista("José",1980);
        assertEquals("Nome: José, Nascido em: 1980, Numero de registro: 06598132587",
                cidadao.getDados());
    }

  @Test
    void deveEmitirPassaporte() {
        Cidadao cidadao = new Cidadao();
        cidadao.emitirPassaporte("José",1980);
        assertEquals("Nome: José, Nascido em: 1980, Numero Passaporte: BR123456",
                cidadao.getDados());
    }

    @Test
    void deveEmitirIdentidade() {
        Cidadao cidadao = new Cidadao();
        cidadao.emitirIdentidade("José",1980);
        assertEquals("Nome: José, Nascido em: 1980, Numero de identidade: 13806837, " +
                        "Numero de CPF: 10198726873", cidadao.getDados());
    }

}