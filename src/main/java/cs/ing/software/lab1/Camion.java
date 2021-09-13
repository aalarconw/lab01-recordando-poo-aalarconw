package cs.ing.software.lab1;


import java.text.DecimalFormat;

public class Camion  extends Vehiculo {
    public Camion( double  cantidad,
            double capacidad,
            double consumo,
            double viaje) {
        this.setcantidad(cantidad);
        this.setcapacidad(capacidad);
        this.setconsumo(consumo);
        this.setviaje(viaje);
    }
    DecimalFormat df = new DecimalFormat("0.00");

    String mDrive(double km){

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
        double newCantidad = cantidad*0.95;
        this.setcantidad(this.getCantidad()+ newCantidad);
        return ("La cantidad de combustible del vehiculo es de " + df.format(this.getCantidad())  );

    }
}
