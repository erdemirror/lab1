package lab1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListMenuExample {
    private List<String> stringList;

    public ListMenuExample() {
        this.stringList = new ArrayList<>();
    }

    // Function 1
    public void addElement(String element) {
        stringList.add(element);
        System.out.println("Элемент нэмэгдлээ: " + element);
    }

    // Function 2
    public void removeElement(String element) {
        if (stringList.remove(element)) {
            System.out.println("Элемент устгагдлаа: " + element);
        } else {
            System.out.println("Элемент олдсонгүй: " + element);
        }
    }

    // Function 3
    public void containsElement(String element) {
        System.out.println(" Жагсаалт дотор '" + element + "' агуулагдана : " + stringList.contains(element));
    }

    // Function 4 
    public void getSize() {
        System.out.println("Жагсаалтын урт: " + stringList.size());
    }

    // Function 5
    public void printElements() {
        System.out.println("Жагсаалт доторх элементүүд :");
        for (String element : stringList) {
            System.out.println(element);
        }
    }

    // Function 6
    public void clearList() {
        stringList.clear();
        System.out.println("Жагсаалт цэвэрлэгдлээ.");
    }

    public static void main(String[] args) {
        ListMenuExample listExample = new ListMenuExample();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("\n-----Жагсаалт-----");
            System.out.println("1. Элемент нэмэх");
            System.out.println("2. Элемент устгах");
            System.out.println("3. Элемент байгаа эсэхийг шалгах");
            System.out.println("4. Жагсаалтын уртыг шалгах");
            System.out.println("5. Элементүүдийг хэвлэх");
            System.out.println("6. Жагсаалтыг цэвэрлэх");
            System.out.println("0. Гарах");
            System.out.print("Сонголт : ");

            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Нэмэх элементээ оруулна уу  : ");
                    listExample.addElement(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Устгах элементээ оруулна уу :");
                    listExample.removeElement(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Шалгах элементээ оруулна уу :");
                    listExample.containsElement(scanner.nextLine());
                    break;
                case 4:
                    listExample.getSize();
                    break;
                case 5:
                    listExample.printElements();
                    break;
                case 6:
                    listExample.clearList();
                    break;
                case 0:
                    System.out.println("Программаас гарч байна...");
                    break;
                default:
                    System.out.println("Буруу сонголт.");
            }
        } while (choice != 0);
//2:21
        scanner.close();
        
    }
}
