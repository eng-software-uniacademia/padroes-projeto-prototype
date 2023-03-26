import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EstabelecimentoTest {
    @Test
    void deveClonar() throws CloneNotSupportedException {
        var proprietario = new Proprietario("Harold", "11111111111");
        var estabelecimento = new Estabelecimento(1, "Verdura chuchurek", proprietario);

        var estabelecimentoClone = estabelecimento.clone();
        estabelecimentoClone.setNumero(456);
        estabelecimentoClone.setNome("Verdura verde");
        estabelecimentoClone.getProprietario().setNome("Shrek");

        assertEquals("Estabelecimento{numero=1, nome='Verdura chuchurek', proprietario=Proprietario{nome='Harold', cpf='11111111111'}}", estabelecimento.toString());
        assertEquals("Estabelecimento{numero=456, nome='Verdura verde', proprietario=Proprietario{nome='Shrek', cpf='11111111111'}}", estabelecimentoClone.toString());
    }
}
