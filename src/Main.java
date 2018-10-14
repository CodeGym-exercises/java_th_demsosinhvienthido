import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 30||size<=0)
                System.out.println("Size should not exceed 30");
        } while (size > 30||size<=0);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            do {
                System.out.print("Enter a mark for student " + (i + 1) + ": ");
                array[i] = scanner.nextInt();
                if (!isAcceptableMark(array[i])){
                    System.out.println("Mark should not exceed 0 and 10");
                }
            } while (!isAcceptableMark(array[i]));
            i++;
        }
        int count = 0;
        System.out.print("List of mark: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
            if (isPassed(array[j]))
                count++;
        }
        System.out.print("\nThe number of students passing the exam is " + count);
    }

    public static boolean isPassed(int n){
        return n>=5&&n<=10?true:false;
    }
    public static boolean isAcceptableMark(int n){
        return n < 10&&n>=0?true:false;
    }
}
