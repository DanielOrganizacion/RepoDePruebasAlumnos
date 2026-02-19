import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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
    @Test
    void CP_04() {
        assertEquals(false,cadenasAlumno1.sonIguales("hola","Hola"));
    }

    @ParameterizedTest
    @CsvSource({
            "+,+",
            "123,123",
            "Manolo,Manolo",
            "sueco, sueco"
    })
    public void Cp05_Parametrizado(String cadena1, String cadena2){
        boolean resultado = cadenasAlumno1.sonIguales(cadena1, cadena2);
        assertEquals(true, cadenasAlumno1.sonIguales(cadena1,cadena2));

    }

}