package cs.ing.software.lab1;
import java.util.logging.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.text.DecimalFormat;

public class Labo1Test {
    static final Logger logger = Logger.getLogger(Labo1.class.getName());
    @Test
    public void Test01(){

        DecimalFormat df = new DecimalFormat("0.00");
        Automovil missan = new Automovil(10,100,0.9,12);
        //logger.info(missan.Drive(12));
        Assert.assertEquals(missan.mDrive(12),"Vehiculo necesita reabastecimiento de combustible");

    }
    @Test
    public void Test02(){

        DecimalFormat df = new DecimalFormat("0.00");
        Automovil missan2 = new Automovil(10,100,0.9,4);
        //logger.info(missan2.Drive(4));
        Assert.assertEquals(missan2.mDrive(4),"Vehiculo viajo 4.0 km y aun tiene 6.40 de combustible");

    }

    @Test
    public void Test03(){

        DecimalFormat df = new DecimalFormat("0.00");
        Camion missan2 = new Camion(10,100,1.6,4);
        //logger.info(missan2.Drive(4));
        Assert.assertEquals(missan2.mDrive(4),"Vehiculo viajo 4.0 km y aun tiene 3.60 de combustible");

    }

    @Test
    public void Test04(){

        DecimalFormat df = new DecimalFormat("0.00");
        Camion missan2 = new Camion(10,100,1.6,50);
        //logger.info(missan2.Drive(4));
        Assert.assertEquals(missan2.mDrive(50),"Vehiculo necesita reabastecimiento de combustible");

    }

    @Test
    public void Test05(){

        DecimalFormat df = new DecimalFormat("0.00");
        Camion missan2 = new Camion(10,100,1.6,50);
        //logger.info(missan2.Drive(4));
        Assert.assertEquals(missan2.mAbastecer(50),"La cantidad de combustible del vehiculo es de 57.50");

    }

    @Test
    public void Test06(){

        DecimalFormat df = new DecimalFormat("0.00");
        Automovil missan2 = new Automovil(10,100,0.9,4);
        //logger.info(missan2.Drive(4));
        Assert.assertEquals(missan2.mAbastecer(100),"La cantidad de combustible del vehiculo es de 105.00");

    }

    @Test(invocationCount = 1000, threadPoolSize = 80)
    public void Test07(){

        DecimalFormat df = new DecimalFormat("0.00");
        Camion missan2 = new Camion(10,100,1.6,50);
        //logger.info(missan2.Abastecer(50));
        Assert.assertEquals(missan2.mAbastecer(50),"La cantidad de combustible del vehiculo es de 57.50");

    }

}
