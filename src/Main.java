public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(add(3,5));
        System.out.println(subtract(10,5));
        System.out.println(multiplication(5,6));
        System.out.println(division(10,2));
    }
    static int add(int a, int b){
        return a+b;
    }
    static int subtract(int a , int b){
        return a -b;
    }
    static int multiplication(int a , int b){
        return a*b;
    }
    static int division(int a , int b ){
        return a/b;
    }
}