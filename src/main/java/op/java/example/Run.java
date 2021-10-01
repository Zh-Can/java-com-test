package op.java.example;

import com.sun.jna.platform.win32.COM.util.Factory;

/**
 * 注册后 执行
 * @author Can
 *
 */
public class Run{
	

	public static void main(String[] args) {
		//demo1
		IOpInterface op1 = new Factory().createObject(OpInterface.class);
		System.out.println("demo1: " + op1.Ver());
		
		
		//demo2
//		Ole32.INSTANCE.CoInitializeEx(Pointer.NULL, Ole32.COINIT_MULTITHREADED);
//		OpInterface2 op2 = new OpInterface2();
//		System.out.println("demo2: " + op2.Ver());
	}

}
