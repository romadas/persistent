package com.psl.main;


class X{}
class Y extends X{}
class Z extends Y{}

class GenericClass<T>{
	public void add(T val){} //write
	public T get(){return null;} //read
}
public class Main {

	public static void main(String[] args) {
		GenericClass<? extends X> ref;
		ref = new GenericClass<X>();
		ref = new GenericClass<Y>();
		ref = new GenericClass<Z>();
		
		//ref.add(new X());
		//ref.get();
		GenericClass<? super Y> nref;
		nref = new GenericClass<Y>();
		nref = new GenericClass<X>();
		nref = new GenericClass<Object>();
		nref.add(new Y());
		nref.add(new Z());
		
		GenericClass c =new GenericClass();//raw type
		//nref.get();
		
	}
	public static <T> boolean linearSearch(T val, T data[]){
		return false;
	}

}
