import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;


public class IntroTests {

    @Test
    public void getFullName_GivenValidNames_ReturnsFullName() {

        String firsName = "William";
        String lastName = "Baldridge";
        String delimiter = " ";
        String expectedFullName = "William Baldridge";

//        Assert.assertEquals(expectedFullName, getFullNAme(firsName, lastName));

    }

    // Deleted because exception is now thrown before can get a return value
//    @Test
//    public void getFullName_GivenEmptyString_DoesNotReturnFullName() {
//
//        String firsName = "William";
//        String lastName = "";
//        String delimiter = " ";
//        String expectedFullName = "William ";
//
//        Assert.assertNotEquals(expectedFullName, getFullNAme(firsName, lastName, delimiter));
//
//    }


    @Test(expected = IllegalArgumentException.class)
    public void getFullName_GivenInvalidArguments_ThrowsIllegalArgumentException() {

        String firsName = "William";
        String lastName = null;
        String delimiter = " ";

        getFullNAme(firsName, lastName, delimiter);

    }

    @Test
    public void getFullName_GivenNumbersInString_DoesNotReturnFullNAme() {

        String firsName = "1111111111111";
        String lastName = null;
        String delimiter = " ";

        String unexpectedFullName = firsName + delimiter + lastName;

        assertNotEquals(unexpectedFullName, getFullNAme(firsName, lastName, delimiter));

    }


    public static String getFullNAme(String firstName, String lastName, String delimiter) {

        if (firstName == null || lastName == null || delimiter == null)
            throw new IllegalArgumentException();

        if (firstName.equals("") || lastName.equals("") || delimiter.equals(""))
            throw new IllegalArgumentException();




        return firstName + delimiter + lastName;
    }



}
