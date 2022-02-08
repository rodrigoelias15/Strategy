import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CidadaoTest {

    @Test
    void deveEmitirCarteiraMotorista() {
        Cidadao cidadao = new Cidadao();
        cidadao.emitirIdentidade("José",1980);
        assertEquals("Nome: José, Nascido em: 1980, Numero de registro: 06598132587",
                cidadao.getDados());
    }

}