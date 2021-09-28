public class CustomerManager {

    BaseDatabaseManager databaseManager;// strateji

    public CustomerManager(BaseDatabaseManager databaseManager) {
        this.databaseManager = databaseManager;
    }

    public void getCustomers(){
        databaseManager.getData();
    }
}
