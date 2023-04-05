public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int BmiIndex = service.calculate(55, 1.7);
        System.out.println(BmiIndex);

    }
}