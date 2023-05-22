package PesquisaGoogle;

import WebBrowser.PageObject;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.testng.Assert.assertEquals;

public class PesquisarVagaPage {
    WebDriver driver;
    @FindBy(xpath = "//*[@id='APjFqb']")
    WebElement campoPesquisa;

    @FindBy(xpath = "//a[@href='https://www.nttdata.com/global/en/']")
    WebElement linkNttdata;

    @FindBy(xpath = "//*[@id='ensCloseBanner']")
    WebElement aceitarCookieNttData;

    @FindBy(xpath = "//*[text()[contains(.,'Careers')]]")
    WebElement carreiras;

    @FindBy(xpath = "//a[@href='/global/en/careers/search-jobs?category=see-job']")
    WebElement procurarVaga;

    @FindBy(id = "search-jobs-query")
    WebElement campoPesquisarVaga;

    @FindBy(xpath = "//*[text()[contains(.,'Arquiteto de Segurança')]]")
    WebElement textoResultadoCareers;

    public PesquisarVagaPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void PesquisaGoogle(String pesquisaCampoGoogle){
        campoPesquisa.sendKeys(pesquisaCampoGoogle + Keys.ENTER);
    }

    public void clicarNttDataPagina(){
        linkNttdata.click();
    }

    public void cookieNttData(){
        aceitarCookieNttData.click();
    }

    public void menuNttData(){
        carreiras.click();
    }

    public void menuCarreiras(){
        procurarVaga.click();
    }

    public void pesquisarVaga(String oportunidadeNtt){
        campoPesquisarVaga.sendKeys(oportunidadeNtt + Keys.ENTER);
    }

    public void validarVaga(){
        String resultadoDaPesquisa = textoResultadoCareers.getText().trim();
        assertEquals("Arquiteto de Segurança", resultadoDaPesquisa);
    }

}

