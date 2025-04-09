public class Classchild {
    public static void main(String[] args) {
        Classparent n1=new Classparent();
        System.out.println(n1.getName());
        System.out.println(n1.getAge());
        n1.setAge(21);
        System.out.println(n1.getAge());
    }
}
