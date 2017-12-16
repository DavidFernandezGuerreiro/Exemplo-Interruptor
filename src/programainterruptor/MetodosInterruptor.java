
package programainterruptor;

/**
 *
 * @author dfernandezguerreiro
 */
public class MetodosInterruptor {
    int i=0;
    int sw;
    public void interruptor(){
        for(int i=0; i<6; i++){
            if(sw==0){
                System.out.println("Hola");
                sw=1;
            }
            else{
                System.out.println("Adios");
                sw=0;
            }
        }
    }
}
