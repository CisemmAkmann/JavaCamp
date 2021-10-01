public class Gamer {
    private String gamerFirstName;
    private String gamerSecondName;
    private String nationalIdentity;
    private int DateOfTime;
    private String creditCardNumber;

    public Gamer(String gamerFirstName, String gamerSecondName, String nationalIdentity, int dateOfTime, String creditCardNumber) {
        this.gamerFirstName = gamerFirstName;
        this.gamerSecondName = gamerSecondName;
        this.nationalIdentity = nationalIdentity;
        DateOfTime = dateOfTime;
        this.creditCardNumber = creditCardNumber;
    }

    public String getGamerFirstName() {
        return gamerFirstName;
    }

    public void setGamerFirstName(String gamerFirstName) {
        this.gamerFirstName = gamerFirstName;
    }

    public String getGamerSecondName() {
        return gamerSecondName;
    }

    public void setGamerSecondName(String gamerSecondName) {
        this.gamerSecondName = gamerSecondName;
    }

    public String getNationalIdentity() {
        return nationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }

    public int getDateOfTime() {
        return DateOfTime;
    }

    public void setDateOfTime(int dateOfTime) {
        DateOfTime = dateOfTime;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
}
