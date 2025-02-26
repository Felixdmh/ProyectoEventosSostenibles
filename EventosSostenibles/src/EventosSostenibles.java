import java.util.*;
public class EventosSostenibles {

	static Scanner sc=new Scanner(System.in);
	public static void main(String[]args) {
		HashMap<String, String[]> usuarios=new HashMap<>();
		HashMap<String, String[]> organizadores=new HashMap<>();
		HashMap<String, String[]> eventos=new HashMap<>();
		HashMap<String, String[]> inscripciones=new HashMap<>();
		int opcion;
		do {
			System.out.println("Bienvenido a la pagina de Eventos Sostenibles");
			System.out.println("Que deseas hacer: \n"
					+ "1.- Registrar Usuario \n"
					+ "2.- Registrar Evento \n"
					+ "3.- Registrar Organizador \n"
					+ "4.- Inscribirse a un evento \n"
					+ "5.- Mostrar organizadores \n"
					+ "6.- Mostrar eventos \n"
					+ "7.- Mostrar inscripciones \n"
					+ "8.- Mostrar usuarios \n"
					+ "9.- Salir");
			opcion=sc.nextInt();
			switch(opcion) {
			case 1:
				//registrarUsuario(usuarios);
				break;
			case 2:
				//registrarEvento(eventos);
				break;
			case 3:
				//registrarOrganizadores(organizadores);
				break;
			case 4:
				//inscribirseEvento(eventos, inscripciones);
				break;
			case 5:
				//mostrarOrganizadores(organizadores);
				break;
			case 6:
				//mostrarEventos(eventos);
				break;
			case 7:
				//mostrarInscripciones(inscripciones);
				break;
			case 8:
				//mostrarUsuarios(usuarios);
				break;
			case 9:
				System.out.println("Adios");
				break;
			}
			
			
			
			
		}while(opcion!=9);
	}
}
