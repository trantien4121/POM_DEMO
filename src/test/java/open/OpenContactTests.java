package open;

import base.BaseTests;
import org.testng.annotations.Test;

public class OpenContactTests extends BaseTests {
    @Test
    public void testOpenContactPage(){
        homePage.goToContact();
    }
}
