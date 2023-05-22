package PesquisaGoogle;

import WebBrowser.PageObject;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;

public class PesquisarVagaTest {
    PesquisarVagaPage objpesquisarVagaPage;
    PesquisarVagaPage paginaPesquisaNtt;
    @Test
    public void deveriaPesquisarNttData() {
        WebDriver driver = PageObject.getInstance().getDriver();
        PesquisarVagaPage paginaPesquisaNtt = PageFactory.initElements(driver, PesquisarVagaPage.class);
        objpesquisarVagaPage = new PesquisarVagaPage(driver);

        paginaPesquisaNtt.PesquisaGoogle("nttdata");
        paginaPesquisaNtt.clicarNttDataPagina();
        paginaPesquisaNtt.cookieNttData();
        paginaPesquisaNtt.menuNttData();
        paginaPesquisaNtt.menuCarreiras();
        paginaPesquisaNtt.pesquisarVaga("Arquiteto");
        paginaPesquisaNtt.validarVaga();

        driver.quit();
    }

}

