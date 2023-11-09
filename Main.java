import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("体重を入力してください");
        double weight = sc.nextDouble();
        System.out.println("身長を入力してください");
        double height = sc.nextDouble();

        double bmi = weight / ((height / 100) * (height / 100));
        String sv = String.format("%.2f", bmi);
        System.out.println("あなたのBMIは" + sv + "です");
        if (bmi >= 26.5){
            System.out.println("肥満です、運動しましょう");
        } else if (bmi >= 24) {
            System.out.println("太り気味です、野菜を食べましょう。");
        } else if (bmi >= 20) {
            System.out.print("普通です、維持できるように頑張りましょう！");
        }else {
            System.out.println("スリムです！食べてください！！");
        }
    }
}
