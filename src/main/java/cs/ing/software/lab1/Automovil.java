package cs.ing.software.lab1;

import java.text.DecimalFormat;

public class Automovil extends Vehiculo {

    public Automovil( double  cantidad, double capacidad, double consumo, double viaje) {
        this.setcantidad(cantidad);
        this.setcapacidad(capacidad);
        this.setconsumo(consumo);
        this.setviaje(viaje);
    }

    String mDrive(double km){
        DecimalFormat df = new DecimalFormat("0.00");
        double fuelRequiere = km*this.consumo;
        if(cantidad-fuelRequiere<0){
            return ("Vehiculo necesita reabastecimiento de combustible");
        }
        else{
            this.cantidad -=fuelRequiere;
            return ("Vehiculo viajo " +(km)+" km y aun tiene " +df.format(cantidad)+ " de combustible");
        }
    }

    String mAbastecer(double cantidad){
        DecimalFormat df = new DecimalFormat("0.00");
        double newCantidad = cantidad*0.95;
        this.setcantidad(this.getCantidad()+ newCantidad);
        return ("La cantidad de combustible del vehiculo es de " + df.format(this.getCantidad()) );

    }


}
