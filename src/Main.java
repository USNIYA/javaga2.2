//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int x = 200;
        int b = 800;
        int amount = x + b;
        System.out.println("Итоговая сумма на счету при первом пополнении: " + amount);
        int bonus;
        if (b > 1000) {
            bonus = b / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Количество бонусных рублей при первом пополнении: " + bonus);
        int i = 1250;
        int total = x + i;
        System.out.println("Итоговая сумма на счету при втором пополнении: " + total);
        int bonusMoney;
        if (i > 1000) {
            bonusMoney = i / 100;
        } else {
            bonusMoney = 0;
        }
        System.out.println("Количество бонусных рублей при втором попорлнении: " + bonusMoney);

}

}
