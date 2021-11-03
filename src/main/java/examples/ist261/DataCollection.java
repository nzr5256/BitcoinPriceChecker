package examples.ist261;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.json.bind.Jsonb;
import javax.json.bind.JsonbBuilder;

public class DataCollection {
    public static void main(String[] args) {
        List<ConfirmBuy> btcValue = new ArrayList<>();

        ConfirmBuy jan = new ConfirmBuy(33528.89);
        ConfirmBuy feb = new ConfirmBuy(49660.98);
        ConfirmBuy mar = new ConfirmBuy(58724.15);
        ConfirmBuy apr = new ConfirmBuy(57880.28);
        ConfirmBuy may = new ConfirmBuy(36688.70);
        ConfirmBuy june = new ConfirmBuy(33487.03);
        ConfirmBuy july = new ConfirmBuy(39902.85);
        ConfirmBuy aug = new ConfirmBuy(48888.12);
        ConfirmBuy sept = new ConfirmBuy(481667.02);
        ConfirmBuy oct = new ConfirmBuy(13777.03);
        ConfirmBuy nov = new ConfirmBuy(18779.99);
        ConfirmBuy dec = new ConfirmBuy(29433.90);

        btcValue.add(jan);
        btcValue.add(feb);
        btcValue.add(mar);
        btcValue.add(apr);
        btcValue.add(may);
        btcValue.add(june);
        btcValue.add(july);
        btcValue.add(aug);
        btcValue.add(sept);
        btcValue.add(oct);
        btcValue.add(nov);
        btcValue.add(dec);


        Jsonb jsonb = JsonbBuilder.create();
        String jsonVal = jsonb.toJson(btcValue);
        System.out.println(jsonVal);


        Random rand = new Random();
        int randIdx = rand.nextInt(btcValue.size());
        ConfirmBuy cb = btcValue.get(randIdx);
        System.out.println(cb.getBtcvalue());
        
        }
    }


