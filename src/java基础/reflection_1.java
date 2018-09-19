package java»ù´¡;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class reflection_1 {
	
	
	public static void main(String args[]) throws InstantiationException, IllegalAccessException {
	teacher t1 = new teacher(1,"teacher1");
	student s1 = new student(1,"jimmy",t1);
	Class<student> stu_class = student.class;
	Class<?> classArr[] = new Class[]{int.class,String.class,teacher.class};
	//System.out.println("id "+s1.getId()+" name "+s1.getName()+" teacher "+s1.getT());
	
	//FIELD
	/*student ss = (student) s.newInstance();
	for(Field f:s.getDeclaredFields())
		{
			f.setAccessible(true);	
			//System.out.println(f.getName());
			
			try {
				f.set(ss, f.get(s1));
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	System.out.println("id "+ss.getId()+" name "+ss.getName()+" teacher  "+ss.getT().getName()+" id "+ss.getT().getId());
	s1.setT(new teacher(2,"X2"));
	System.out.println("id "+s1.getId()+" name "+s1.getName()+" teacher  "+s1.getT().getName()+" id "+s1.getT().getId());
	System.out.println("id "+ss.getId()+" name "+ss.getName()+" teacher  "+ss.getT().getName()+" id "+ss.getT().getId());
	//System.out.println("end");
	 * 
	 */
	//CONSTRUCTOR
	/*
		Constructor<student> cs;
		try {
			cs = stu_class.getDeclaredConstructor(classArr);
			cs.setAccessible(true);
			student s2 = cs.newInstance(1,"tom",new teacher(1,"XX3"));
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	*/
	//Methods
	Method methods[] = stu_class.getDeclaredMethods();
	try {
		Method setname = stu_class.getDeclaredMethod("setName", String.class);
		setname.setAccessible(true);
		try {
			setname.invoke(s1, "TOMMY");
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("id "+s1.getId()+" name "+s1.getName()+" teacher  "+s1.getT().getName()+" id "+s1.getT().getId());
		
	} catch (NoSuchMethodException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SecurityException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	/*for(Method m: methods) {
		
		try {
			Class parameters[] = m.getParameterTypes();
			ArrayList<Object> paras = new ArrayList();
			int i=0;
			for(Class parameter: parameters) {
				Object o=parameter.newInstance();
				paras.add(o);
			}
			m.invoke(s1, paras);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	System.out.println("id "+s1.getId()+" name "+s1.getName()+" teacher  "+s1.getT().getName()+" id "+s1.getT().getId());
	*/
	}
}






class teacher{
	private int id;
	private String name;
	public teacher() {};
	public teacher(int id,String name) {
		this.id=id;
		this.name=name;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
class student{
	private int id;
	private String name;
	private teacher t;
	public student() {};
	public student(int id,String name,teacher t){
		this.id=id;
		this.name=name;
		this.t=t;
	}
	public teacher getT() {
		return t;
	}
	public void setT(teacher t) {
		this.t = t;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
