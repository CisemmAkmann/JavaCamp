public class Offer {
    private String offerName;
    private String offerId;

    public Offer(String offerName, String offerId) {
        this.offerName = offerName;
        this.offerId = offerId;
    }

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }
}
