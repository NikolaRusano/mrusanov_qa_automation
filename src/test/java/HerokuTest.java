import org.junit.Test;

public class HerokuTest {

    @Test
    public void changeCheckBox(){
        //TO DO add a test which goes to http://the-internet.herokuapp.com/checkboxes URL and check checkbox
        //Verify checkbox is checked in the test
    }

    @Test
    public void dynamicElement(){
        //TO DO add a test which goes to http://the-internet.herokuapp.com/entry_ad URL and closes the pop-up
        //then it clicks `click here.` link and checks `THIS IS A MODAL WINDOW` text is displayed on the page
    }

    @Test
    public void testInvalidLogin(){
        //TO DO add a test which goes to http://the-internet.herokuapp.com/login URL and fills in incorrect details
        //then it clicks `Login` button
        //Here should be a check on error message is displayed on the page
    }

    @Test
    public void testValidLogin(){
        //TO DO add a test which goes to http://the-internet.herokuapp.com/login URL and fills in correct details
        //then it clicks `Login` button
        //Here should be a check that user is logged in and a new content is displayed
    }
}
