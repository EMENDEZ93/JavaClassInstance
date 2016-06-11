
package javaclassinstance;

/*
 * @author Edwin Mendez
 */


//clase a instanciar    
    class Car {
        
    static int PasajeroCar = 3;    
    String MarcaCar;
    String VersionCar;    
    
    }

public class JavaClassInstance {

    public static void main(String[] args) {
   
//instanciando clase        
    Car car = new Car();     
     
//Variable estatica + 1
    Car.PasajeroCar++;
    
    car.MarcaCar = "Chevrolet";
    
    car.VersionCar = "Camaro 1940";
    
//imprimir     
    System.out.println("- Auto -");
    System.out.println(car.MarcaCar);
    System.out.println(car.VersionCar);

    }
    
}
