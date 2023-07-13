package Methods.methods_with_parameters_and_return_values;

public class DailyWishesMain {
    public static void main(String[] args) {
        DailyWishes dailyWishes=new DailyWishes();
      String morningWish=  dailyWishes.morningWishes("Good morning");
        System.out.println(morningWish);
    }
}
