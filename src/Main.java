public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float weight = 75;
        float height = 1.85F;
        float bmi = service.calculate(weight, height);
        System.out.println("Индекс массы тела:" + bmi);
    }
}