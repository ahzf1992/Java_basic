package java����;

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

		
		//equals and == //equals ����������д���Զ���ȽϽ����==�޷��Զ��壬���ڻ�������==�Ƚ���ֵ �����������ͱȽ��ڴ��ַ�Ƿ�һ��
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
	
	
	
	
	//�ֽ����������
	try {
		
		//��Ҫ�ļ��������ļ����������������������
		FileInputStream in = new FileInputStream("sdd");
		FileOutputStream out = new FileOutputStream("ddd");
		
		
	
	//�ַ��������
		//����������������ϼ��ϱ�����������������ֽ������ַ���Ҫ���룬д�ַ�������ֽ�����Ҫ���롣
		
		InputStreamReader reader = new InputStreamReader(in);
		OutputStreamWriter writer = new OutputStreamWriter(out);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//����
	
		//HashSet
		HashSet hs = new HashSet();
		//HashSet�ײ�ΪHashMap������set��Object��ΪHashMap��key��HashMap��valueΪһ����HashSet���õ�Object��
		//����������ͬ��key��ʱ��valueҲ��һ���������ͻ����ʧ�ܣ���֤set��Ψһ��
		//set�ļ��ϲ�ѯ����HashMap��keySet������Ҳ�ǲ�������map���룬
		
		//HashTable
		Hashtable ht = new Hashtable();
		//�̳���Dictionary
		//private transient Entry<?,?>[] table;
		//�ײ�Ϊ�������ʵļ�ֵ�Խڵ�����飬��ʼ��������Ϊ11��loadFactorΪ0.75��
		//����ʱnewCapacity = (oldCapacity << 1) + 1;��������ͷ�巨�ѾɵĽ�����¼���hash���µ�Hashtable��������
		//addEntry(int hash, K key, V value, int index)����������Сδ�ﵽ�������ƣ�ͷ�嵽ָ����㣬ͷ�巨
		//public synchronized V put(K key, V value),���key�Ѿ����������value�����أ��������addEntry
		//hash�������int hash = key.hashCode();
        			//int index = (hash & 0x7FFFFFFF) % tab.length;
		//����������С�������С��С�˼���hash��ʱ�䣬ȴ��������ģ��ʱ��
		//key��value������Ϊ��
		
		//HashMap
		HashMap hm = new HashMap();
		//�̳�AbstractMap<K,V>
		//transient Node<K,V>[] table,NodeΪ��̬�ڲ���
		//Ĭ�ϳ�ʼ��������Ϊ16��loadFactorΪ0.75����Ͱ�ڽڵ㳬��8��������ת���ɺ�����������ڵ��С��6�����ؽ���ʱ�������˻�������
		//�������final V putVal(int hash, K key, V value, boolean onlyIfAbsent, boolean evict)��
		//����hashֵ�ҵ������������Ƚ�key�����ȷ��ظýڵ㣬����ڵ�����Ϊ���ڵ㣬ֱ�Ӳ��벢���أ�
		//����ڵ�key����Ƚ������������ѯ������ڵ�����ﵽ8�������ת������
		//���� final Node<K,V>[] resize()��Ϊ�� ������������hash�� if ((e.hash & oldCap) == 0)ֱ�Ӱѽڵ���뵽����ǰ�벿�ֺͺ�벿��
		//ע�����β�巨����ֹ���������������ֱջ���
		
		
	
	
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