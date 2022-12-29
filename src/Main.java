public class Main {
    public static void main(String[] args) {
            task1();
            task2();
            task3();
            task4();
            task5();
            task6();
            task7();
    }
    public static void task1() {
        System.out.println("Задача1");
        int age = 13;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " ,то ты достиг совершеннолетия.");
        } else {
            System.out.println("Если возраст человека равен " + age + " ,то ты не достиг совершеннолетия.");
        }
    }

    public static void task2() {
        System.out.println("Задача2");
        int temperature = 1;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }
    }
    public static void task3() {
        System.out.println("Задача3");
        int sped = 100;
        if (sped >= 80) {
            System.out.println("Если скорость " + sped + " придется заплать штраф.");
        } else {
            System.out.println("Если скорость " + sped + " можно ездить спокойно.");
        }
    }
    public static void task4() {
        System.out.println("Задача4");
        int age = 20;
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в детский сад.");
        }
        else if (age >= 7 && age <= 18) {
        System.out.println("Если возраст человека равен " + age + " ,то ему нужно ходить в школу.");
        }
        else if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " ,то его место в университете.");
        }
        else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " ,то ему пора ходить на работу.");
        }
    }
    public static void task5() {
        System.out.println("Задача5");
        int age = 14;
        if (age <= 5) {
            System.out.println("Если возраст человека равен " + age + " ,он не может кататься на аттракционе.");
        }
        if (age > 5 && age <= 14) {
            System.out.println("Если возраст человека равен " + age + " ,он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");
        }
        if (age > 14) {
            System.out.println("Если возраст человека равен " + age + " ,то ему можно кататься без сопровождения взрослого.");
        }
    }
    public static void task6() {
        System.out.println("Задача6");
        int places = 65;
        if (places < 60)
        {
            System.out.println("есть сидячие места");
        }
        if (places > 60 && places < 102)
        {
            System.out.println("есть стоячие места.");
        } else if (places >= 60 && places <= 102){
            System.out.println("нет стоячих мест ");
        }
        if (places > 102)
        {
            System.out.println("в вагоне мест нет ");
        }
    }
    public static void task7() {
        System.out.println("Задача7");
        int one = 4;
        int two = 5;
        int three = 12;
        if (one >= two && one >= three) {
            System.out.println("Число " + one + " ,большее из чисел.");
        }
        else if (two >= one && two >= three) {
            System.out.println("Число " + two + " ,большее из чисел");
        }
        else {
            System.out.println("Число " + three + " ,большее из чисел");
    }
    }
}