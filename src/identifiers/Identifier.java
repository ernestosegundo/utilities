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
	public int identifierID(int lastID) {
		try {
			setIdentifier(String.valueOf(lastID + 1));

            return Integer.parseInt(getIdentifier());
		} catch (Exception e) {
			
		}
		
		return Integer.parseInt(getIdentifier());
	}

	@Override
	public int identifierID(int lastID, int increase) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String identifierID(String firsText, String secondText, int maximumLength) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String identifierID(String lastID, int maximumLength, String prefix) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String identifierID(String lastID, int maximumLength, String prefix, int increase) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String identifierIDESSALUD(String names, String lastName, String motherLastName, String gender,
			Date birthDate) {
		// TODO Auto-generated method stub
		return null;
	}

}
