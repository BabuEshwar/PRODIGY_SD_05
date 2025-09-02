import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Product {
    String name, price, rating;

    Product(String name, String price, String rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }
}

public class WebScraper {
    public static void main(String[] args) {
        String url = "http://books.toscrape.com/catalogue/page-1.html";
        List<Product> products = new ArrayList<>();

        try {
            Document doc = Jsoup.connect(url).timeout(10000).get();
            Elements items = doc.select(".product_pod");

            for (Element item : items) {
                String name = item.select("h3 a").attr("title");
                String price = item.select(".price_color").text();
                Element ratingEl = item.select("p.star-rating").first();
                String rating = "";
                if (ratingEl != null && ratingEl.classNames().size() > 1) {
                    for (String cls : ratingEl.classNames()) {
                        if (!cls.equals("star-rating")) rating = cls;
                    }
                }

                products.add(new Product(name, price, rating));
            }

            saveToCSV(products, "products.csv");
            System.out.println("✅ Data saved successfully to products.csv");
            for (Product p : products)
                System.out.printf("%s | %s | %s\n", p.name, p.price, p.rating);

        } catch (IOException e) {
            System.out.println("⛔ Error: " + e.getMessage());
        }
    }

    private static void saveToCSV(List<Product> products, String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Name,Price,Rating\n");
            for (Product p : products) {
                writer.write(String.format("\"%s\",\"%s\",\"%s\"\n", p.name, p.price, p.rating));
            }
        } catch (IOException e) {
            System.out.println("⛔ Error writing CSV: " + e.getMessage());
        }
    }
}
