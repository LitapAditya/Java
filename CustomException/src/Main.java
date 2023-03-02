public class Main {
    public static void main(String[] args) {
        try {
            throw new RandomException();
        }catch (RandomException e) {
            System.out.println("IT'S DONE");
        }
    }
}