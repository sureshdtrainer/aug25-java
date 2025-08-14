import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        //Person person1 = new Person();

        /*
        System.out.println("Hello World!");
        //Variables, datatypes, initialization and declaration
        int myNumber = 12332323; //32 bit
        short myShort = 345; //16 bit
        long myLong = 34333334; //64 bit
        double myDouble = 232.343334;
        float myFloat = 324.3f;
        byte  myByte = 127; //8bit
        char myChar = 'y';
        boolean myBoolean= true;

        System.out.println(myNumber);
        System.out.println(myShort);
        System.out.println(myLong);
        System.out.println(myDouble);
        System.out.println(myFloat);
        System.out.println(myByte);
        System.out.println(myChar);
        System.out.println(myBoolean);

        String  text = "Hello";
        String blank = " ";
        String name = "Suresh";

        String greeting = text + blank + name;
        System.out.println(greeting + myNumber);
        */

        //Loops

        //While
     /*   int value = 0;
        while(value < 10) {
            System.out.println("Hello " + value);
            value = value + 1;
        }*/

        //for Loop
      /*  for(int i=0;i<10;i++){
            System.out.println("Hello" + i);
        }*/

        //Using if and if else

 /*       Scanner input= new Scanner(System.in);
        System.out.println("Enter a Integer value : ");
        int myInt = input.nextInt();

        if (myInt < 10){
            System.out.println("Value is less than 10 " + myInt);
        }else if (myInt > 20){
            System.out.println("Value is Greater than 20 "+ myInt);
        }else   {
            System.out.println("Value is between 10 and 20 " +myInt);
        }*/

        //do While
        /*int value = 0;
        do {
            System.out.println("Enter integer value 5 to exit :");
            value = input.nextInt();
        }while (value !=5);*/

        //Switch

       /* String text = "status";
        switch (text){
            case "start":
                System.out.println("Machine started!!!");
                break;

            case "stop":
                System.out.println("Machine stopped!!!");
                break;

            default:
                System.out.println("Not a recoginized Command");
        }

*/

        //Arrays - group of like typed variables
        int value = 7;
        int[] values; //declaration
        values = new int[3]; // assign the memory size

        values[0] = 10; //assign
        values[1] = 20;
        values[2] = 30;

        for (int i=0; i< values.length; i++){
            System.out.println(values[i]);
        }
        // 1D
        int[] numbers = {5, 6, 7 , 8 , 9}; //declare and initialize the array
        for (int i=0; i< numbers.length; i++){
            System.out.println(numbers[i]);
        }
        //Array of Strings
        String[]  words = new String[3];
        words[0] = "Hello";
        words[1] = "to";
        //words[2] = "Siemens"; // if not assigned the value will have null as value

        for(String word: words){
            System.out.println(word);
        }

        String[] fruits = {"apple", "banana", "pear", "kiwi"};
        for(String fruit: fruits){
            System.out.println(fruit);
        }

        //2D
        int[] [] grid = {
                {2, 4, 5},
                {4, 7, 8},
                {12, 23, 14, 15}
        };
        //Need 2 indices or index to access the values
        System.out.println("value 1 1 : "+ grid[1] [1]);
        System.out.println("value 0 2 : "+ grid[0] [2]);
        System.out.println("value 2 3 : "+ grid[2] [3]);

        for(int row = 0; row < grid.length; row++){
            for(int col= 0; col<grid[row].length; col++){
                System.out.print(grid[row][col]+"\t");
            }
            System.out.println();
        }
    }
}
