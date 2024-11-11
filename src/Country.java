public class Country {
    private String name;
    private int aianty;
    private String languahje;
    static Country[] countries;

    public Country() {

    }

    public Country(String name, int aianty, String languahje) {
        this.name = name;
        this.aianty = aianty;
        this.languahje = languahje;
    }


    public int getAianty() {
        return aianty;
    }

    public static Country setCountries(Country[] countries) {
        Country array =  countries[0];
        for (Country country : countries) {
            if (country.getAianty() > array.getAianty()){
                array = country;
            }
        }
        return array;


    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", aianty=" + aianty +
                ", languahje='" + languahje + '\'' +
                '}';
    }
}
