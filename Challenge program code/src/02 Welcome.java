import java.util.Scanner;

class Welcome {
    public static void main(String[] args) {
        System.out.print("Please Enter Your Name: ");
        Scanner input=new Scanner(System.in);
        String name=input.nextLine();
        System.out.println("Welcome "+name+" to  KG Coding");

    }
}
