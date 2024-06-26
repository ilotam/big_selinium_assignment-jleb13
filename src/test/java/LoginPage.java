import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class LoginPage extends PageBase{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginValidUser(String email, String password) {
        try {
            logger.info(email);
            logger.info(password);
            waitAndReturnElement(INPUT_TYPE_EMAIL).sendKeys(email);
            waitAndReturnElement(INPUT_TYPE_PASSWORD).sendKeys(password);
            waitUntilClickableAndReturnElement(LOGIN_SUBMIT).click();
        } catch (NoSuchElementException e) {
            System.out.println("Button click failed: " + e.getMessage());
        }
    }
}
