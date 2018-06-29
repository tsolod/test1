package pages;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Погода в Барселоне")

public class WeatherBarsa extends AkitaPage{
    @FindBy(id="header2input")
    @Name("Город")
    private SelenideElement searchField;
}
