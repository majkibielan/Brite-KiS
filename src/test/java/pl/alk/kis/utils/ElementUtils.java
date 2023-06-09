package pl.alk.kis.utils;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class ElementUtils {
    public static void selectComboboxPosition(String position) {
        $x("//lightning-base-combobox-item//span[@title='" + position + "']").should(visible).click();
    }

    public static void selectInputPosition(String position) {
        $x("//c-lookup//li//strong[text()='" + position + "']").should(visible).click();
    }
}
