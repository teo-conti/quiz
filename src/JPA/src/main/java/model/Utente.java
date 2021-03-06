package model;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Utente
 *
 */
@Entity
public class Utente implements Serializable {

	   
	@Id
	private String username;
	private String email;
	private String dataiscrizione;
	private String password;
	private String token;
	private String immagine;
	private int punteggio;
	private String nazionalita;
	private static final long serialVersionUID = 1L;

	public Utente() {
		super();
	}   
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	public String getDataiscrizione() {
		return this.dataiscrizione;
	}

	public void setDataiscrizione(String dataiscrizione) {
		this.dataiscrizione = dataiscrizione;
	}   
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}   
	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}   
	public String getImmagine() {
		return this.immagine;
	}

	public void setImmagine(String immagine) {
		this.immagine = immagine;
	}   
	public int getPunteggio() {
		return this.punteggio;
	}

	public void setPunteggio(int punteggio) {
		this.punteggio = punteggio;
	}   
	public String getNazionalita() {
		return this.nazionalita;
	}

	public void setNazionalita(String nazionalita) {
		this.nazionalita = nazionalita;
	}
   
}
