package practicaunidad3;

/**
 * Sirve para ingresar o retirar una cantidad de dinero introducida por el usuario a su cuenta
 * @author Dani
 * @since 1/12/2021
 * @version 1.0
 */
public class CCuenta {
	/**
	 * Declara el atributo nombre para el nombre del cliente
	 */
	protected String nombre;
	/**
	 * Declara el atributo cuenta para el numero de la cuenta
	 */
	private String cuenta;
	/**
	 * Declara el atributo saldo para el saldo de la cuenta
	 */
	private double saldo;
	/**
	 * Declara el atributo tipoInter�s para el tipo de inter�s de la cuenta
	 */
	private double tipoInter�s;

	
	/**
	 * Constructor de la clase principal, los valores se inicializan a 0
	 */
	public CCuenta() {
	}

	
	/**
	 * Otro constructor de la clase principal, los valores se inicializan seg�n los par�metros que introduzca el usuario
	 * @param nom	nombre del cliente
	 * @param cue	numero de cuenta
	 * @param sal	saldo de la cuenta
	 * @param tipo	tipo de inter�s de la cuenta
	 */
	public CCuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
		tipoInter�s = tipo;
	}

	
	/**
	 * Otorga el valor del par�metro al atributo nombre
	 * @param nom	nombre que introduce el usuario
	 */
	public void asignarNombre(String nom) {
		nombre = nom;
	}

	
	/**
	 * Retorna el nombre del titular de la cuenta
	 * @return nombre	nombre del titular de la cuenta
	 */
	public String obtenerNombre() {
		return nombre;
	}

	
	/**
	 * Retorna el saldo de la cuenta
	 * @return saldo	saldo de la cuenta
	 */
	public double estado() {
		return saldo;
	}

	
	/**
	 * Ingresa una cantidad de dinero introducida por el usuario al saldo de la cuenta y lo actualiza
	 * @param cantidad	cantidad de dinero que introduce el usuario
	 */
	public void ingresar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede ingresar una cantidad negativa");
		}
		setSaldo(saldo + cantidad);
	}

	
	/**
	 * Retira una cantidad de dinero introducida por el usuario del saldo de la cuenta y lo actualiza
	 * @param cantidad	cantidad de dinero que retira el usuario
	 */
	public void retirar(double cantidad) throws Exception {
		if (cantidad < 0) {
			throw new Exception("No se puede retirar una cantidad negativa");
		}
		if (estado() < cantidad) {
			throw new Exception("No se hay suficiente saldo");
		}
		setSaldo(saldo - cantidad);
	}

	
	/**
	 * Retorna el numero de cuenta
	 * @return cuenta	numero de cuenta
	 */
	public String obtenerCuenta() {
		return cuenta;
	}

	
	/**
	 * Otorga el valor del par�metro al atributo cuenta
	 * @param cuenta	numero de cuenta
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	
	/**
	 * Otorga el valor del par�metro al atributo saldo
	 * @param saldo		saldo de la cuenta
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	/**
	 * Retorna el tipo de inter�s de la cuenta
	 * @return tipoInter�s	tipo inter�s de la cuenta
	 */
	public double getTipoInter�s() {
		return tipoInter�s;
	}

	
	/**
	 * Otorga el valor del par�metro al atributo tipoInter�s
	 * @param tipoInter�s	tipo de inter�s de la cuenta
	 */
	public void setTipoInter�s(double tipoInter�s) {
		this.tipoInter�s = tipoInter�s;
	}
}
