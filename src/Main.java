//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int initialАccount = 200;
        int replenishment = 1250;
        int amount = initialАccount + replenishment;
        System.out.println("Итоговый счет: " + amount);
        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Количество бонусных рублей: " + bonus);
    }
}