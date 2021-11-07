package identifiers;

import java.util.Date;

public class Identifier implements IIdentifier {
	private String identifier;

	public String getIdentifier() {
		return identifier;
	}

	public void setIdentifier(String identifier) {
		this.identifier = identifier;
	}

	@Override
	/*
		Método que genera un identificador en base al último identificador dado
	 	con un incremento de uno.  
	 */
	public int getID(int lastID) {
		try {
			setIdentifier(String.valueOf(lastID + 1));

            return Integer.parseInt(getIdentifier());
		} catch (Exception e) {
			
		}
		
		return Integer.parseInt(getIdentifier());
	}

	@Override
	/*
		Método que genera un identificador en base al último identificador dado
 		con un incremento dado.  
	 */
	public int getID(int lastID, int increase) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	/*
		Método que genera un identificador en base a dos cadenas de texto.
 		Se debe tener en cuenta la longitud máxima de la cadena de texto resultante.  
	 */
	public String getID(String firsText, String secondText, int maximumLength) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	/*
		Método que genera un identificador en base al último identificador dado;
		además de un prefijo para el identificador y una longitud máxima,
		con un incremento de uno.  
	 */
	public String getID(String lastID, int maximumLength, String prefix) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	/*
		Método que genera un identificador en base al último identificador dado;
		además de un prefijo para el identificador y una longitud máxima,
		con un incremento dado.  
	 */
	public String getID(String lastID, int maximumLength, String prefix, int increase) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	/*
		Método que genera el código ESSALUD (seguro social peruano).  
	 */
	public String getIDESSALUD(String names, String lastName, String motherLastName, String gender,
			Date birthDate) {
		// TODO Auto-generated method stub
		return null;
	}

}
