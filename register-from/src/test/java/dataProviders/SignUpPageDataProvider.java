package dataProviders;

import org.testng.annotations.DataProvider;

public class SignUpPageDataProvider {

    @DataProvider(name = "signUpPageDataProvider")
    public Object[][] signUpPageDataProvider() {
        return new Object[][] {
                {"chrome", false},
                {"firefox", true},
                {"edge", false},
                {"safari", false}
        };
    }
}