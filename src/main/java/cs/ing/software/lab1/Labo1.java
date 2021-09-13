package cs.ing.software.lab1;
import java.util.logging.Logger;

public class Labo1 {
    static final Logger logger = Logger.getLogger(Labo1.class.getName());

    public static void main(String[ ] args) {



//Ejemplo 1
        Automovil lAutomovil1 = new Automovil(10,100,0.9,4);
        String mensaje1 = lAutomovil1.mDrive(4);
        logger.info(mensaje1);
//Ejemplo 2
        Automovil lAutomovil2 = new Automovil(10,100,0.9,12);
        String mensaje2 = lAutomovil2.mDrive(12);
        logger.info(mensaje2);
    }
}
