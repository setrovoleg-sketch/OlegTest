

public class Main {
     public static void main(String[] args) {
//         int a = 0;
//         int b = 10;
//         String hello = "";
//         String newHello;
//         boolean yesNo = false;
//
//         sayHello("Bye!");
//         sayHello2("Chao!");

         Student2 student2 = new Student2(111111, "Artur");
         printDetails(student2);
         Student2 student007 = new Student2(222222, "Mike");
         printDetails(student007);

         System.out.println(Math.pow(3, 3));

        Student student = new Student();
        System.out.println(student.getAge());
     }

    static void printDetails(Student2 student2) {
        System.out.println(student2.getName());
        System.out.println(student2.getPhone());
    }

//    public static void sayHello(String phrase){
//        System.out.println(phrase);
//     }
//    public static void sayHello2(String phrase){
//        System.out.println(phrase);
//    }
}