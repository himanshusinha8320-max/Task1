import java.util.Scanner;

class Student
{
String name;
int[] marks = new int[3];
double average;
char grade;

void calculate() {
int sum = 0;
for (int i = 0; i < 3; i++) 
{
sum += marks[i];
}
        average = sum / 3.0;

        if (average >= 80)
            grade = 'A';
        else if (average >= 60)
            grade = 'B';
        else if (average >= 40)
            grade = 'C';
        else
            grade = 'F';
}

void display() 
{
        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + name);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
    }
}

public class StudentGradeSystem 
{
public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
Student s = new Student();

System.out.print("Enter student name: ");
s.name = sc.nextLine();
for (int i = 0; i < 3; i++) 
{
System.out.print("Enter marks of subject " + (i + 1) + ": ");
s.marks[i] = sc.nextInt();
}
s.calculate();
s.display();
sc.close();
    }
}