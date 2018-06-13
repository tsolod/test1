package pages;


import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.alfabank.alfatest.cucumber.annotations.Name;
import ru.alfabank.alfatest.cucumber.api.AkitaPage;

@Name("Страница поиска google")
public class googlesearch extends AkitaPage {

    @FindBy(xpath= ".//*[(@title='Поиск')]")
    @Name("Поиск")
    public SelenideElement searchField;
}
