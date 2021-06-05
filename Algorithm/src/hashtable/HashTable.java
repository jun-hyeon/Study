package hashtable;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Scanner;


class Dictionary{
	Hashtable <Integer, String> dic = new Hashtable<>();
	
	int id;
	String name;
	
	public Dictionary() {
		this.id = id;
		this.name = name;
	}
	
	public void put(int id,String name) {
		dic.put(id, name);
	}
	
	public void command(int n) {
		if(dic.containsKey(n)) {
			System.out.println(dic.get(n));
		}
	}
}

class Human{
	int key;
	String value;
	
	public Human(int key,String value) {
		this.key = key;
		this.value = value;
	}
	
	public void command() {
		System.out.println(value);
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	
}

public class HashTable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human human1 = new Human(1,"������");
		Human human2 = new Human(2,"����ȣ");
		Human human3 = new Human(3,"����Ѽ�");
		
		human1.command();
		human2.command();
		human3.command();
		
		
		Hashtable<Integer,String> hash = new Hashtable<>();
		Dictionary d = new Dictionary();
		//dictionary�� �߰�
		d.put(1, "������");
		d.put(2, "����ȣ");
		d.put(3, "����Ѽ�");
		d.put(4, "������");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�Է�: ");
		int n = sc.nextInt();
		d.command(n);
		
		
	}

}
