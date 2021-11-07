package identifiers;

import java.util.Date;

public interface IIdentifier {
	int getID(int lastID);
    int getID(int lastID, int increase);
    String getID(String firsText, String secondText, int maximumLength);
    String getID(String lastID, int maximumLength, String prefix);
    String getID(String lastID, int maximumLength, String prefix, int increase);
    String getIDESSALUD(String names, String fatherLastName, String motherLastName, String gender, Date birthDate);
}
