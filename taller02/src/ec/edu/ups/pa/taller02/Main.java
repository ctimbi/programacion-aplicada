/**
 * @(#)Main.java	1.0, 2018-04-08
 * 
 * Universidad Politécnica Salesiana
 * Carrera de Computación
 * Cuenca - Ecuador	
 */
package ec.edu.ups.pa.taller02;

import java.util.Scanner;

/**
 * Clase principal de la aplicación
 *
 * @version		1.0, 2018-04-08
 * @author		Cristian Timbi
 *
 */
public class Main {

	/**
	 * Método principal de la aplicación que inicia su ejecución.
	 * En la implementación del mismo se considera un programación estructurada
	 * (mala practica) a 
	 * 
	 * @param args	No argumentos
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);	//Instancia para ingreso de datos por el usuario
		Curso curso = new Curso();		//Declaración de objeto curso para manipularlo desde las diferentes opciones
		
		System.out.println("** Programa ejemplo de Taller 02 referido en el enunciado respectivo");
		System.out.println("** Universidad Politécnica Salesiana\r\n" + 
						   "** Carrera de Computación\r\n" + 
						   "** Cuenca - Ecuador");
		
		int opcion = 0;	//Variable para referir la opción del menú seleccionada por el usaurio
		
		do {
			System.out.println("\n\nMenú de la aplicación:\r\n"
				+ "\t 1.  Crear/definir Curso\n"
				+ "\t 2.  Mostrar datos del curso\n"
				+ "\t 3.  Borrar datos del curso\n"
				+ "\t 99. Salir\n"
				+ "#> ");
			opcion = Integer.parseInt(sc.nextLine());
			
			switch (opcion) {
			case 1:
				System.out.print("\n**Datos del curso\n#> ");
				System.out.print("\t Ingrese el código\n#> ");
				int codigo = Integer.parseInt(sc.nextLine());
				System.out.print("\t Ingrese el nombre\n#> ");
				String nombre = sc.nextLine();
				System.out.print("\t Ingrese los contenidos\n#> ");
				String contenidos = sc.nextLine();
				curso.setCodigo(codigo);
				curso.setNombre(nombre);
				curso.setContenidos(contenidos);
				
				System.out.print("\n**Datos del profesor\n#> ");
				System.out.print("\t Ingrese la cédula\n#> ");
				String cedula = sc.nextLine();
				System.out.print("\t Ingrese el nombre\n#> ");
				String nombreProfesor = sc.nextLine();
				System.out.print("\t Ingrese el titulo\n#> ");
				String titulo = sc.nextLine();				
				System.out.print("\t Ingrese un resumen de la hoja de vida\n#> ");
				String resumenHojaVida = sc.nextLine();				
										
				curso.definirProfesor(cedula, nombreProfesor, titulo, resumenHojaVida);				
				/*
				 * Las siguientes dos instrucicones comentadas son código alterntivo a definir un profesor (instrucción anterior)
				 */ 
				//Profesor profesor = new Profesor(cedula, nombreProfesor, titulo, resumenHojaVida);
				//curso.setProfesor(profesor);
				
				int numeroEstudiantes = 0;
				System.out.println("\n**Datos de los estudiantes del curso");
				System.out.print("\t Ingrese el # de estudiantes a inscribir\n#> ");
				numeroEstudiantes = Integer.parseInt(sc.nextLine());
				for(int i=0; i<numeroEstudiantes; i++) {
					System.out.print("\n**Datos del estudiante a inscribir\n#> ");
					System.out.print("\t Ingrese la cédula\n#> ");
					String cedulaEstudiante = sc.nextLine();
					System.out.print("\t Ingrese el nombre\n#> ");
					String nombreEstudiante = sc.nextLine();
					System.out.print("\t Ingrese el direccion\n#> ");
					String direccion = sc.nextLine();
					curso.matricularEnCurso(cedulaEstudiante, nombreEstudiante, direccion, null);					
				}				
				break;
			case 2:
				System.out.println("\n**Mostrando datos del curso (profesor e inscritos)");
				System.out.println("\tDatos del curso\n"
						+ "\t\t Código: " +curso.getCodigo() + "\n"
						+ "\t\t Nombre: " +curso.getNombre() + "\n"
						+ "\t\t Contenidos: " +curso.getContenidos() + "\n"
						+ "\t\t Profesor: \n"
						+ "\t\t\t Cédula: " +curso.getProfesor().getCedula() + "\n"
						+ "\t\t\t Nombre: " +curso.getProfesor().getNombreApellidos() + "\n"
						+ "\t\t\t Título: " +curso.getProfesor().getTitulo()
						);
				System.out.println("\t\tEstudiantes del curso");
				for(int i=0; i<curso.getEstudiantes().size(); i++) {
					Estudiante estudiante = curso.getEstudiantes().get(i);
					System.out.println("\t\t\t: " + estudiante.getCedula() 
						+ "\t\t" + estudiante.getNombreApellido()
						+ "\t\t" + estudiante.getDirecicion());
				}
				break;
			case 3:
				System.out.println("\n**Datos del curso borrados");
				curso = new Curso();
				break;
			default:
				break;
			}		
		}while(opcion!=99);
	}

}
