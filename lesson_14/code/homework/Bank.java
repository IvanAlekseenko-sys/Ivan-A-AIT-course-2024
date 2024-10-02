package homework;

//В сберкассу на трёхпроцентный вклад положили s рублей.
//Какой станет сумма вклада через n лет. Использовать цикл for.
public class Bank {
    public static void main(String[] args) {
        double s = 100000; // изначальная сумма вклада
        double sInterestRate = 0.03; // процентная ставка годовых
        double n = 3; // срок вклада (лет)
        for (int i = 0; i < n; i++) {
            s = s + (s * sInterestRate); // Обновляем сумму вклада, добавляя проценты

        }
        System.out.println("Сумма вклада составит: " + s);
    }//end of main
}//end of class
