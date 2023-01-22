public class BmiService  {
    public float calculate(float weight, float height) {
        float result = weight / height * height;
        if (result >= 18.5) {
            System.out.println("Индекс массы тела:" +" " + result + " " + "Недостаточная (дефицит) масса тела");
        } else if (result >= 24.9) {
            System.out.println("Индекс массы тела:" +" " + result + " " + "Норма массы тела");
        }
        else if (result >= 29.9) {
            System.out.println("Индекс массы тела:" +" " + result + " " + "Избыточная масса тела");
        }
        return result;
    }
}

