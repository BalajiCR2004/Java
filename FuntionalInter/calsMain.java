public class calsMain {
    public static void main(String[] args) {
        Cals add=(num1,num2)->num1+num2;
        Cals sub=(num1,num2)->{
            return num1-num2;
        };                              //need return if brackets are used
        Cals mul=(num1,num2)->num1*num2;
        Cals div=(num1,num2)->num1/num2;

        System.out.println(add.Cal(2.0,3.0));
        System.out.println(sub.Cal(20.0,3.0));
        System.out.println(mul.Cal(2.0,3.0));
        System.out.println(add.Cal(60.0,3.0));
    }
}
