package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;
import java.util.Set;

public class RegisterPage extends PageObject implements WebDriver {

    @FindBy(how = How.CSS, using = "#root > div > div > div:nth-child(2) > div > div.container-register > div:nth-child(2) > div:nth-child(1) > div.icon-name")
    private WebElement facebookSignIn;


    @FindBy(how = How.CSS, using = "#root > div > div > div:nth-child(2) > div > div.container-register > div:nth-child(1) > span._30DzLjGa7xssCTiDR9Beja._3ir0VCICsAhEHJ2qBbqhM1._2gUDlA-IBoujHKK4RBDF8x")
    private WebElement titlePage;

    @FindBy(how = How.CSS, using = "#root > div > div > div:nth-child(2) > div > div.container-register > div:nth-child(2) > div:nth-child(2) > div.icon-name")
    private WebElement googleSignIn;


    public RegisterPage(WebDriver webdriver) {
        super(webdriver);
    }

    public WebElement getFacebookSignIn() {
        return facebookSignIn;
    }

    public WebElement getTitlePage() {
        return titlePage;
    }
    public WebElement getGoogleSignIn() {
        return googleSignIn;
    }

    @Override
    public void get(String url) {

    }

    @Override
    public String getCurrentUrl() {
        return null;
    }

    @Override
    public String getTitle() {
        return null;
    }

    @Override
    public List<WebElement> findElements(By by) {
        return null;
    }

    @Override
    public WebElement findElement(By by) {
        return null;
    }

    @Override
    public String getPageSource() {
        return null;
    }

    @Override
    public void close() {

    }

    @Override
    public void quit() {

    }

    @Override
    public Set<String> getWindowHandles() {
        return null;
    }

    @Override
    public String getWindowHandle() {
        return null;
    }

    @Override
    public TargetLocator switchTo() {
        return null;
    }

    @Override
    public Navigation navigate() {
        return null;
    }

    @Override
    public Options manage() {
        return null;
    }
}
