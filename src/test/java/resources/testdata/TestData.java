package resources.testdata;

import org.testng.annotations.DataProvider;

/**
 * Created by Neha
 */
public class TestData {

    @DataProvider(name = "productPage")
    public Object[][] getData() {
        Object[][] data = new Object[][]{
                { "Blouse","2","M","White"},
                { "Printed Dress","3","L","Orange"},
                { "Printed Chiffon Dress","4","S","Green"},
                { "Printed Summer Dress","2","M","Blue"},

        };
        return data;
    }

    @DataProvider(name = "singlePageData")
    public Object[][] getData1() {
        Object[][] page = new Object[][]{
                {"", "123456", "An email address required."},
                {"abcd@gmail.com", "", "Password is required."},
                {"adfdgfg", "123456 ", "Invalid email address."},
                {"abcd@gmail.com", "123456 ", "Authentication failed."},
        };
        return page;
    }

}
