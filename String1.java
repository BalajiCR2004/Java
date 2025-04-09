

public class String1 {
    public static void main(String[] args) {
        String name="Ravi";
        String dogName="Ravi";

        String childName=new String ("Ravi");
        System.out.println(name==dogName);
        System.out.println(name==childName);
        StringBuffer st=new StringBuffer("yvbecrfcguiv");
        System.out.println(st.capacity());
        System.out.println(st.length());
        System.out.println(st.append(st));
        System.out.println(st.indexOf("c"));
    
        
    }
}
