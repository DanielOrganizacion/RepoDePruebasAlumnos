import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CadenasAlumnoTestDaniel {
    CadenasAlumno cadenasAlumno1 = new CadenasAlumno();

    @Test
    void CP_01() {
        assertEquals(true,cadenasAlumno1.sonIguales("hola","hola"));
    }
    @Test
    void CP_02() {
        assertEquals(false,cadenasAlumno1.sonIguales("hola","halo"));
    }

    @Test
    void CP_03() {
        assertEquals(false,cadenasAlumno1.sonIguales("hola","hola1"));
    }

}