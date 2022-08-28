package ua.vycheslav;

import java.net.URL;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main {

        private static Document getPage() throws IOException {
            String url = "https://www.binance.com/uk-UA/markets";
            Document page = Jsoup.parse(new URL(url), 3000);
            return page;
        }
        private static Document getPage2() throws IOException {
            String url = "https://p2p.binance.com/ru/trade/Monobank/USDT?fiat=UAH";
            Document page2 = Jsoup.parse(new URL(url), 3000);
            return page2;
        }


    public static void main(String[] args) throws IOException {
        Document page = getPage();

        Element btc = page.select("div[class=css-ovtrou]").get(0);
        System.out.println(btc.text() + "\t BTC (Bitcoin)");
        Element eth = page.select("div[class=css-ovtrou]").get(1);
        System.out.println(eth.text() + "\t ETH (Ethereum)");

        Document page2 = getPage2();
        Elements mono = page2.select("main[class=main-content]");

        System.out.println(mono + "\t BTC (Bitcoin)");

        for (Element name : mono){
            String date = name.select("div[class=css-14f6ssc]").html();
//
//            date = date.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
//
//            double parse = Double.parseDouble (date);
            System.out.println(date + "\tNEWWWWWWWWWWWWW");
        }

    }
}



//public class Main {
//
//    private static Document getPage() throws IOException {
//        String url = "https://ru.investing.com/crypto/bitcoin/btc-usd";
//        Document page = Jsoup.parse(new URL(url), 3000);
//        return page;
//    }
//
//    public static void main(String[] args) throws IOException {
//        Document page = getPage();
//        String data;
//        Elements price = page.select("div[class=instrument-header_instrument-header__1SRl8 mb-5 bg-background-surface tablet:grid tablet:grid-cols-2]");
//
//
//        for (Element name : price){
//            String date = name.select("span[class=text-2xl]").text();
//
//            date = date.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
//
//            double parse = Double.parseDouble (date);
//            System.out.println(parse + "\tBTC/USD");
//        }
//
//    }
//}
