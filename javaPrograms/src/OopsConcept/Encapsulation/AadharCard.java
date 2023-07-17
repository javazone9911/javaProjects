package OopsConcept.Encapsulation;

public class AadharCard {
  private  long aadharCardid;
   private String aadharName;
   private String aadharAddress;

    public long getAadharCardid() {
        return aadharCardid;
    }

    public void setAadharCardid(long aadharCardid) {
        this.aadharCardid = aadharCardid;
    }

    public String getAadharName() {
        return aadharName;
    }

    public void setAadharName(String aadharName) {
        this.aadharName = aadharName;
    }

    public String getAadharAddress() {
        return aadharAddress;
    }

    public void setAadharAddress(String aadharAddress) {
        this.aadharAddress = aadharAddress;
    }

    public AadharCard(long aadharCardid, String aadharName, String aadharAddress) {
        this.aadharCardid = aadharCardid;
        this.aadharName = aadharName;
        this.aadharAddress = aadharAddress;
    }
}
