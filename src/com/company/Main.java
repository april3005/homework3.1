import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
            String[] names = new String[3];
            names[0] = "Mike";
            names[1] = "Jack";
            names[2] = "Billy";
            names = Arrays.copyOf(names, names.length + 1);
            names[3]= "Sam";

        for (int i = 0; i < names.length; i++) {
            switch (i) {
                case 0:
                    System.out.println("Good morning " + names[0]);
                    break;
                case 1:
                    System.out.println("Good afternoon " + names[1]);
                    break;
                case 2:
                    System.out.println("Good evening " + names[2]);
                    break;
                case 3:
                    System.out.println("Good night " + names[3]);
                    break;
        }
        

            }

        }
    }
