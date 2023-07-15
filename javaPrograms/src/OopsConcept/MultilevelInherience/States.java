package OopsConcept.MultilevelInherience;

public class States extends Country{
    String stateName;
    String stateLanguage;
    String culture;
    String vistingPlace;

    String stateCapital;
    int noOfDisticts;




    public States(String countryName, String countryCode, String countryCapital, int countryPopulation, int noOfStates, String stateName, String stateLanguage, String culture, String vistingPlace, String stateCapital, int noOfDisticts) {
        super(countryName, countryCode, countryCapital, countryPopulation, noOfStates);
        this.stateName = stateName;
        this.stateLanguage = stateLanguage;
        this.culture = culture;
        this.vistingPlace = vistingPlace;
        this.stateCapital = stateCapital;
        this.noOfDisticts = noOfDisticts;
    }

    public void state(){
        System.out.println("The stateName is "+ stateName);
    }
}
