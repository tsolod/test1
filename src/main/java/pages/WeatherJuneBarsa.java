package pages;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

import java.util.List;

@Name("Погода на июнь в Барселоне")

public class WeatherJuneBarsa extends AkitaPage{
    @FindBy(xpath = ".//*[(@class='graph-longterm__label-title')]")
    @Name("Список дней")
    public List<SelenideElement> tempJune;
}