public class Utils {
    public static void runCheckRealMember(CheckRealMember[] checkRealMembers, String gamer){
        for (CheckRealMember checkRealMember:checkRealMembers) {
            checkRealMember.CheckRealNumber(gamer);
        }
    }
}
