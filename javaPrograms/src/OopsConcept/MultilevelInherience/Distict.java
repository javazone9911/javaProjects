package OopsConcept.MultilevelInherience;

public class Distict extends States{
    String distictName;
    int distictCode;
    String visitingPlace;
    String distictCollector;
    String specilities;
    int noOfMandals;

    public Distict(String countryName, String countryCode, String countryCapital, int countryPopulation, int noOfStates, String stateName, String stateLanguage, String culture, String vistingPlace, String stateCapital, int noOfDisticts, String distictName, int distictCode, String visitingPlace, String distictCollector, String specilities, int noOfMandals) {
        super(countryName, countryCode, countryCapital, countryPopulation, noOfStates, stateName, stateLanguage, culture, vistingPlace, stateCapital, noOfDisticts);
        this.distictName = distictName;
        this.distictCode = distictCode;
        this.visitingPlace = visitingPlace;
        this.distictCollector = distictCollector;
        this.specilities = specilities;
        this.noOfMandals = noOfMandals;
    }

    public void distict(){
        System.out.println("The distict name is "+ distictName);
    }
    public void distictCode(){
        System.out.println("The distict code is "+ distictCode);
    }
}
