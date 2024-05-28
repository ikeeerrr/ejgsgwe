import java.util.*;
public class AnalisisEdad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menores = 0;
		int mayores = 0;
		int jubilados = 0;
		ArrayList<Integer> edad = new ArrayList<Integer>();
		
		edad.add(4);
		edad.add(10);
		edad.add(18);
		edad.add(31);
		edad.add(50);
		edad.add(67);
		edad.add(99);
		
		for(int i=0;i<edad.size();i++) {
			if(i<18) {
				menores = menores + 1;
			}
			if(i>=18 && i<65) {
				mayores = mayores + 1;
			}
			if(i>65) {
				jubilados = jubilados + 1;
			}
			
		}
		
		System.out.println("Menores de edad: " + menores + ", Mayores de edad: " + mayores + ", Jubilados: " + jubilados);
	}
}
