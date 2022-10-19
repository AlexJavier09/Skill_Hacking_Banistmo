package co.com.banistmo.skillhacking.questions;

import co.com.banistmo.skillhacking.model.DataList;
import co.com.banistmo.skillhacking.userinterface.CheckoutWebPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import org.apache.xpath.operations.Bool;

import java.util.List;

public class ValidatePrice implements Question<Boolean> {

    private List<DataList> dataList;

    public ValidatePrice(List<DataList> dataList) {
        this.dataList = dataList;
    }

    public static ValidatePrice comparePrice(List<DataList> dataList) {
        return new ValidatePrice(dataList);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String price = Text.of(CheckoutWebPage.COST_TOTAL).viewedBy(actor).asString();
        String price1 = price.substring(1);
        if (Double.parseDouble(price1) <= Double.parseDouble(dataList.get(0).getStrPrice())) {
            result = true;
        }    else {
            result = false;
        }
        return result;
    }
}
