package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class HomePage extends PageObject implements WebDriver {

    String acceptButtonLocation = "#app > div:nth-child(2) > div.craft-ui_breakpoint_2g98f.craft-ui_mobile-up_2KwWN > div.craft-ui_modal-wrapper_11LWj.craft-ui_is-visible_2pWHb > div > div > button.craft-ui_button_3HSEj.craft-ui_primary_2pLbz.craft-ui_secondary-color_NsQi0";
    String seeProductsButtonLocation = "#app > div.layout-container_JYkc8 > div.header-container_3aImX > div.craft-ui_wrapper_2l73v > div.craft-ui_header-box_2mg-H > div.craft-ui_nav-list-container_3MV1n > div:nth-child(1) > a";
    String coronaCheckLocation = "#app > div.layout-container_JYkc8 > div.content-container_3LgKt > div:nth-child(1) > div.filters-menu_ADUs7 > div.filter-menu-desktop_256NS > div > div > div.magic-width_1AGp1 > div:nth-child(3) > div.craft-ui_content_a-r_i > div > div:nth-child(3)";
    String productsLocation = "catalog-img_CyzFo";
    String addButtonLocation = "#root > div > div > div > div.content-container > div > div:nth-child(2) > div > div > div > div > div > div.product-add-to-cart > div > div.add-to-cart-button > div";
    String toPayButtonLocation = "#root > div > div > div > div.craft-ui_wrapper_3KZ7S > div.craft-ui_header-box_3H91o > div:nth-child(5) > div.craft-ui_right-to-left-menu-wrapper_3JrSf.craft-ui_visible_1YDs0 > div > div.shopping-cart-content_Sm_6c > div.sc-gtsrHT.gfuSqG > button";


    public String getToPayButtonLocation() {
        return toPayButtonLocation;
    }

    public String getAddButtonLocation() {
        return addButtonLocation;
    }

    public String getProductsLocation() {
        return productsLocation;
    }
    public String getCoronaCheckLocation() {
        return coronaCheckLocation;
    }
    public String getSeeProductsButtonLocation() {
        return seeProductsButtonLocation;
    }
    public String getAcceptButtonLocation() {
        return acceptButtonLocation;
    }

    public HomePage(WebDriver webdriver) {
        super(webdriver);
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
