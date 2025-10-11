public class Main{
    public static void main(String[] args) {
        Array_list list1 = new Array_list();
        list1.addName("Mazda");
        list1.addName("Suzuki");
        list1.addName("Toyota");
        list1.removeName("Suzuki");
        list1.removeName("kia");
        System.out.println(list1);

        Array_list list2 = new Array_list(list1);
        list2.addName("Lexus");
        System.out.println(list2);

    }
}