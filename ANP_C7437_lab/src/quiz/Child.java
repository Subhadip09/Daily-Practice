package quiz;

public class Child extends Parent{
protected void method(){
System.out.println("Hi i am Child");
}
public static void main(String args[]){
Child child = new Child();
child.method();
}
}
