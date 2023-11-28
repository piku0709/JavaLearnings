package net.learning.java;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MyClassObjects implements Cloneable{
	
	private String myName = "MyClassObjects";
	
    
   private void sayHello() {
	   System.out.println("hello world from "+myName);
   }

	public static void main(String[] args) {  
		MyClassObjects obj1 = new MyClassObjects();
		obj1.sayHello();
      
      try {
    	  MyClassObjects obj2 = (MyClassObjects)obj1.clone();
    	  obj2.sayHello();
      } catch (CloneNotSupportedException e) {
    	  e.printStackTrace();
      }
      
      try {
    	  @SuppressWarnings("deprecation")
    	  MyClassObjects obj3 = MyClassObjects.class.newInstance();
    	  obj3.sayHello();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
      
      try {
			Class<Object> cls = (Class<Object>)Class.forName("net.learning.java.MyClassObjects");

	    	  MyClassObjects obj4 = (MyClassObjects)cls.newInstance();
	    	  obj4.sayHello();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
      try {
		Constructor<MyClassObjects> constructor = MyClassObjects.class.getConstructor();
		MyClassObjects obj5 = constructor.newInstance();
		obj5.sayHello();
      } catch (NoSuchMethodException | SecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
      } catch (InstantiationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IllegalArgumentException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InvocationTargetException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
}
