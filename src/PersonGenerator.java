import java.util.Scanner;
import java.util.ArrayList;

public class PersonGenerator {
    public static void main(String[] args) {

        Scanner pipe = new Scanner(System.in);

        boolean done = false;
        ArrayList<String> personList = new ArrayList<String>();
        String ID = "";
        String firstName = "";
        String lastName = "";
        String title = "";
        int yearOfBirth = 0;
        int listCounter = 0;


        do {

                ID = SafeInput.getNonZeroLenString(pipe,"What is your ID?");
                firstName = SafeInput.getNonZeroLenString(pipe,"What is your first name?");
                lastName = SafeInput.getNonZeroLenString(pipe,"What is your last name?");
                title = SafeInput.getNonZeroLenString(pipe,"What is your title name?");
                yearOfBirth = SafeInput.getInt(pipe,"What is your year of birth?");

                personList.add(ID + ", " + firstName + ", " + lastName + ", " + title + ", " + yearOfBirth);
                listCounter++;

                done = SafeInput.getYNConfirm(pipe, "Are you finished? [Y/N]");

        }while(!done);
        for(int cnt = 0; cnt < listCounter; cnt++)
        {
            String toPrint = personList.get(cnt);
            System.out.println(toPrint);

        }
    }
}

