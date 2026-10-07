package Taller8_Herencia_Simple.Ejercicio_04;

/*
 * ERROR DE COMPILACIÓN:
 * Java no admite herencia múltiple directa de clases.
 * La siguiente declaración es incorrecta y no compila:
 *
 * public class PruebaHerenciaMultiple extends ClaseA, ClaseB { }
 */
public class PruebaHerenciaMultiple extends ClaseA {
    private ClaseB claseB = new ClaseB();

    public void probarMetodos() {
        metodoA();
        claseB.metodoB();
    }
}