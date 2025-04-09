import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class employeeDetails{
    private String empName;
    private String empID;
    private int empAge;

    employeeDetails(String empName,String empID,int empAge){
        this.empName=empName;
        this.empID=empID;
        this.empAge=empAge;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpID() {
        return empID;
    }

    public void setEmpID(String empID) {
        this.empID = empID;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    
}
public class ex3 {
    public static void main(String[] args) {
        employeeDetails emp1=new employeeDetails("Aswin", "2874tvfd", 21);
        employeeDetails emp2=new employeeDetails("Abinesh", "234hj3jj", 22);
        employeeDetails emp3=new employeeDetails("Dhanish", "3b534ghcdv", 23);
        employeeDetails emp4=new employeeDetails("Jai", "2dsfad2", 24);
        employeeDetails emp5=new employeeDetails("Balaji", "Batman9275738", 21);

        ArrayList<employeeDetails> empList=new ArrayList<>(Arrays.asList(emp1,emp2,emp3,emp4,emp5));

        ArrayList<String> empNameList=(ArrayList<String>)empList.stream().map(s->s.getEmpName()).collect(Collectors.toList());

        System.out.println(empNameList);
    }
}
