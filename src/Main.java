import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyList list = new MyList(4);
        list.add(0,1);
        list.add(1,2);
        list.add(2,3);
        list.add(3,"demo");

        list.add(4,4 );
        list.add(5,5);
        list.add(6,6);
        list.add(7,7);
        list.add(8,8);
        list.add(9,9);
        list.add(10,10);
        list.add(11,11);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Phan tu thu " + i+" :" + list.get(i));
        }
        System.out.println("--------------------------------");

        System.out.println("Tra ve size: " + list.size());
        System.out.println("--------------------------------");

        System.out.print("Xoa phan tu thu:");
        int index = scanner.nextInt();
        list.remove(index);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Phan tu thu " + i+" :" + list.get(i));
        }
        System.out.println("--------------------------------");
    }
}