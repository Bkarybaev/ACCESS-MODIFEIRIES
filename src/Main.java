import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Country country1 = new Country("Baiel",28,"kyrgyz");
        Country country2 = new Country("Baiel",29,"kyrgyz");
        Country country3 = new Country("Baiel",38,"kyrgyz");
       Country[] array = Country.countries = new Country[]{country1,country2,country3};

        System.out.println(Country.setCountries(array));

    }
}