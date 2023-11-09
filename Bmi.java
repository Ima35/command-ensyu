import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("１人目の体重を入力してください");
        double weight = sc.nextDouble();
        System.out.println("１人目の身長を入力してください");
        double height = sc.nextDouble();

        System.out.println("２人目の体重を入力してください");
        double weight2 = sc.nextDouble();
        System.out.println("２人目の身長を入力してください");
        double height2 = sc.nextDouble();

        double bmi = weight / ((height / 100) * (height / 100));
        String sv = String.format("%.2f", bmi);
        double bmi2 = weight2 / ((height2 / 100) * (height2 / 100));
        String sv2 = String.format("%.2f", bmi2);

        System.out.println("１人目のBMIは" + sv + "です");
        if (bmi >= 26.5) {
            System.out.println("肥満です、運動しましょう");
        } else if (bmi >= 24) {
            System.out.println("太り気味です、野菜を食べましょう。");
        } else if (bmi >= 20) {
            System.out.print("普通です、維持できるように頑張りましょう！");
        } else {
            System.out.println("ガリガリ君です！食べてください！！");
        }
        System.out.println("２人目のBMIは" + sv2 + "です");
        if (bmi2 >= 26.5) {
            System.out.println("肥満です、運動しましょう");
        } else if (bmi2 >= 24) {
            System.out.println("太り気味です、野菜を食べましょう。");
        } else if (bmi2 >= 20) {
            System.out.print("普通です、維持できるように頑張りましょう！");
        } else {
            System.out.println("ガリガリ君です！食べてください！！");
        }
    }
}
