package OopsConcept.MultilevelInherience;

public class Maldal extends Distict{

    int noOfVillages;
    String maldalName;
    String maldalTpye;
    int noOfSchools;

    public Maldal(String countryName, String countryCode, String countryCapital, int countryPopulation, int noOfStates, String stateName, String stateLanguage, String culture, String vistingPlace, String stateCapital, int noOfDisticts, String distictName, int distictCode, String visitingPlace, String distictCollector, String specilities, int noOfMandals, int noOfVillages, String maldalName, String maldalTpye, int noOfSchools) {
        super(countryName, countryCode, countryCapital, countryPopulation, noOfStates, stateName, stateLanguage, culture, vistingPlace, stateCapital, noOfDisticts, distictName, distictCode, visitingPlace, distictCollector, specilities, noOfMandals);
        this.noOfVillages = noOfVillages;
        this.maldalName = maldalName;
        this.maldalTpye = maldalTpye;
        this.noOfSchools = noOfSchools;
    }

    public void maldal(){
        System.out.println("The name of the maldal is "+ maldalName);
    }
    public void setMaldalTpye(){
        System.out.println("This is a medium size maldal "+maldalTpye);
    }
}
