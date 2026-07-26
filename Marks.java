import java.util.Scanner;
 
public class Marks{
    public static void main(String[] args) {
 
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();
 
        int[][] marks = new int[n + 1][4];
 
        while (true) {
            System.out.println("Main Menu");
            System.out.println("1. add [studentID]");
            System.out.println("2. update [studentID] [subjectID]");
            System.out.println("3. average_s [subjectID]");
            System.out.println("4. average [studentID]");
            System.out.println("5. total [studentID]");
            System.out.println("6. exit");
 
            System.out.print("Enter command: ");
            String command = scanner.next();
 
            switch(command){
                // Add student marks
                case "add":
                    int id = scanner.nextInt();
 
                    if(id < 1 || id > n){
                        System.out.println("Invalid student ID");
                        break;
                    }
 
                    System.out.print("Maths mark: ");
                    marks[id][1] = scanner.nextInt();
 
                    System.out.print("Chemistry mark: ");
                    marks[id][2] = scanner.nextInt();
 
                    System.out.print("Physics mark: ");
                    marks[id][3] = scanner.nextInt();
 
                    System.out.println("Marks added successfully");
                    break;
 
                // Update mark
                case "update":
                    id = scanner.nextInt();
                    int subject = scanner.nextInt();
 
                    if(id < 1 || id > n || subject < 1 || subject > 3){
                        System.out.println("Invalid student ID or subject ID");
                        break;
                    }
 
                    System.out.print("Enter new mark: ");
                    marks[id][subject] = scanner.nextInt();
 
                    System.out.println("Mark updated");
                    break;
 
                // Average of subject
                case "average_s":
                    subject = scanner.nextInt();
 
                    if(subject < 1 || subject > 3){
                        System.out.println("Invalid subject ID");
                        break;
                    }
 
                    int total = 0;
 
                    for(int i = 1; i <= n; i++){
                        total += marks[i][subject];
                    }
 
                    double subjectAverage = total / (double)n;
 
                    System.out.println("Subject Average: " + subjectAverage);
                    break;
 
                // Average of student subjects
                case "average":
                    id = scanner.nextInt();
 
                    if(id < 1 || id > n){
                        System.out.println("Invalid student ID");
                        break;
                    }
 
                    int sum = 0;
 
                    for(int i = 1; i <= 3; i++){
                        sum += marks[id][i];
                    }
 
                    double avg = sum / 3.0;
 
                    System.out.println("Average mark: " + avg);
                    break;
 
                // Total marks of student
                case "total":
                    id = scanner.nextInt();
 
                    if(id < 1 || id > n){
                        System.out.println("Invalid student ID");
                        break;
                    }
 
                    total = 0;
 
                    for(int i = 1; i <= 3; i++){
                        total += marks[id][i];
                    }
 
                    System.out.println("Total Mark: " + total);
                    break;
 
                case "exit":
                    System.out.println("Program Ended");
                    System.exit(0);
                    break;
 
                default:
                    System.out.println("Invalid command");
 
            }
 
        }
 
    }
}