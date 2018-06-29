package pages;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Погода яндекс")
public class WeatherYandex extends AkitaPage {

    @FindBy(id="header2input")
    @Name("Город")
    public SelenideElement searchField;
}

