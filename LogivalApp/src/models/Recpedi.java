package models;
// Generated 23-feb-2016 11:32:03 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Recpedi generated by hbm2java
 */
public class Recpedi implements java.io.Serializable {

	private RecpediId id;
	private Date fecped;
	private Character indser;
	private Character reserv;
	private Date fecent;
	private Date fecrec;
	private Date horrec;
	private Character modent;
	private Date fecanu;
	private Date horanu;
	private String obsadm;
	private String transp;
	private Character tippor;
	private Short codinc;

	public Recpedi() {
	}

	public Recpedi(RecpediId id, Date fecped) {
		this.id = id;
		this.fecped = fecped;
	}

	public Recpedi(RecpediId id, Date fecped, Character indser, Character reserv, Date fecent, Date fecrec, Date horrec,
			Character modent, Date fecanu, Date horanu, String obsadm, String transp, Character tippor, Short codinc) {
		this.id = id;
		this.fecped = fecped;
		this.indser = indser;
		this.reserv = reserv;
		this.fecent = fecent;
		this.fecrec = fecrec;
		this.horrec = horrec;
		this.modent = modent;
		this.fecanu = fecanu;
		this.horanu = horanu;
		this.obsadm = obsadm;
		this.transp = transp;
		this.tippor = tippor;
		this.codinc = codinc;
	}

	public RecpediId getId() {
		return this.id;
	}

	public void setId(RecpediId id) {
		this.id = id;
	}

	public Date getFecped() {
		return this.fecped;
	}

	public void setFecped(Date fecped) {
		this.fecped = fecped;
	}

	public Character getIndser() {
		return this.indser;
	}

	public void setIndser(Character indser) {
		this.indser = indser;
	}

	public Character getReserv() {
		return this.reserv;
	}

	public void setReserv(Character reserv) {
		this.reserv = reserv;
	}

	public Date getFecent() {
		return this.fecent;
	}

	public void setFecent(Date fecent) {
		this.fecent = fecent;
	}

	public Date getFecrec() {
		return this.fecrec;
	}

	public void setFecrec(Date fecrec) {
		this.fecrec = fecrec;
	}

	public Date getHorrec() {
		return this.horrec;
	}

	public void setHorrec(Date horrec) {
		this.horrec = horrec;
	}

	public Character getModent() {
		return this.modent;
	}

	public void setModent(Character modent) {
		this.modent = modent;
	}

	public Date getFecanu() {
		return this.fecanu;
	}

	public void setFecanu(Date fecanu) {
		this.fecanu = fecanu;
	}

	public Date getHoranu() {
		return this.horanu;
	}

	public void setHoranu(Date horanu) {
		this.horanu = horanu;
	}

	public String getObsadm() {
		return this.obsadm;
	}

	public void setObsadm(String obsadm) {
		this.obsadm = obsadm;
	}

	public String getTransp() {
		return this.transp;
	}

	public void setTransp(String transp) {
		this.transp = transp;
	}

	public Character getTippor() {
		return this.tippor;
	}

	public void setTippor(Character tippor) {
		this.tippor = tippor;
	}

	public Short getCodinc() {
		return this.codinc;
	}

	public void setCodinc(Short codinc) {
		this.codinc = codinc;
	}

}
