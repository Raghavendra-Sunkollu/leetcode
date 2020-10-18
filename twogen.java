package generics;
class twogen<t,v>{
	t ob1;
	v ob2;
	twogen(t o1,v o2){
		ob1=o1;
		ob2=o2;	
	}
	t getob1(){
		return ob1;
	}
	v getob2() {
		return ob2;
	}
	void show() {
		System.out.println("the type of t is"+ob1.getClass().getName());
		
		System.out.println("the type of v is"+ob2.getClass().getName());
		}
	}
public class simpgen {

	public static void main(String[] args) {
		twogen<Integer,String> clobj=new twogen<Integer,String>(100,"hello iam two type geniric");
		clobj.show();
		int v=clobj.getob1();
		System.out.println("value "+v);
		String str=clobj.getob2();
		System.out.println("value "+str);
	}
}
