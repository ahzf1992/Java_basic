package java基础;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;


public class basic_basic {

	
	
	
	
	public static void main(String[] args) {

		
		//equals and == //equals 方法可以重写来自定义比较结果，==无法自定义，对于基本类型==比较数值 对于引用类型比较内存地址是否一样
		/*int i=11;
		int j=11;
		Integer i1 = new Integer(11);
		Integer i2 = new Integer(11);
		int k=11;
		float f=11.1f;
		ant a1 = new ant(1,"ant_1");
		ant a2 = new ant(1,"ant_2");
		System.out.println("int i == Integer i1 "+(i==f));
		//System.out.println("int i == j "+(i==j));
		//System.out.println("integer i1 == i2 "+(i1==i2));
		//System.out.println("integer i1 equals i2 "+(i1.equals(i2)));
		//System.out.println("Ant a1 == a2 "+(a1==a2));
		//System.out.println("Ant a1 equals a2 "+(a1.equals(a2)));
		*/
	
	
	//String.intern
	
	String s1 = "let it go!";
	String s2 = s1.intern();
	System.out.println("s1 == s1.intern() "+ s1==s2);
	
	
	
	
	//字节输入输出流
	try {
		
		//需要文件名或者文件描述符来创建输入输出流
		FileInputStream in = new FileInputStream("sdd");
		FileOutputStream out = new FileOutputStream("ddd");
		
		
	
	//字符输入输出
		//在输入输出流基础上加上编码解码器，从输入字节流读字符需要解码，写字符到输出字节流需要编码。
		
		InputStreamReader reader = new InputStreamReader(in);
		OutputStreamWriter writer = new OutputStreamWriter(out);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//集合
	
		//HashSet
		HashSet hs = new HashSet();
		//HashSet底层为HashMap，存入set的Object作为HashMap的key，HashMap的value为一个该HashSet公用的Object，
		//这样放入相同的key的时候，value也是一样，这样就会插入失败，保证set内唯一性
		//set的集合查询返回HashMap的keySet，插入也是插入利用map插入，
		
		//HashTable
		Hashtable ht = new Hashtable();
		//继承自Dictionary
		//private transient Entry<?,?>[] table;
		//底层为链表性质的键值对节点的数组，初始数组容量为11，loadFactor为0.75，
		//扩容时newCapacity = (oldCapacity << 1) + 1;采用链表头插法把旧的结点重新计算hash到新的Hashtable的数组中
		//addEntry(int hash, K key, V value, int index)，如果数组大小未达到扩容限制，头插到指定结点，头插法
		//public synchronized V put(K key, V value),如果key已经存在则更新value并返回，否则调用addEntry
		//hash计算采用int hash = key.hashCode();
        			//int index = (hash & 0x7FFFFFFF) % tab.length;
		//采用奇数大小的数组大小减小了计算hash的时间，却增加了求模的时间
		//key和value不允许为空
		
		//HashMap
		HashMap hm = new HashMap();
		//继承AbstractMap<K,V>
		//transient Node<K,V>[] table,Node为静态内部类
		//默认初始数组容量为16，loadFactor为0.75，当桶内节点超过8个，链表转化成红黑树，当树节点减小到6个，重建的时候树会退化成链表
		//插入操作final V putVal(int hash, K key, V value, boolean onlyIfAbsent, boolean evict)；
		//利用hash值找到数组索引，比较key如果相等返回该节点，如果节点类型为树节点，直接插入并返回，
		//如果节点key不相等进行链表遍历查询，如果节点计数达到8则把链表转化成树
		//扩容 final Node<K,V>[] resize()；为树 和链表则利用hash法 if ((e.hash & oldCap) == 0)直接把节点插入到数组前半部分和后半部分
		//注意采用尾插法，防止并发情况下链表出现闭环。
		
		
	
	
	}
}
class ant{
	int id;
	String name;
	
	public ant(int id,String name) {
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
	
	@Override
	public boolean equals(Object obj) {
        ant a = (ant)obj;
		return (this.id == a.id);
    }
	
}