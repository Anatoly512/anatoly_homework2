
public class Main {
    public static void main(String[] args) {
        new inputData();
        personInfo();
    }

    public static void  personInfo () {

     /*   имя (String)
          город проживания (String)
          возраст (int)
          хобби (String)      */

        System.out.print("\nPlease, enter your NAME :  ");
        String name = inputData.stringInput();

        System.out.print("\nWhat city do you LIVE in :  ");
        String currentCity = inputData.stringInput();

        System.out.print("\nWhat's your AGE :  ");
        int age = inputData.numberInput();

        System.out.print("\nWhat is your hobby :  ");
        String hobby = inputData.stringInput();

        System.out.print("\n " + name + "\n " + currentCity + "\n " + age + "\n " + hobby);


    }


}

//  Домашняя работа 02
