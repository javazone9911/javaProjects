package OopsConcept.MultilevelInherience;

public class MainClass {
    public static void main(String[] args) {
        Country country = new Country("india"," +91"," Delhi",300,28);
        System.out.println(country.countryName+ " is my country."+ country.countryCode +" is my country code."+ country.countryCapital + " is my  country capital.  "+ country.countryPopulation+ " is THe population in millions.  "+ country.noOfStates + " no of states.");
        country.countryName();
       // State state =new States();
    }
}
