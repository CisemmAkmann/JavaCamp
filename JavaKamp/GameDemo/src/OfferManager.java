public class OfferManager implements OfferService{
    @Override
    public void AddOffer(Offer offer) {
        System.out.println("Kampanya sisteme eklendi." + offer.getOfferName());
    }

    @Override
    public void DeleteOffer(Offer offer) {
        System.out.println("Kampanya sistemden silindi." + offer.getOfferName());
    }

    @Override
    public void UpdateOffer(Offer offer) {
        System.out.println("Kampanya güncellendi." + offer.getOfferName());

    }
}
