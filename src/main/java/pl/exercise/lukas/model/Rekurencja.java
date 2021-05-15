package pl.exercise.lukas.model;


import jdk.jfr.DataAmount;
import lombok.Data;

@Data
public class Rekurencja {

    private double liczbaN;



    public double wykonajSilnie( double liczbaN){
        return obliczSilnie(liczbaN);


    }


    private double obliczSilnie(double liczbaN){
        if (liczbaN == 0){
            return  1;
        } else {
            return liczbaN * (obliczSilnie(liczbaN - 1));
        }
    }
}
