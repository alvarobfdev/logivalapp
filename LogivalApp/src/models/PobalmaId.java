package models;
// Generated 23-feb-2016 11:32:03 by Hibernate Tools 3.4.0.CR1

/**
 * PobalmaId generated by hbm2java
 */
public class PobalmaId implements java.io.Serializable {

	private int numero;
	private short codemp;
	private short coddel;

	public PobalmaId() {
	}

	public PobalmaId(int numero, short codemp, short coddel) {
		this.numero = numero;
		this.codemp = codemp;
		this.coddel = coddel;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public short getCodemp() {
		return this.codemp;
	}

	public void setCodemp(short codemp) {
		this.codemp = codemp;
	}

	public short getCoddel() {
		return this.coddel;
	}

	public void setCoddel(short coddel) {
		this.coddel = coddel;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PobalmaId))
			return false;
		PobalmaId castOther = (PobalmaId) other;

		return (this.getNumero() == castOther.getNumero()) && (this.getCodemp() == castOther.getCodemp())
				&& (this.getCoddel() == castOther.getCoddel());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getNumero();
		result = 37 * result + this.getCodemp();
		result = 37 * result + this.getCoddel();
		return result;
	}

}
