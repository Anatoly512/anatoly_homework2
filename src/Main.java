
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
        String city = inputData.stringInput();

        System.out.print("\nWhat's your AGE :  ");
        int age = inputData.numberInput();

        System.out.print("\nWhat is your hobby :  ");
        String hobby = inputData.stringInput();

        System.out.println("\nThank you!");
        System.out.println("\nPlease, input number of variant : \n\t  1 - Table, 2 - TEXT  or  3 - other form : ");

        choice(name, city, age, hobby);
    }


    public static void choice (String name, String city, int age, String hobby) {
        int number;
        number = inputData.numberInput();

           if (number == 1) {
               output1(name, city, age, hobby);
           }
           if (number == 2) {
               output2(name, city, age, hobby);
           }
           if (number == 3) {
               output3(name, city, age, hobby);
           } else {
               System.out.println("\nPlease, try again (possible variants: 1, 2 or 3) : ");
             
               choice(name, city, age, hobby);


           }

    }

    public static void output1 (String name, String city, int age, String hobby) {
        // Table
        System.out.println("\nName:   " + name);
        System.out.println("City:   " + city);
        System.out.println("Age:    " + age);
        System.out.println("Hobby:  " + hobby);
    }

    public static void output2 (String name, String city, int age, String hobby) {
        // Text form
        System.out.print("\nA person " + name + " by name is " + age + " years old and lives in " + city + " city ");
        System.out.println("and has " + hobby + " as favorite pastime.");
    }

    public static void output3 (String name, String city, int age, String hobby) {
        // other variant
        System.out.println("\n:   ");

    }



}

//  Домашняя работа 02
