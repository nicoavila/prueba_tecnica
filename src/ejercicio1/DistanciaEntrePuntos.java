import java.util.Scanner;
 
//Distancia entre los puntos (3,0) y (-7,4)
//d = sqrt((x2-x1)^2 + (y2-y1)^2))

public class DistanciaEntrePuntos {
    static double distancia(double x1, double y1, double x2, double y2) {
    
        	return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	}
                
    public static void main(String[] args) {   
     
        double x2, x1, y2, y1;
        double medidaDistancia;

        medidaDistancia = distancia(3 ,0 ,-7 ,4);
         
        System.out.println("La distancia entre los puntos entre los puntos (3,0) y (-7,4)  el plano cartesiano es " + medidaDistancia);
         
    }
     
}
