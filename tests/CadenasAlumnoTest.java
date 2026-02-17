import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CadenasAlumnoTest {

    @Test
    void CP_01() {
        CadenasAlumno cadenasAlumno1 = new CadenasAlumno();
        assertEquals(true,cadenasAlumno1.sonIguales("hola","hola"));
        assertEquals(false,cadenasAlumno1.sonIguales("hola","hola1"));
    }
}