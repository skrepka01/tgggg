import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
      /*System.out.println("Hello world!");
        int[] number = new int[]{ 3,2,5,4,1};
        int i;
        int why;
        Scanner let = new Scanner(System.in);
        System.out.println("Введите число от 1 до 5 для проверки этого массива");
        why = let.nextInt();
        for(i = 0; i < number.length; i++){
                    if( why == number[i]){
                System.out.println("Число верное");
                break;
            }else{
                System.out.println("Число не верное");
            }
        }
        Scanner ride = new Scanner(System.in);
        System.out.print("Для того чтоб найти периметр треугольника, выберите число 1,2,3");
        int sumbol = ride.nextInt();
            switch(sumbol){
                case 1:
                    System.out.print("Для нахождния периметра треугольника укажите данные a + b + c ");
                    int a = ride.nextInt();
                    int b = ride.nextInt();
                    int c = ride.nextInt();
                    System.out.println("Результат  " + a + b + c);
                    break;
                case 2:
                    System.out.println("Для нахождения площади введите a и h"); // S = 1/2 * a * h
                    int a1 = ride.nextInt();
                    int h = ride.nextInt();
                    System.out.println("Результат  " + 0.5 * a1 * h);
                    break;
                case 3:
                    System.out.print("Для нахождения введите Массу и РО"); // V = m/po
                    float m = ride.nextFloat();
                    float p = ride.nextFloat();
                    System.out.println("Результат  " + m/p);
                    break;
                default:
                    System.out.println("Некорректно введено число");

            }*/

        File file = new File("test.txt");

        // Создание файла
        file.createNewFile();

        // Создание объекта FileWriter
        FileWriter writer = new FileWriter(file);

        // Запись содержимого в файл
        writer.write("2EcgGMNQqszgVyAN1RtNdq4dlz5v7FRrPLF1N7es1gx7RHKtV3rjQCtCccG4k4uSprlg9UCtNSAlICSEZ0lIWleX7QFBllQBjuAQzHz0neBKpYCowBzr63b6K0jPpvfrUeF9PuJLbIBCrPwio8FB82JaF1VPIE5uuUIgsWAElKunpNtcSihIyVgRbwcRR6YejSuMIcLDLmzIXGgBtVMTs9NDhEUEkH5R02S9PUVYlyJA2eAQm1XgM7tD0OLvA9k4Qq5Df870YhpYslO2xwltURbOBnUjY8fCuldlWMLVL76H5MGMBP5AuOO8GAOzIxSrU4cpxV6va4FJ2654Kct5aJoI5jghx1N6KGr0DeAoPdgxsJlNrkNo1a9R0ZxZxyr3jBnKS7he3NJ6893BQCKCpAjG6H4hNHq1LYbOz7qZ22LT09Xzcs1dtsvNX0u0fSsplVHmZjvuTxUfSO6riZlXOt6QsjggA67arH9Dhf3SjFF6JE8HRmuA70nn2lzUzcGodJWWkpVcx5GZVB4JG5px2iU49VJDQH3FihOi0moVLpf5MkSDuaPrIMcCeQ3kFUXaox33V9zw2WmMNv6P9DF42w87mkTZqBFo7tJm5erJXvbq6iZW6GShboOjlh2ZNXYp6XuNC8t1ttHwgK3EhGvcbtZVvZMbXfe49R4HEMADpzypMQRXGpGw5wiGafl3SZASXCjTHjdBm2qYL4m4dB0YlAns0qcL1gCjdlpfaFs13nQdxKagjm1LuXmilamsuGodIWJHQsHJ6ZzVL6h23ttLIu8s23XqqMit3Sb6GboDwmdifZKNsgzJnP3KDzQpXlMElZo3yGNvqwvKzy2DLdKvrRT2Rokue7AsythSgkbJBqIkvdXrW6iTZFn8PBOMagyTemRsOVzBRyl8qUj3f8a9RpLn9zLQY6J9zwGrdDfGHjNtnPt0vqdmND162lYl8e9hNKh9YuXW97v8FPzoOE7MSRBU68CvhlKsXZZ1EiZH");
        writer.close();

        FileReader fr = new FileReader(file);
        char [] a = new char[1000];   // Количество символов, которое будем считывать
        fr.read(a);   // Чтение содержимого в массив
        StringBuffer buffer = new StringBuffer("Numbers: ");
        StringBuffer buffer2 = new StringBuffer("Letters: ");
        System.out.println("" + Arrays.toString(a));
        int i;
        String result = "", result2 = "";
        for (i = 0; i < a.length ; i++){
            if(Character.isDigit(a[i])){
                System.out.println(a[i]);
                result += a[i];
            }else{
                System.out.println(a[i]);
                result2 += a[i];
            }
        }
        System.out.println("" + buffer.append(result));
        System.out.println("" + buffer2.append(result2));
        File Numbers = new File("Numbers.txt");
        Numbers.createNewFile();

        FileWriter writer1 = new FileWriter(Numbers);

        writer1.write(result + "\n" + "Количество символов: " + result.length());
        writer1.close();

        File Letters = new File("Letters.txt");
        Letters.createNewFile();

        FileWriter writer2 = new FileWriter(Letters);

        writer2.write(result2 + "\n" + "Количество символов: " +result2.length());
        writer2.close();


        /*final String mixed = "l14kjs6dvba7iuyf8bqo8w47br2938rb2o38bw9f872b9g62b";
        for (int i = 0; i < mixed.length(); i++) {
            System.out.print(mixed.charAt(i) + " ");
            Boolean lNG = Character.isDigit(mixed.charAt(i));
            if (lNG){
                System.out.println("" + mixed.charAt(i) + "" + " тут цуфра ");
            }else{
                System.out.println("" + mixed.charAt(i) + "" + " а Тут буква" );
            }
        }*/
    }

}
