public abstract class GameCalculator {

    public abstract void hesapla(); // override etmek zorundayız


    public final void gameOver(){ // final koyarak asla değiştirilemeyecek bir metot elde ettik
        System.out.println("Game over");
    }
}
