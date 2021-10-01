public class Main {

    public static void main(String[] args) {
            CheckRealMember[] checkRealMembers = new CheckRealMember[]{new CheckNameSurname(), new CheckTcNo(), new CheckDateofBirth()};
            GamerManager gamerManager = new GamerManager(checkRealMembers);
            Gamer gamer = new Gamer("Çisem", "Akman", "123456", 1999, "1234568968");

            gamerManager.Add(gamer);

            OfferManager offerManager = new OfferManager();
            Offer offer = new Offer("İndirim", "1111");
            offerManager.AddOffer(offer);

            SaleManager saleManager = new SaleManager();
            Game game = new Game("Pubg", "1236", "Savaş");

            saleManager.Sale(gamer);
    }
}
