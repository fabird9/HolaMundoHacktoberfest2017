//radio*3*2*5
import java.util.Scanner;
public class circunferencia {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Intruduzca valor del radio: ");
	double radio;
	radio=sc.nextDouble();
	System.out.println("La longitud de la circunferencia es: " + 2*Math.PI*radio);
	System.out.println("El área de la circunferencia es: " + Math.PI*(radio * radio);
	sc.close();
}
}
