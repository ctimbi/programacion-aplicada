/**
 * @(#)Curso.java	1.0, 2018-04-08
 * 
 * Universidad Politécnica Salesiana
 * Carrera de Computación
 * Cuenca - Ecuador	
 */

package ec.edu.ups.pa.taller02;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Clase para la abstracción de los objetos referidos a un curso
 * Como objeto se podra definir los datos informativos del curso , 
 * así como los estudiantes inscritos y el profesor del curso
 *
 * @version		1.0, 2018-04-08
 * @author		Cristian Timbi
 *
 */
public class Curso {

	private int codigo;
	private String nombre;
	private String contenidos;
	
	private Profesor profesor;
	private List<Estudiante> estudiantes;
	
	/**
	 * Constructor de clase sin parametros, usado solo para declaración del objeto
	 */
	public Curso() {
		
	}

	/**
	 * Contructo de clase que la inicializa a partir de los datos base del objeto
	 * @param codigo		Código o ID de curso
	 * @param nombre		Nombre o titulo del curso
	 * @param contenidos	Contenidos a tratarse en el curso
	 */
	public Curso(int codigo, String nombre, String contenidos) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.contenidos = contenidos;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getContenidos() {
		return contenidos;
	}
	public void setContenidos(String contenidos) {
		this.contenidos = contenidos;
	}
	public Profesor getProfesor() {
		return profesor;
	}
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}
	
	/**
	 * Permite recuperar la coleccion de los estudiantes inscritos o matriculados en el curso
	 * @return	Colleccion de estudiantes asociados/matriculados en el curso
	 */
	public List<Estudiante> getEstudiantes() {
		return estudiantes;
	}
	public void setEstudiantes(List<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	@Override
	public String toString() {
		return "Curso [codigo=" + codigo + ", nombre=" + nombre + ", contenidos=" + contenidos + "]";
	}
	
	/**
	 * Procedimiento que estable el profesor del curso, por medio de setear un objeto profesor
	 * @param cedula
	 * @param nombres
	 * @param titulo
	 * @param hojaVida
	 */
	public void definirProfesor(String cedula, String nombres, String titulo, String hojaVida) {
		Profesor p = new Profesor(cedula, nombres, titulo, hojaVida);
		this.setProfesor(p);	// this.profesor = p;			
	}
	
	/**
	 * Procedimiento para matricular un estidante en un curso, por medio de a�adir 
	 * un objeto estudiante a la coleccion de estudiantes
	 * @param cedula			Identificador del estudiante
	 * @param nombres			Nombre y apillidos completos
	 * @param direccion			Direcci�n de domicilio
	 * @param fechaNacimiento	Fecha de nacimiento
	 */
	public void matricularEnCurso(String cedula, String nombres, String direccion, Date fechaNacimiento) {
		//Verifica si la colección estudiantes es null para mandar a instanciar y poder trabajar con ella
		if(this.estudiantes==null)	
			this.estudiantes = new ArrayList<>();
		
		Estudiante estudiante = new Estudiante(cedula, nombres, direccion, fechaNacimiento);
		this.estudiantes.add(estudiante);
	}
}
