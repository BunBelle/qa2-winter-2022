import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.browser.Browser;

public class DiscoverCarsSeleniumTest {

    @Test
    public void openHomePageCheck() {
        System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
        WebDriver browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("http://www.discovercars.com/");

        .//img [@src = 'https://www.discovercars.com/assets/desktop/img/svg/discovercars-blue.svg']
        .//a [@id = 'currentCurrency']
        .//a [@data-label = 'Navigation']
        .//div [@class = 'home-caption']
        .//div [@class = 'fake-field clearfix']
        .//div [@id = 'review-arrow-left']
        .//span [@class = 'sb-residence-text']
        .//button [@class = 'button button-green button-lg submit prevent-loading trigger-gtm-sb gtm-track-fix']
        .//div [@class = 'tp-widget-review']
        .//div [@class = 'row is-table-row']

        .//div [@class = 'car-top-filter-item car-groups-item filtering-event init']
        .//span [@class = 'showing-cars']
        .//div [@class = 'car-top-filter-control next']
        .//a [@class = 'dc-ui dropdown-toggle text-blue-500']
        .//a [@data-title = 'Rental Conditions']
        .//div [@class = 'ca-table-cell top']
        .//span [@class = 'dc-ui badge badge-medium badge-blue']
        .//div [@class = 'supplier-rating']
        .//div [@class = 'price-item-price-main']
        .//div [@class = 'flt-type']
        .//span [@class = 'min-price']
        .//label [@for = 'fuel-type-ft-D']
        .//label [@for = 'number-of-seats-seats-4']



    }
