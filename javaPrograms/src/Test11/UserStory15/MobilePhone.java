package Test11.UserStory15;

public class MobilePhone {
    //User Story 15: As a developer, I want to create a MobilePhone class with private attributes such as brand and model, and public methods to get and set these attributes.
    //Explanation:
    //Create a MobilePhone class with private attributes such as "brand" and "model."
    //Implement encapsulation by providing public methods (getters and setters) to access and modify the private attributes.
    //Use the getters and setters to retrieve and update the mobile phone's brand and model, ensuring controlled access to the class attributes.

    private String brand;
    private String model;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
