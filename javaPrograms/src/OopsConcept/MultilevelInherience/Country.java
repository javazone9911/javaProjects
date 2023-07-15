package OopsConcept.MultilevelInherience;

public class Country {
    String countryName;
    String countryCode;
    String countryCapital;
    int countryPopulation;
    int noOfStates;


    public Country(String countryName, String countryCode,String countryCapital,int countryPopulation,int noOfStates) {
        this.countryName = countryName;
        this.countryCode = countryCode;
        this.countryPopulation=countryPopulation;
        this.countryCapital=countryCapital;
        this.noOfStates=noOfStates;
    }

    public void countryName(){
        System.out.println("The country name is " + countryName);
    }
}
