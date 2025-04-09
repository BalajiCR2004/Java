import java.util.LinkedList;

public class usersInfo {
    public static void main(String[] args) {
        Users u1=new Users("Dhanish", 20, "dhanishchander69@gmail.com", "69696969696", "Dhanish@69");
        Users u2=new Users("Abinesh", 21, "abineshcts@gmail.com", "8985483459923", "Abinesh@cts");
        Users u3=new Users("Kamesh", 23, "kamesh@gmail.com", "867547868454566", "Kamesh@4446");
        Users u4=new Users("Vishal", 24, "vishal@gmail.com", "645754635546676", "Vishal@235");
        LinkedList<Users> userDetails=new LinkedList<>();
        userDetails.add(u1);
        userDetails.add(u2);
        userDetails.add(u3);
        userDetails.add(u4);
        userDetails.forEach(user -> System.out.println(user+"\n"+("-------".repeat(5))));
        
    }
}
