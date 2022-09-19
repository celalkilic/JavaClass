package week8thursday;

import java.util.Arrays;

//VarArgs : variable arguments
public class VariableArguments {
// we are using variable arguments when there might be different number of arguments
//parameter variable acts like an array
//in one method , we can use one VarArgs
//VarArgs have to be last parameter in the parameter list 
	static void Method(String ...name) {
		System.out.println(Arrays.toString(name));
	}
//you can add different data type before the VarArgs
	static void Method2(int a, double b, String...name) {
		
	}
	public static void main(String[] args) {
		Method();
		Method("celal");
		Method("ahmet", "talha","suzan","fatih");

	}

}
