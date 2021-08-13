import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.RegisterPage;

import java.util.List;

public class CervezaSiempreTest extends BaseTest {

    private HomePage home;

    @Test
    public void loadCervezasiempre() {
        webdriver.get("https://www.cervezasiempre.com/");
    }


    @Test(dependsOnMethods = "loadCervezasiempre")
    public void closePopUpHomePage() {
        home = new HomePage(webdriver);
        String acceptButtonLocation = home.getAcceptButtonLocation();
        WebElement acceptButton = this.buttonAssertionByCssSelector(acceptButtonLocation);
        this.pressButton(acceptButton);
    }

    @Test(dependsOnMethods = "closePopUpHomePage")
    public void selectCoronaBrand() throws InterruptedException {

        home = new HomePage(webdriver);
        String seeProductsButtonLocation = home.getSeeProductsButtonLocation();
        String coronaCheckLocation = home.getCoronaCheckLocation();

        WebElement seeProductsButton = this.buttonAssertionByCssSelector(seeProductsButtonLocation);
        this.pressButton(seeProductsButton);

        WebElement coronaCheck = this.buttonAssertionByCssSelector(coronaCheckLocation);
        this.pressButton(coronaCheck);

    }

    @Test(dependsOnMethods = "selectCoronaBrand")
       public void selectCoronaProduct() {
        home = new HomePage(webdriver);
        String productsButtonLocations = home.getProductsLocation();
        List<WebElement> productsButtons = this.buttonsAssertionByClassName(productsButtonLocations);

        for (WebElement product : productsButtons) {
            if (productsButtons.size() > 0) {
                //Can iterate the list if you expect more than one div of type someDiv.
                 String text = product.getAttribute("alt");
                if (text.contains("Corona")) {
                    this.pressButton(product);
                    return;
                }
            }
        }

    }

    @Test(dependsOnMethods = "selectCoronaProduct")
    public void addCoronaProductToCart() {
        home = new HomePage(webdriver);
        String addButtonLocation = home.getAddButtonLocation();
        WebElement addButton = this.buttonAssertionByCssSelector(addButtonLocation);
        this.pressButton(addButton);
    }

    @Test(dependsOnMethods = "addCoronaProductToCart")
    public void continueToPay() {
        home = new HomePage(webdriver);
        String toPayButtonLocation = home.getToPayButtonLocation();
        WebElement toPayButton = this.buttonAssertionByCssSelector(toPayButtonLocation);
        this.pressButton(toPayButton);
    }

    @Test(dependsOnMethods = "continueToPay")
    public void continueToPayAsertions() {
        RegisterPage register = new RegisterPage(webdriver);
        WebDriver driver = register.getDriver();
        SoftAssert softassert = new SoftAssert();
        WebElement title = register.getTitlePage();
        WebElement facebookSignIn = register.getFacebookSignIn();
        WebElement googleSignIn = register.getGoogleSignIn();

        softassert.assertEquals(driver.getTitle(), "Cerveza Siempre | Tus bebidas favoritas en tu casa | Envío gratis");
        softassert.assertEquals(driver.getCurrentUrl(), "https://www.cervezasiempre.com/registro");

        Boolean verifyTrue = facebookSignIn.getText().equalsIgnoreCase("Registrarse con Facebook");
        softassert.assertTrue(verifyTrue, "Sign in with Facebook doesn't found");
        verifyTrue = googleSignIn.getText().equalsIgnoreCase("Registrarse con Google");
        softassert.assertTrue(verifyTrue, "Sign in with Google doesn't found");
        verifyTrue = title.getText().equalsIgnoreCase("¿Eres cliente nuevo?");
        softassert.assertTrue(verifyTrue, "Title page doesn't found");
        softassert.assertAll();

    }

    public void pressButton(WebElement element) {
        try {
            if(element.isEnabled()){
                element.click();
            }
        } catch (Exception e) {
            Assert.fail("Fail to click: '" + element.getText() + "'.");
        }
        return;
    }

    public WebElement buttonAssertionByCssSelector(String location) {
        WebElement button = null;
        try {
            button = home.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(location)));
        } catch (Exception e) {
            Assert.fail("Button is not visible");
        }
        return button;
    }


    public List<WebElement> buttonsAssertionByClassName(String location) {
        List<WebElement> buttons = null;
        try {
            buttons = home.wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className(location)));
        } catch (Exception e) {
            Assert.fail("Necessary options are not visible");
        }
        return buttons;
    }

    }

