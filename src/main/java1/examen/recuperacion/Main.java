package examen.recuperacion;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		Scanner inInt =  new Scanner(System.in);
		
		String usuario = "";
		String clave = "";
		String opcion = "";
		do {
			System.out.println("Ingrese usuario del sistema");
			usuario = in.nextLine();
		
		if(usuario=="ADMIN") {
			System.out.println("Ingrese la clave");
			clave = in.nextLine();
			if(clave.contains(ABC)) {
				do {
					System.out.println("SistemaSENESCYT");
					System.out.println("1.Ingresar becado: ");
					System.out.println("2.Búsqueda por tipo de becado");
					System.out.println("3.Búsqueda general");
					System.out.println("4.SALIR");
					opcion = in.nextLine();
					
					switch(opcion) {
					case "1":
						System.out.println("Tipo de becado");
						System.out.println("1. Becado por notas");
						System.out.println("2. Becado por discapacidad");
						System.out.println("3. Becado por recursos");
						int op = inInt.nextInt();
						break;
						
					case "2":
						System.out.println("Elija el tipo de becado a buscar:");
						System.out.println("1. Becado por notas");
						System.out.println("2. Becado por discapacidad");
						System.out.println("3. Becado por recursos");
						int op2 = inInt.nextInt();
						if(op2==1) {
							System.out.println("Ingrese el codigo del colegio");
							String codCol = in.nextLine();
						}else if(op2==2){
							System.out.println("Ingrese el codigo de discapacidad");
							String codDis = in.nextLine();
						}else {
							System.out.println("Ingrese codigo beneficio");
							
						}
					break;
					
					case "3":
					System.out.println("Ingrese codigo a buscar");
					String codigoABuscar = in.nextLine();
					
					}
			
			
		}else {
			System.out.println("Usuario Incorrecto");
		}while()
		}
			
		}while(!opcion.equals("4"));
			System.out.println("Usted ha salido del sistema");
	}

	
}



