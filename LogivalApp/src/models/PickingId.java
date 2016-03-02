package models;
// Generated 23-feb-2016 11:32:03 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * PickingId generated by hbm2java
 */
public class PickingId implements java.io.Serializable {

	private int sesionid;
	private short sesionln;
	private int pedidono;
	private short pedidoln;
	private Short numorden;
	private Date fechaped;
	private Date fechaent;
	private String codigokt;
	private String codigoar;
	private String descrip;
	private Integer canpedi;
	private Integer canserv;
	private String lotefb;
	private String horizo;
	private String vertic;
	private String nomcli;
	private String orgcli;
	private String loccli;
	private String domcli1;
	private String domcli2;
	private String domcli3;
	private String pobcli;
	private String prvcli;
	private String cpocli;
	private String paicli;

	public PickingId() {
	}

	public PickingId(int sesionid, short sesionln, int pedidono, short pedidoln) {
		this.sesionid = sesionid;
		this.sesionln = sesionln;
		this.pedidono = pedidono;
		this.pedidoln = pedidoln;
	}

	public PickingId(int sesionid, short sesionln, int pedidono, short pedidoln, Short numorden, Date fechaped,
			Date fechaent, String codigokt, String codigoar, String descrip, Integer canpedi, Integer canserv,
			String lotefb, String horizo, String vertic, String nomcli, String orgcli, String loccli, String domcli1,
			String domcli2, String domcli3, String pobcli, String prvcli, String cpocli, String paicli) {
		this.sesionid = sesionid;
		this.sesionln = sesionln;
		this.pedidono = pedidono;
		this.pedidoln = pedidoln;
		this.numorden = numorden;
		this.fechaped = fechaped;
		this.fechaent = fechaent;
		this.codigokt = codigokt;
		this.codigoar = codigoar;
		this.descrip = descrip;
		this.canpedi = canpedi;
		this.canserv = canserv;
		this.lotefb = lotefb;
		this.horizo = horizo;
		this.vertic = vertic;
		this.nomcli = nomcli;
		this.orgcli = orgcli;
		this.loccli = loccli;
		this.domcli1 = domcli1;
		this.domcli2 = domcli2;
		this.domcli3 = domcli3;
		this.pobcli = pobcli;
		this.prvcli = prvcli;
		this.cpocli = cpocli;
		this.paicli = paicli;
	}

	public int getSesionid() {
		return this.sesionid;
	}

	public void setSesionid(int sesionid) {
		this.sesionid = sesionid;
	}

	public short getSesionln() {
		return this.sesionln;
	}

	public void setSesionln(short sesionln) {
		this.sesionln = sesionln;
	}

	public int getPedidono() {
		return this.pedidono;
	}

	public void setPedidono(int pedidono) {
		this.pedidono = pedidono;
	}

	public short getPedidoln() {
		return this.pedidoln;
	}

	public void setPedidoln(short pedidoln) {
		this.pedidoln = pedidoln;
	}

	public Short getNumorden() {
		return this.numorden;
	}

	public void setNumorden(Short numorden) {
		this.numorden = numorden;
	}

	public Date getFechaped() {
		return this.fechaped;
	}

	public void setFechaped(Date fechaped) {
		this.fechaped = fechaped;
	}

	public Date getFechaent() {
		return this.fechaent;
	}

	public void setFechaent(Date fechaent) {
		this.fechaent = fechaent;
	}

	public String getCodigokt() {
		return this.codigokt;
	}

	public void setCodigokt(String codigokt) {
		this.codigokt = codigokt;
	}

	public String getCodigoar() {
		return this.codigoar;
	}

	public void setCodigoar(String codigoar) {
		this.codigoar = codigoar;
	}

	public String getDescrip() {
		return this.descrip;
	}

	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}

	public Integer getCanpedi() {
		return this.canpedi;
	}

	public void setCanpedi(Integer canpedi) {
		this.canpedi = canpedi;
	}

	public Integer getCanserv() {
		return this.canserv;
	}

	public void setCanserv(Integer canserv) {
		this.canserv = canserv;
	}

	public String getLotefb() {
		return this.lotefb;
	}

	public void setLotefb(String lotefb) {
		this.lotefb = lotefb;
	}

	public String getHorizo() {
		return this.horizo;
	}

	public void setHorizo(String horizo) {
		this.horizo = horizo;
	}

	public String getVertic() {
		return this.vertic;
	}

	public void setVertic(String vertic) {
		this.vertic = vertic;
	}

	public String getNomcli() {
		return this.nomcli;
	}

	public void setNomcli(String nomcli) {
		this.nomcli = nomcli;
	}

	public String getOrgcli() {
		return this.orgcli;
	}

	public void setOrgcli(String orgcli) {
		this.orgcli = orgcli;
	}

	public String getLoccli() {
		return this.loccli;
	}

	public void setLoccli(String loccli) {
		this.loccli = loccli;
	}

	public String getDomcli1() {
		return this.domcli1;
	}

	public void setDomcli1(String domcli1) {
		this.domcli1 = domcli1;
	}

	public String getDomcli2() {
		return this.domcli2;
	}

	public void setDomcli2(String domcli2) {
		this.domcli2 = domcli2;
	}

	public String getDomcli3() {
		return this.domcli3;
	}

	public void setDomcli3(String domcli3) {
		this.domcli3 = domcli3;
	}

	public String getPobcli() {
		return this.pobcli;
	}

	public void setPobcli(String pobcli) {
		this.pobcli = pobcli;
	}

	public String getPrvcli() {
		return this.prvcli;
	}

	public void setPrvcli(String prvcli) {
		this.prvcli = prvcli;
	}

	public String getCpocli() {
		return this.cpocli;
	}

	public void setCpocli(String cpocli) {
		this.cpocli = cpocli;
	}

	public String getPaicli() {
		return this.paicli;
	}

	public void setPaicli(String paicli) {
		this.paicli = paicli;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PickingId))
			return false;
		PickingId castOther = (PickingId) other;

		return (this.getSesionid() == castOther.getSesionid()) && (this.getSesionln() == castOther.getSesionln())
				&& (this.getPedidono() == castOther.getPedidono()) && (this.getPedidoln() == castOther.getPedidoln())
				&& ((this.getNumorden() == castOther.getNumorden()) || (this.getNumorden() != null
						&& castOther.getNumorden() != null && this.getNumorden().equals(castOther.getNumorden())))
				&& ((this.getFechaped() == castOther.getFechaped()) || (this.getFechaped() != null
						&& castOther.getFechaped() != null && this.getFechaped().equals(castOther.getFechaped())))
				&& ((this.getFechaent() == castOther.getFechaent()) || (this.getFechaent() != null
						&& castOther.getFechaent() != null && this.getFechaent().equals(castOther.getFechaent())))
				&& ((this.getCodigokt() == castOther.getCodigokt()) || (this.getCodigokt() != null
						&& castOther.getCodigokt() != null && this.getCodigokt().equals(castOther.getCodigokt())))
				&& ((this.getCodigoar() == castOther.getCodigoar()) || (this.getCodigoar() != null
						&& castOther.getCodigoar() != null && this.getCodigoar().equals(castOther.getCodigoar())))
				&& ((this.getDescrip() == castOther.getDescrip()) || (this.getDescrip() != null
						&& castOther.getDescrip() != null && this.getDescrip().equals(castOther.getDescrip())))
				&& ((this.getCanpedi() == castOther.getCanpedi()) || (this.getCanpedi() != null
						&& castOther.getCanpedi() != null && this.getCanpedi().equals(castOther.getCanpedi())))
				&& ((this.getCanserv() == castOther.getCanserv()) || (this.getCanserv() != null
						&& castOther.getCanserv() != null && this.getCanserv().equals(castOther.getCanserv())))
				&& ((this.getLotefb() == castOther.getLotefb()) || (this.getLotefb() != null
						&& castOther.getLotefb() != null && this.getLotefb().equals(castOther.getLotefb())))
				&& ((this.getHorizo() == castOther.getHorizo()) || (this.getHorizo() != null
						&& castOther.getHorizo() != null && this.getHorizo().equals(castOther.getHorizo())))
				&& ((this.getVertic() == castOther.getVertic()) || (this.getVertic() != null
						&& castOther.getVertic() != null && this.getVertic().equals(castOther.getVertic())))
				&& ((this.getNomcli() == castOther.getNomcli()) || (this.getNomcli() != null
						&& castOther.getNomcli() != null && this.getNomcli().equals(castOther.getNomcli())))
				&& ((this.getOrgcli() == castOther.getOrgcli()) || (this.getOrgcli() != null
						&& castOther.getOrgcli() != null && this.getOrgcli().equals(castOther.getOrgcli())))
				&& ((this.getLoccli() == castOther.getLoccli()) || (this.getLoccli() != null
						&& castOther.getLoccli() != null && this.getLoccli().equals(castOther.getLoccli())))
				&& ((this.getDomcli1() == castOther.getDomcli1()) || (this.getDomcli1() != null
						&& castOther.getDomcli1() != null && this.getDomcli1().equals(castOther.getDomcli1())))
				&& ((this.getDomcli2() == castOther.getDomcli2()) || (this.getDomcli2() != null
						&& castOther.getDomcli2() != null && this.getDomcli2().equals(castOther.getDomcli2())))
				&& ((this.getDomcli3() == castOther.getDomcli3()) || (this.getDomcli3() != null
						&& castOther.getDomcli3() != null && this.getDomcli3().equals(castOther.getDomcli3())))
				&& ((this.getPobcli() == castOther.getPobcli()) || (this.getPobcli() != null
						&& castOther.getPobcli() != null && this.getPobcli().equals(castOther.getPobcli())))
				&& ((this.getPrvcli() == castOther.getPrvcli()) || (this.getPrvcli() != null
						&& castOther.getPrvcli() != null && this.getPrvcli().equals(castOther.getPrvcli())))
				&& ((this.getCpocli() == castOther.getCpocli()) || (this.getCpocli() != null
						&& castOther.getCpocli() != null && this.getCpocli().equals(castOther.getCpocli())))
				&& ((this.getPaicli() == castOther.getPaicli()) || (this.getPaicli() != null
						&& castOther.getPaicli() != null && this.getPaicli().equals(castOther.getPaicli())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getSesionid();
		result = 37 * result + this.getSesionln();
		result = 37 * result + this.getPedidono();
		result = 37 * result + this.getPedidoln();
		result = 37 * result + (getNumorden() == null ? 0 : this.getNumorden().hashCode());
		result = 37 * result + (getFechaped() == null ? 0 : this.getFechaped().hashCode());
		result = 37 * result + (getFechaent() == null ? 0 : this.getFechaent().hashCode());
		result = 37 * result + (getCodigokt() == null ? 0 : this.getCodigokt().hashCode());
		result = 37 * result + (getCodigoar() == null ? 0 : this.getCodigoar().hashCode());
		result = 37 * result + (getDescrip() == null ? 0 : this.getDescrip().hashCode());
		result = 37 * result + (getCanpedi() == null ? 0 : this.getCanpedi().hashCode());
		result = 37 * result + (getCanserv() == null ? 0 : this.getCanserv().hashCode());
		result = 37 * result + (getLotefb() == null ? 0 : this.getLotefb().hashCode());
		result = 37 * result + (getHorizo() == null ? 0 : this.getHorizo().hashCode());
		result = 37 * result + (getVertic() == null ? 0 : this.getVertic().hashCode());
		result = 37 * result + (getNomcli() == null ? 0 : this.getNomcli().hashCode());
		result = 37 * result + (getOrgcli() == null ? 0 : this.getOrgcli().hashCode());
		result = 37 * result + (getLoccli() == null ? 0 : this.getLoccli().hashCode());
		result = 37 * result + (getDomcli1() == null ? 0 : this.getDomcli1().hashCode());
		result = 37 * result + (getDomcli2() == null ? 0 : this.getDomcli2().hashCode());
		result = 37 * result + (getDomcli3() == null ? 0 : this.getDomcli3().hashCode());
		result = 37 * result + (getPobcli() == null ? 0 : this.getPobcli().hashCode());
		result = 37 * result + (getPrvcli() == null ? 0 : this.getPrvcli().hashCode());
		result = 37 * result + (getCpocli() == null ? 0 : this.getCpocli().hashCode());
		result = 37 * result + (getPaicli() == null ? 0 : this.getPaicli().hashCode());
		return result;
	}

}