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
				registrarUsuario(usuarios);
				break;
			case 2:
				registrarEvento(eventos);
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
public static void registrarEvento(HashMap<String, String[]> eventos) {
	System.out.println("Nombre del evento: ");
	String nombreEvento;
	nombreEvento=sc.next();
	System.out.println("Nombre del organizador:");
	String organizador;
	organizador=sc.next();
	System.out.println("Fecha del evento: ");
	String fechaEvento;
	fechaEvento=sc.next();
	System.out.println("Duración: ");
	String duracion;
	duracion=sc.next();
	System.out.println("Ubicación: ");
	String ubicacionEvento;
	ubicacionEvento=sc.next();
	System.out.println("Online o Presencial: ");
	String tipo;
	tipo=sc.next();
	System.out.println("Aforo: ");
	String aforo;
	aforo=sc.next();
	System.out.println("Categoria del evento: ");
	String categoria;
	categoria=sc.next();
	System.out.println("Estado del evento: ");
	String estado;
	estado=sc.next();
	String[] infoEvento= {organizador, fechaEvento, duracion, ubicacionEvento, tipo, aforo, categoria, estado};
	eventos.put(nombreEvento, infoEvento);
	
}
public static void registrarUsuario(HashMap<String, String[]> usuarios) {
	System.out.println("Nombre: ");
	String nombre;
	nombre=sc.next();
	System.out.println("Email: ");
	String email;
	email=sc.next();
	System.out.println("Contraseña: ");
	String contraseña;
	contraseña=sc.next();
	String[] datos= {nombre, contraseña};
	usuarios.put(email, datos);
	
}
}
