import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MyFirstTest {

    @Test
    public void getString_GivenDifferentCase_ReturnsEqualOrNot() {

        String input = "Codeup";
        String expectedInput = "CodeUp";

//        assertEquals(expectedInput, getString(input));
        assertNotEquals(expectedInput, getString(input));

    }

    public static String getString(String input) {

        return input;
    }


    @Test
    public void getArrayList_GivenDifferentNamedLists_ReturnsSameOrNot() {

        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);

    }

    @Test
    public void getArray_GivenDifferentNamedArrayAndInstanceCreation_ReturnsEquals() {

        int[] numbers = {1, 2, 3};
        int[] otherNumbers = new int[3];
        otherNumbers[0] = 1;
        otherNumbers[1] = 2;
        otherNumbers[2] = 3;


        assertArrayEquals(numbers, otherNumbers);

    }


    @Test
    public void getStringContains_GivenDifferentTrueFalseConditions_ReturnsTrueAndFalse() {

        String language = "PHP";
        language.contains("H"); // use assertTrue for this statement
        language.contains("J"); // use assertFalse for this statement

//        assertTrue(language, language.contains("J"));
        assertFalse(language, language.contains("H"));


    }








}
