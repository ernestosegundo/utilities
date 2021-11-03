package identifiers;

import java.util.Date;

public interface IIdentifier {
	int identifierID(int lastID);
    int identifierID(int lastID, int increase);
    String identifierID(String firsText, String secondText, int maximumLength);
    String identifierID(String lastID, int maximumLength, String prefix);
    String identifierID(String lastID, int maximumLength, String prefix, int increase);
    String identifierIDESSALUD(String names, String lastName, String motherLastName, String gender, Date birthDate);
}
