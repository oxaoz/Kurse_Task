import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Билет 3
        String str = "java";
        String[] dividedString = separatorString(str);
        System.out.println(dividedString[0] + " " + dividedString[1]);
    }
    public static String[] separatorString(String str){
        String[] separation = new String[2];
        if (str.length() % 2 == 0) {
            separation[0] = str.substring(0,  str.length() / 2);
            separation[1] = str.substring(str.length() / 2);
        } else {
            separation[0] = str.substring(0, str.length() / 2);
            separation[1] = str.substring(str.length() / 2 + 1);
        }
        return separation;
    }

}

