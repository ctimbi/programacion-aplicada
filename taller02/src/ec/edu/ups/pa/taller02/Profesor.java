/**
 * @(#)Profesor.java	1.0, 2018-04-08
 * 
 * Universidad Politécnica Salesiana
 * Carrera de Computación
 * Cuenca - Ecuador	
 */
package ec.edu.ups.pa.taller02;

/**
 * Clase para la abstracción de los objetos referidos a un profesor
 * Como objeto se permite definir los datos informativos p base del profesor
 *
 * @version		1.0, 2018-04-08
 * @author		Cristian Timbi
 *
 */
public class Profesor {
	
	private String cedula;
	private String nombreApellidos;
	private String titulo;
	private String resumenHojaVida;
	
	public Profesor(String cedula, String nombreApellidos, String titulo, String resumenHojaVida) {
		super();
		this.cedula = cedula;
		this.nombreApellidos = nombreApellidos;
		this.titulo = titulo;
		this.resumenHojaVida = resumenHojaVida;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombreApellidos() {
		return nombreApellidos;
	}

	public void setNombreApellidos(String nombreApellidos) {
		this.nombreApellidos = nombreApellidos;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getResumenHojaVida() {
		return resumenHojaVida;
	}

	public void setResumenHojaVida(String resumenHojaVida) {
		this.resumenHojaVida = resumenHojaVida;
	}

	@Override
	public String toString() {
		return "Profesor [cedula=" + cedula + ", nombreApellidos=" + nombreApellidos + ", titulo=" + titulo
				+ ", resumenHojaVida=" + resumenHojaVida + "]";
	}
}
