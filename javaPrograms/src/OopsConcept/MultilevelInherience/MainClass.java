package OopsConcept.MultilevelInherience;

public class MainClass {
    public static void main(String[] args) {
        Country country = new Country("india"," +91"," Delhi",300,28);
        System.out.println(country.countryName+ " is my country."+ country.countryCode +" is my country code."+ country.countryCapital + " is my  country capital.  "+ country.countryPopulation+ " is THe population in millions.  "+ country.noOfStates + " no of states.");
        country.countryName();
       Distict distict=new Distict("india","+91","delhi",500,28,"Andhra pradesh","Telugu","telugu","kondareddy fort","Amaravathi",5,"kurnool",518001,"shiva temple","Nandhan","pullareddy sweets",10);
        System.out.println();
        distict.distictCode();
        distict.distict();
    }
}
