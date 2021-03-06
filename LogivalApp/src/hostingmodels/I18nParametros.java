package hostingmodels;
// Generated 02-mar-2016 10:43:18 by Hibernate Tools 3.4.0.CR1

/**
 * I18nParametros generated by hbm2java
 */
public class I18nParametros implements java.io.Serializable {

	private Integer identificador;
	private String key;
	private String tipoEditor;
	private String longitudMinima;
	private String longitudMaxima;
	private String editableEnLinea;

	public I18nParametros() {
	}

	public I18nParametros(String key) {
		this.key = key;
	}

	public I18nParametros(String key, String tipoEditor, String longitudMinima, String longitudMaxima,
			String editableEnLinea) {
		this.key = key;
		this.tipoEditor = tipoEditor;
		this.longitudMinima = longitudMinima;
		this.longitudMaxima = longitudMaxima;
		this.editableEnLinea = editableEnLinea;
	}

	public Integer getIdentificador() {
		return this.identificador;
	}

	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
	}

	public String getKey() {
		return this.key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getTipoEditor() {
		return this.tipoEditor;
	}

	public void setTipoEditor(String tipoEditor) {
		this.tipoEditor = tipoEditor;
	}

	public String getLongitudMinima() {
		return this.longitudMinima;
	}

	public void setLongitudMinima(String longitudMinima) {
		this.longitudMinima = longitudMinima;
	}

	public String getLongitudMaxima() {
		return this.longitudMaxima;
	}

	public void setLongitudMaxima(String longitudMaxima) {
		this.longitudMaxima = longitudMaxima;
	}

	public String getEditableEnLinea() {
		return this.editableEnLinea;
	}

	public void setEditableEnLinea(String editableEnLinea) {
		this.editableEnLinea = editableEnLinea;
	}

}
