import javax.net.ssl.SSLContext;
import java.util.Scanner;

public class GraduateStudentCounter {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("enter a size: ");
            size = sc.nextInt();
            if(size > 30)
                System.out.println("size should not be exceed 30");
        } while (size >30 );
        array = new int[size];
        int i = 0;
        while (i< array.length){
            System.out.println("Enter a mark for student" + (i+1)+ ": ");
            array[i] = sc.nextInt();
            i++ ;
        }
        int count = 0 ;
        System.out.print("List a mark: ");
        for (int j = 0; j < array.length; j ++){
            System.out.print(array[j] <=10);
            count ++;

        }
        System.out.print("\n The number of student passing the exam is: " +count);
    }
}
