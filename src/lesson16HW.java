public class lesson16HW {
    public static void main(String[] args) {
//        ствоpити інтрейфейс, імплеметувати його в 2 класи.
//        В класах є приватне поле message.
//        Зробити всі необхідні маніпуляції для ініціалізації полів.
//        в  інтерфейсі визначити метод void scream(); який буде виводити інформацію
//        в консоль.
//        В першому классі зробити реалізацію методу на вивід message "аааааааа!!!!!"
//        В другому класі зробити реалізацію методу на вивід massage "ууууууууу".
//
//            В головному класі. створити метод, котрий приймає об'єкт цього інтерфейсу
//        і виконує його метод

        aaa();
    }

    public static void aaa() {
        class1 class1 = new class1();
        class2 class2 = new class2();
        System.out.print("Class1"+"  massage:  ");
        class1.scream("АААААА");
        System.out.print("Class2"+"  massage:  ");
        class2.scream("УУУУУУ");
    }
}
