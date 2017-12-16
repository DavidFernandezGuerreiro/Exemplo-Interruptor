
package programainterruptor;

/**
 *
 * @author dfernandezguerreiro
 */
public class ProgramaInterruptor {

    /**
     * @param args the command line arguments
     */
//Escribe 6 veces alternativamente la palabra hola y adios (hola, adios, hola, adios, hola, adios)
    public static void main(String[] args) {
        MetodosInterruptor obxInterruptor=new MetodosInterruptor();
        obxInterruptor.interruptor();
    }
    
}
