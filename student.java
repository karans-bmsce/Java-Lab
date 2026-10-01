import java.util.Scanner;

class Student {
    String usn, name;

    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name:");
        name = sc.nextLine();

        System.out.println("Enter USN:");
        usn = sc.nextLine();
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
    }
}

class StudentRun {
    public static void main(String a[]) {
        Student S[] = new Student[3];

        System.out.println("By Karan S, USN: 1BF25CS121");

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details\n");

            S[i] = new Student();
            S[i].accept();
            S[i].display();
        }
    }
}
