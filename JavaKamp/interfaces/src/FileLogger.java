public class FileLogger implements Logger{
    @Override
    public void log(String message) {
        System.out.println("Dosyaya loglanndı : " + message);
    }
}
