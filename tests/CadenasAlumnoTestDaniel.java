import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CadenasAlumnoTestDaniel {
    CadenasAlumno cadenasAlumno1 = new CadenasAlumno();

    @Test
    void CP_01Iguales() {
        assertEquals(true,cadenasAlumno1.sonIguales("hola","hola"));
    }
    @Test
    void CP_02NoIguales() {
        assertEquals(false,cadenasAlumno1.sonIguales("hola","halo"));
    }

    @Test
    void CP_03DiferenteCadena() {
        assertEquals(false,cadenasAlumno1.sonIguales("hola","hola1"));
    }
    @Test
    void CP_04DiferenciaDeLetraMayor(){
        assertEquals(false,cadenasAlumno1.sonIguales("hola","Hola"));
    }
    @Test
    void CP_05DiferenciaDeLetraMenor() {
        assertEquals(false,cadenasAlumno1.sonIguales("hola","hol"));
    }

    @Test //No se controla
    void CP_06Null() {
        assertEquals(false, cadenasAlumno1.sonIguales(null,null));
    }

    @ParameterizedTest
    @CsvSource({
            "+,+",
            "123,123",
            "Manolo,Manolo",
            "sueco, sueco"
    })
    public void Cp07_Parametrizado(String cadena1, String cadena2){
        boolean resultado = cadenasAlumno1.sonIguales(cadena1, cadena2);
        assertEquals(true, cadenasAlumno1.sonIguales(cadena1,cadena2));

    }

}