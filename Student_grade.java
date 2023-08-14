import java.util.*;

public class Student_grade {
    public static void main(String[] args) {
        System.out.println("\n\t\t\t\t\t\t\tSTUDENT GRADE CALCULATOR");
        Scanner sc = new Scanner(System.in);

        System.out.println("\n*(Fill the marks out of 100)");
        System.out.print("How many subjects you have: ");
        int n = sc.nextInt();
        System.out.println();

        float total_marks = 0;

        HashMap<String , Float> map = new HashMap<>();
        for(int i = 1 ; i <= n ; i++) {
            System.out.print("Enter the subject name: ");
            String ch = sc.next();
            System.out.format("Enter the marks of %s = ",ch);
            float sub1= sc.nextFloat();
            map.put(ch , sub1);
            total_marks += map.get(ch);
        }


        float avg_per = total_marks / n;
        char grade = '0';
        if (avg_per >= 90.0 && avg_per <= 100.0) grade = 'A';
        else if (avg_per >= 80.0 && avg_per <= 89.0) grade = 'B';
        else if (avg_per >= 70.0 && avg_per <= 79.0) grade = 'C';
        else if (avg_per >= 60.0 && avg_per <= 69.0) grade = 'D';
        else if (avg_per >= 0.0 && avg_per <= 59.0) grade = 'E';

        System.out.printf("%n--------------------------------%n");
        System.out.printf("\t\t\t %-8s %n", "RESULT");
        System.out.printf("--------------------------------%n");
        System.out.printf("| %-10s | %-8s |%n", "Subjects","Marks");
        System.out.printf("--------------------------------%n");

        for(Map.Entry<String,Float> m :map.entrySet()){
            System.out.format("| %-10s | %-8s |%n", m.getKey(), m.getValue());
        }
        System.out.println("\nTotal marks obtained: " + total_marks);
        System.out.println("Average percentage obtained: " + avg_per+"%");
        System.out.println("Grade: " + grade);
    }
}
