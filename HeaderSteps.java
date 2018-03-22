package org.fasttrackit.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.fasttrackit.TestBase;
import org.fasttrackit.webviews.Header;
import org.openqa.selenium.support.PageFactory;

//proprietatie din steps nu sunt comune pt mai multi steps
//ca sa fie shareuite intre steps proprietatile trebuie sa fie statice
public class HeaderSteps extends TestBase {
    private Header header= initElemets(Header.class);

    @And("^I search a product by \"([^\"]*)\"$")
    public void iSearchAProductBy(String keyword)
    {
        header.search(keyword);

    }
}

