package week8tuesday;
class A
{
    int i = 10;
}
 
class B extends A
{
    int i = 20;
}
 

public class Googleclassroom1 {

	public static void main(String[] args) {
        A a = new B();
        
        System.out.println(a.i);

	}

}