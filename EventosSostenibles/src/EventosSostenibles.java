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
				registrarOrganizadores(organizadores);
				break;
			case 4:
				inscribirseEvento(eventos, inscripciones);
				break;
			case 5:
				mostrarOrganizadores(organizadores);
				break;
			case 6:
				mostrarEventos(eventos);
				break;
			case 7:
				mostrarInscripciones(inscripciones);
				break;
			case 8:
				mostrarUsuarios(usuarios);
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
public static void registrarOrganizadores(HashMap<String, String[]> organizadores) {
	System.out.println("Nombre: ");
	String nombre;
	nombre=sc.next();
	System.out.println("Email: ");
	String email;
	email=sc.next();
	System.out.println("Telefono: ");
	String telefono;
	telefono=sc.next();
	System.out.println("Contraseña:");
	String contraseña;
	contraseña=sc.next();
	String[] datosorg= {nombre, telefono, contraseña};
	organizadores.put(email, datosorg);
	
}
public static void inscribirseEvento(HashMap<String, String[]> eventos , HashMap<String, String[]> inscripciones) {
	boolean disponible=false;
	System.out.println("Que categoria estas buscando");
	String categoriaElegida;
	categoriaElegida=sc.next();
	System.out.println("Introduce tu correo para poder identificarte:");
	String email;
	email=sc.next();
	System.out.println("Estos son los eventos disponible en "+ categoriaElegida);
	for(String nombreEvento:eventos.keySet()) {
		String[] datosEvento= eventos.get(nombreEvento)	;
		if(datosEvento[6].equalsIgnoreCase(categoriaElegida)) {
			System.out.println("--------------------");
			System.out.println("Nombre: " + nombreEvento);
            System.out.println("Organizador: " + datosEvento[0]);
            System.out.println("Fecha: " + datosEvento[1]);
            System.out.println("Ubicación: " + datosEvento[3]);
            System.out.println("Estado: " + datosEvento[7]);
            System.out.println("--------------------");
            disponible=true;
		}
	}
	if(!disponible) {
		System.out.println("No hay eventos disponibles en esta categoría:");
	}
	
	System.out.println("Ingrese el nombre del evento al que desea inscribirse: ");
    String eventoElegido = sc.next();
    
    if (eventos.containsKey(eventoElegido)) {
        String[] datosInscripcion = {email, eventoElegido};
        inscripciones.put(email + "-" + eventoElegido, datosInscripcion);
        System.out.println("Ahora estas inscrito en el evento " + eventoElegido);
    } else {
        System.out.println("El evento ingresado no existe.");
    }
}
public static void mostrarOrganizadores(HashMap<String, String[]> organizadores) {
	System.out.println("Estos son los organizadores actuales: \n"
			+ "--------------------");
	for(String email: organizadores.keySet()) {
		String[] datosOrg= organizadores.get(email);
		System.out.println("Correo: "+email);
		System.out.println("Nombre: "+ datosOrg[0]);
		System.out.println("Telefono: "+ datosOrg[1]);
		System.out.println("--------------------");
	}
}
public static void mostrarEventos(HashMap<String, String[]> eventos) {
	System.out.println("Estos son los eventos actuales: \n"
			+ "--------------------");
	for(String nombreEvento: eventos.keySet()) {
		String[] datosOrg= eventos.get(nombreEvento);
		System.out.println("Nobre: "+nombreEvento);
		System.out.println("Organizador: "+ datosOrg[0]);
		System.out.println("Fecha: "+ datosOrg[1]);
		System.out.println("Duración: "+ datosOrg[2]);
		System.out.println("Ubicación: "+ datosOrg[3]);
		System.out.println("Tipo: "+ datosOrg[4]);
		System.out.println("Aforo: "+ datosOrg[5]);
		System.out.println("Categoria: "+ datosOrg[6]);
		System.out.println("Estado: "+ datosOrg[7]);
		System.out.println("--------------------");
	}
	
}
public static void mostrarUsuarios(HashMap<String, String[]> usuarios) {
	System.out.println("Estos son los usuarios actuales: \n"
			+ "--------------------");
	for(String email: usuarios.keySet()) {
		String[] datos = usuarios.get(email);
		System.out.println("Correo: "+email);
		System.out.println("Nombre: "+ datos[0]);
		System.out.println("--------------------");
	}
}
public static void mostrarInscripciones(HashMap<String, String[]> inscripciones) {
	System.out.println("Identifiquese para ver sus inscripciones (Introduce tu correo): ");
    String email = sc.next();
    
    System.out.println("Tus inscripciones:");
    boolean encontrado = false;
    
    for (String key : inscripciones.keySet()) {
        String[] datos = inscripciones.get(key);
        if (datos[0].equals(email)) {
            System.out.println("Evento inscrito: " + datos[1]);
            encontrado = true;
        }
    }
    
    if (!encontrado) {
        System.out.println("No estas inscrito/a en ningun evento");
    }
	
}
}
