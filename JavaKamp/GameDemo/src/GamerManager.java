public class GamerManager implements GamerService{

    private  CheckRealMember[] checkRealMembers;

    public GamerManager(CheckRealMember[] checkRealMembers) {
        this.checkRealMembers = checkRealMembers;
    }

    @Override
    public void Add(Gamer gamer) {
        System.out.println("Oyuncu oyuna eklendi : " + gamer.getGamerFirstName());
        Utils.runCheckRealMember(checkRealMembers, gamer.getGamerFirstName());
    }

    @Override
    public void Delete(Gamer gamer) {
        System.out.println("Oyuncu silindi : " + gamer.getGamerFirstName());
        Utils.runCheckRealMember(checkRealMembers, gamer.getGamerFirstName());

    }

    @Override
    public void Update(Gamer gamer) {
        System.out.println("Oyuncu güncellendi : " + gamer.getGamerFirstName());
        Utils.runCheckRealMember(checkRealMembers, gamer.getGamerFirstName());

    }


}
