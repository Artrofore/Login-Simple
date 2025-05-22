import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    private DatosLogin datosLogin;
    private Login login;

    @BeforeEach
    public void setUp() {
        datosLogin = new DatosLogin();
        login = new Login();
    }

    @Test
    public void testLoginValido() {
        assertTrue(login.autenticar("nataly", "clave123", datosLogin));
    }
    @Test
    public void testUsuarioInexistente() {
        assertFalse(login.autenticar("Patata", "Pimpum", datosLogin));
    }

}