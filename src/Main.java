import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Country country1 = new Country("Kyrgyzstan",198,"kyrgyz");
        Country country2 = new Country("Russia",29,"rushian");
        Country country3 = new Country("China",38,"Chainase");
       Country[] array = Country.countries = new Country[]{country1,country2,country3};

        System.out.println(Country.setCountries(array));

    }
}