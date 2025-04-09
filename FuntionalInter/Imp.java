
public class Imp {
    public static void main(String[] args) {
        ParentClass parent=new ParentClass();
        parent.print();

        ParentClass parentAnn=new ParentClass(){
            @Override
            void print(){
                System.out.println("Welcome!");
            }
        };
        parent.print();
        parentAnn.print();

        ParentInter parentInter=new ParentInter() {
            @Override
            public void printing(){
                System.out.println("Good Morning");
            }
        };
        parentInter.printing();

        ParentInter parentInter1=()->System.out.println("Good Morning!");//-> is the lambda operator 
                                                       /*no need for the method name,access specifier,return type since functional 
                                                       interface contains only one method*/
        

        parentInter1.printing();

        ParentInter1 ParentInter2=name->name.length();

        System.out.println(ParentInter2.prints("ABC"));
    }
}
