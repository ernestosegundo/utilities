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
		M�todo que genera un identificador en base al �ltimo identificador dado
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
		M�todo que genera un identificador en base al �ltimo identificador dado
 		con un incremento dado.  
	 */
	public int getID(int lastID, int increase) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	/*
		M�todo que genera un identificador en base a dos cadenas de texto.
 		Se debe tener en cuenta la longitud m�xima de la cadena de texto resultante.  
	 */
	public String getID(String firsText, String secondText, int maximumLength) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	/*
		M�todo que genera un identificador en base al �ltimo identificador dado;
		adem�s de un prefijo para el identificador y una longitud m�xima,
		con un incremento de uno.  
	 */
	public String getID(String lastID, int maximumLength, String prefix) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	/*
		M�todo que genera un identificador en base al �ltimo identificador dado;
		adem�s de un prefijo para el identificador y una longitud m�xima,
		con un incremento dado.  
	 */
	public String getID(String lastID, int maximumLength, String prefix, int increase) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	/*
		M�todo que genera el c�digo ESSALUD (seguro social peruano).  
	 */
	public String getIDESSALUD(String names, String lastName, String motherLastName, String gender,
			Date birthDate) {
		// TODO Auto-generated method stub
		return null;
	}

}
