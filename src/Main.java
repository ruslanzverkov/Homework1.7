import java.util.Locale;

public class Main {
    public static void main(String[] args) {

//        Первое задание

        String firstName = "Ivanov";
        String middleName = "Ivan";
        String lastName = "Ivanovich";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("ФИО сотрудника - "+fullName);

//        Вторе задание
        String fullNameUp= fullName.toUpperCase(Locale.ROOT);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — "+fullNameUp);

//        Третье задание

        String fullNameS = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника — "+fullNameS.replace('ё','е'));


    }
}