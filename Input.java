import java.util.Scanner; // Требуется для функции ввода данных(импортируем класс сканер)
public class Input {
   public static void main(String[] args) {

    Scanner one= new Scanner(System.in); // (System.in) - вводной поток данных | Scanner Объект класса
            System.out.println("Введите первое число: "); // вывод данных
        int add = one.nextInt(); // перенос строки
    Scanner two = new Scanner(System.in); // ввод данных
            System.out.println("Введите второе число: ");
        int add_1 = two.nextInt();
    Scanner three = new Scanner(System.in);
        int num = add + add_1; // сложение первого и второго числа
       System.out.println("Итого: " + num); // результат




    }

}
