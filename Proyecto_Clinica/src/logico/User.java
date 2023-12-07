package logico;

import java.io.Serializable;

public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1075017084945131371L;
	private String usuario;
	private String clave;
	private String idpersona;
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(String idpersona) {
		this.idpersona = idpersona;
	}
	public User(String usuario, String clave, String idpersona) {
		super();
		this.usuario = usuario;
		this.clave = clave;
		this.idpersona = idpersona;
	}

}
