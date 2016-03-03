package hostingmodels;
// Generated 02-mar-2016 10:43:18 by Hibernate Tools 3.4.0.CR1

/**
 * ContenidosTags generated by hbm2java
 */
public class ContenidosTags implements java.io.Serializable {

	private Integer identificador;
	private String nombre;
	private String descripcion;

	public ContenidosTags() {
	}

	public ContenidosTags(String nombre) {
		this.nombre = nombre;
	}

	public ContenidosTags(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	public Integer getIdentificador() {
		return this.identificador;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}