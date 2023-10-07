package one;

import java.util.Scanner;

class Address {
    int StreetNo;
    String city;
    String state;
    String country;

    Address(int StreetNo, String city, String state, String country) {
        this.StreetNo = StreetNo;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    void printAddress() {
        System.out.println("Street No is " + StreetNo);
    }
}

class Student {
    String USN, Name;
    Address addr;

    Student(String USN, String Name, Address a) {
        this.addr = a;
        this.USN = USN;
        this.Name = Name;
    }
}

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of students");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character
        
        Student st[] = new Student[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the name of the student");
            String na = sc.nextLine();
            System.out.println("Enter the USN of the student");
            String u = sc.nextLine();
            System.out.println("Address");
            System.out.println("Enter street number");
            int sn = sc.nextInt();
            sc.nextLine(); // Consume the newline character
            System.out.println("Enter city");
            String c = sc.nextLine();
            System.out.println("Enter state");
            String s = sc.nextLine();
            System.out.println("Enter country");
            String co = sc.nextLine();
            Address a = new Address(sn, c, s, co);
            st[i] = new Student(u, na, a);
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + i + " details");
            System.out.println("Name: " + st[i].Name);
            System.out.println("USN: " + st[i].USN);
            st[i].addr.printAddress();
            System.out.println();
        }
    }
}
