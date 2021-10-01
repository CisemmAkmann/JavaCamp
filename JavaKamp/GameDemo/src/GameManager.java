public class GameManager implements GameService{


    @Override
    public void Add() {
        System.out.println("Oyun basariyla sisteme yüklendi.");
    }

    @Override
    public void Delete() {
        System.out.println("Oyun basariyla sistemden silindi.");

    }

    @Override
    public void Update() {
        System.out.println("Oyun basariyla guncellendi.");
    }
}


