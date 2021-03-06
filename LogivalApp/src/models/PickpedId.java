package models;
// Generated 23-feb-2016 11:32:03 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;

/**
 * PickpedId generated by hbm2java
 */
public class PickpedId implements java.io.Serializable {

	private String refped;
	private String email;
	private String mobile;
	private String idpickp;
	private String lgadr1;
	private String lgadr2;
	private String lgadr3;
	private String lgadr4;
	private String cppick;
	private String city;
	private String pais;
	private String numexp;
	private String agencia;
	private String grupo;
	private String navette;
	private String nomage;
	private String ruta;
	private String modent;
	private String codebar;
	private BigDecimal reembo;

	public PickpedId() {
	}

	public PickpedId(String refped, String idpickp) {
		this.refped = refped;
		this.idpickp = idpickp;
	}

	public PickpedId(String refped, String email, String mobile, String idpickp, String lgadr1, String lgadr2,
			String lgadr3, String lgadr4, String cppick, String city, String pais, String numexp, String agencia,
			String grupo, String navette, String nomage, String ruta, String modent, String codebar,
			BigDecimal reembo) {
		this.refped = refped;
		this.email = email;
		this.mobile = mobile;
		this.idpickp = idpickp;
		this.lgadr1 = lgadr1;
		this.lgadr2 = lgadr2;
		this.lgadr3 = lgadr3;
		this.lgadr4 = lgadr4;
		this.cppick = cppick;
		this.city = city;
		this.pais = pais;
		this.numexp = numexp;
		this.agencia = agencia;
		this.grupo = grupo;
		this.navette = navette;
		this.nomage = nomage;
		this.ruta = ruta;
		this.modent = modent;
		this.codebar = codebar;
		this.reembo = reembo;
	}

	public String getRefped() {
		return this.refped;
	}

	public void setRefped(String refped) {
		this.refped = refped;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getIdpickp() {
		return this.idpickp;
	}

	public void setIdpickp(String idpickp) {
		this.idpickp = idpickp;
	}

	public String getLgadr1() {
		return this.lgadr1;
	}

	public void setLgadr1(String lgadr1) {
		this.lgadr1 = lgadr1;
	}

	public String getLgadr2() {
		return this.lgadr2;
	}

	public void setLgadr2(String lgadr2) {
		this.lgadr2 = lgadr2;
	}

	public String getLgadr3() {
		return this.lgadr3;
	}

	public void setLgadr3(String lgadr3) {
		this.lgadr3 = lgadr3;
	}

	public String getLgadr4() {
		return this.lgadr4;
	}

	public void setLgadr4(String lgadr4) {
		this.lgadr4 = lgadr4;
	}

	public String getCppick() {
		return this.cppick;
	}

	public void setCppick(String cppick) {
		this.cppick = cppick;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPais() {
		return this.pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getNumexp() {
		return this.numexp;
	}

	public void setNumexp(String numexp) {
		this.numexp = numexp;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getGrupo() {
		return this.grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public String getNavette() {
		return this.navette;
	}

	public void setNavette(String navette) {
		this.navette = navette;
	}

	public String getNomage() {
		return this.nomage;
	}

	public void setNomage(String nomage) {
		this.nomage = nomage;
	}

	public String getRuta() {
		return this.ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public String getModent() {
		return this.modent;
	}

	public void setModent(String modent) {
		this.modent = modent;
	}

	public String getCodebar() {
		return this.codebar;
	}

	public void setCodebar(String codebar) {
		this.codebar = codebar;
	}

	public BigDecimal getReembo() {
		return this.reembo;
	}

	public void setReembo(BigDecimal reembo) {
		this.reembo = reembo;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PickpedId))
			return false;
		PickpedId castOther = (PickpedId) other;

		return ((this.getRefped() == castOther.getRefped()) || (this.getRefped() != null
				&& castOther.getRefped() != null && this.getRefped().equals(castOther.getRefped())))
				&& ((this.getEmail() == castOther.getEmail()) || (this.getEmail() != null
						&& castOther.getEmail() != null && this.getEmail().equals(castOther.getEmail())))
				&& ((this.getMobile() == castOther.getMobile()) || (this.getMobile() != null
						&& castOther.getMobile() != null && this.getMobile().equals(castOther.getMobile())))
				&& ((this.getIdpickp() == castOther.getIdpickp()) || (this.getIdpickp() != null
						&& castOther.getIdpickp() != null && this.getIdpickp().equals(castOther.getIdpickp())))
				&& ((this.getLgadr1() == castOther.getLgadr1()) || (this.getLgadr1() != null
						&& castOther.getLgadr1() != null && this.getLgadr1().equals(castOther.getLgadr1())))
				&& ((this.getLgadr2() == castOther.getLgadr2()) || (this.getLgadr2() != null
						&& castOther.getLgadr2() != null && this.getLgadr2().equals(castOther.getLgadr2())))
				&& ((this.getLgadr3() == castOther.getLgadr3()) || (this.getLgadr3() != null
						&& castOther.getLgadr3() != null && this.getLgadr3().equals(castOther.getLgadr3())))
				&& ((this.getLgadr4() == castOther.getLgadr4()) || (this.getLgadr4() != null
						&& castOther.getLgadr4() != null && this.getLgadr4().equals(castOther.getLgadr4())))
				&& ((this.getCppick() == castOther.getCppick()) || (this.getCppick() != null
						&& castOther.getCppick() != null && this.getCppick().equals(castOther.getCppick())))
				&& ((this.getCity() == castOther.getCity()) || (this.getCity() != null && castOther.getCity() != null
						&& this.getCity().equals(castOther.getCity())))
				&& ((this.getPais() == castOther.getPais()) || (this.getPais() != null && castOther.getPais() != null
						&& this.getPais().equals(castOther.getPais())))
				&& ((this.getNumexp() == castOther.getNumexp()) || (this.getNumexp() != null
						&& castOther.getNumexp() != null && this.getNumexp().equals(castOther.getNumexp())))
				&& ((this.getAgencia() == castOther.getAgencia()) || (this.getAgencia() != null
						&& castOther.getAgencia() != null && this.getAgencia().equals(castOther.getAgencia())))
				&& ((this.getGrupo() == castOther.getGrupo()) || (this.getGrupo() != null
						&& castOther.getGrupo() != null && this.getGrupo().equals(castOther.getGrupo())))
				&& ((this.getNavette() == castOther.getNavette()) || (this.getNavette() != null
						&& castOther.getNavette() != null && this.getNavette().equals(castOther.getNavette())))
				&& ((this.getNomage() == castOther.getNomage()) || (this.getNomage() != null
						&& castOther.getNomage() != null && this.getNomage().equals(castOther.getNomage())))
				&& ((this.getRuta() == castOther.getRuta()) || (this.getRuta() != null && castOther.getRuta() != null
						&& this.getRuta().equals(castOther.getRuta())))
				&& ((this.getModent() == castOther.getModent()) || (this.getModent() != null
						&& castOther.getModent() != null && this.getModent().equals(castOther.getModent())))
				&& ((this.getCodebar() == castOther.getCodebar()) || (this.getCodebar() != null
						&& castOther.getCodebar() != null && this.getCodebar().equals(castOther.getCodebar())))
				&& ((this.getReembo() == castOther.getReembo()) || (this.getReembo() != null
						&& castOther.getReembo() != null && this.getReembo().equals(castOther.getReembo())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getRefped() == null ? 0 : this.getRefped().hashCode());
		result = 37 * result + (getEmail() == null ? 0 : this.getEmail().hashCode());
		result = 37 * result + (getMobile() == null ? 0 : this.getMobile().hashCode());
		result = 37 * result + (getIdpickp() == null ? 0 : this.getIdpickp().hashCode());
		result = 37 * result + (getLgadr1() == null ? 0 : this.getLgadr1().hashCode());
		result = 37 * result + (getLgadr2() == null ? 0 : this.getLgadr2().hashCode());
		result = 37 * result + (getLgadr3() == null ? 0 : this.getLgadr3().hashCode());
		result = 37 * result + (getLgadr4() == null ? 0 : this.getLgadr4().hashCode());
		result = 37 * result + (getCppick() == null ? 0 : this.getCppick().hashCode());
		result = 37 * result + (getCity() == null ? 0 : this.getCity().hashCode());
		result = 37 * result + (getPais() == null ? 0 : this.getPais().hashCode());
		result = 37 * result + (getNumexp() == null ? 0 : this.getNumexp().hashCode());
		result = 37 * result + (getAgencia() == null ? 0 : this.getAgencia().hashCode());
		result = 37 * result + (getGrupo() == null ? 0 : this.getGrupo().hashCode());
		result = 37 * result + (getNavette() == null ? 0 : this.getNavette().hashCode());
		result = 37 * result + (getNomage() == null ? 0 : this.getNomage().hashCode());
		result = 37 * result + (getRuta() == null ? 0 : this.getRuta().hashCode());
		result = 37 * result + (getModent() == null ? 0 : this.getModent().hashCode());
		result = 37 * result + (getCodebar() == null ? 0 : this.getCodebar().hashCode());
		result = 37 * result + (getReembo() == null ? 0 : this.getReembo().hashCode());
		return result;
	}

}
