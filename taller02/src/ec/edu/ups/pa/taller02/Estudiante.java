/**
 * @(#)Estudiante.java	1.0, 2018-04-08
 * 
 * Universidad Politécnica Salesiana
 * Carrera de Computación
 * Cuenca - Ecuador	
 */
package ec.edu.ups.pa.taller02;

import java.util.Date;

/**
 * Clase para la abstracción de los objetos referidos a un estudiante
 * Como objeto se permite definir los datos informativos p base del estudiante
 *
 * @version		1.0, 2018-04-08
 * @author		Cristian Timbi
 *
 */
public class Estudiante {

	private String cedula;
	private String nombreApellido;
	private String direcicion;
	private Date fechaNacimiento;
	
	public Estudiante(String cedula, String nombreApellido, String direcicion, Date fechaNacimiento) {
		super();
		this.cedula = cedula;
		this.nombreApellido = nombreApellido;
		this.direcicion = direcicion;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombreApellido() {
		return nombreApellido;
	}

	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}

	public String getDirecicion() {
		return direcicion;
	}

	public void setDirecicion(String direcicion) {
		this.direcicion = direcicion;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Estudiante [cedula=" + cedula + ", nombreApellido=" + nombreApellido + ", direcicion=" + direcicion
				+ ", fechaNacimiento=" + fechaNacimiento + "]";
	}
}
