class studentDetails{
    String name;
    int age;
    char gender;
    studentDetails(String name,int age,char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
     
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Name: "+this.name+"\nAge: "+this.age+"\nGender: "+this.gender;
    }
    
}
public class class1 {
    public static void main(String[] args) {
        studentDetails Student1=new studentDetails("Balaji",12,'M');
        System.out.println(Student1);
    }
    
}
