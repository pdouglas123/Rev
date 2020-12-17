
public class wrap {

	public static void main(String[] args) {
		//int
		Integer i1=10;
		Integer i2=10;
		Integer i3=new Integer(10);
		System.out.println("i1 = "+i1);
		System.out.println("i2 = "+i2);
		System.out.println("i3 = "+i3);
		System.out.println("i1==i2 "+(i1==i2));
		System.out.println("i1==i3 "+(i1==i3));
		
		System.out.println("i1.equals(i2)) "+(i1.equals(i2)));
		System.out.println("i1.equals(i3)) "+(i1.equals(i3)));
		
		int x=i1; //Autoboxing
		System.out.println("x = "+x);
		x=1000;
		i1=x;
		System.out.println("i1 = "+i1);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		//Java reads everything as String and Java writes everything as String
		String s="33";
		int age=Integer.parseInt(s); //similar method in all other Wrapper classes except Character. 
		System.out.println("age = "+age);
		
		age=99;
		s=age+"";
		System.out.println("s = "+s);
		Integer i5=1000;
		s=i5.toString();
		System.out.println("s = "+s);
		
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toHexString(10));
		System.out.println(Integer.toOctalString(10));
		
		//compareTo - if 1st object is greater then the 2nd it will return +1 if it is same it will return 0 else -1
		System.out.println("i5 = "+i5);
		System.out.println("i5.compareTo(1000) "+i5.compareTo(1000));
		System.out.println("i5.compareTo(2000) "+i5.compareTo(2000));
		System.out.println("i5.compareTo(100) "+i5.compareTo(100));
		
		Double d=12.55;
		int f=d.intValue();
		System.out.println("f = "+f);

		//long///////////////////////////
		
		Long l1=100L;
		Long l2=200L;
		Long l3=new Long(300L);
		System.out.println("l1 = "+i1);
		System.out.println("l2 = "+i2);
		System.out.println("l3 = "+i3);
		System.out.println("l1==l2 "+(i1==i2));
		System.out.println("l1==l3 "+(i1==i3)); 
		
		System.out.println("l1.equals(l2)) "+(l1.equals(l2)));
		System.out.println("l1.equals(l3)) "+(l1.equals(l3)));
		
		long l=i1; //Autoboxing
		System.out.println("l = "+l);
		l=1000;
		l1=l;
		System.out.println("l1 = "+l1);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		//Java reads everything as String and Java writes everything as String
		String longst="23";
		long agelong=Integer.parseInt(longst); //similar method in all other Wrapper classes except Character. 
		System.out.println("age = "+agelong);

		age=99;
		longst=age+"";
		System.out.println("longst = "+longst);
		Integer l5=1000;
		longst=l5.toString();
		System.out.println("longst = "+longst);
		
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toHexString(10));
		System.out.println(Integer.toOctalString(10));
		
		//compareTo - if 1st object is greater then the 2nd it will return +1 if it is same it will return 0 else -1
		System.out.println("l5 = "+l5);
		System.out.println("l5.compareTo(1000) "+l5.compareTo(1000));
		System.out.println("l5.compareTo(2000) "+l5.compareTo(2000));
		System.out.println("l5.compareTo(100) "+l5.compareTo(100));
		
		Double dlong=12.55;
		long flong=dlong.intValue();
		System.out.println("flong = "+flong);
		
		//double/////////////////////////////
		
		Double d1=123.4;
		Double d2=456.8;
		Double d3=new Double(300.1);
		System.out.println("d1 = "+d1);
		System.out.println("d2 = "+d2);
		System.out.println("d3 = "+d3);
		System.out.println("d1==d2 "+(d1==d2));
		System.out.println("d1==d3 "+(d1==d3)); 
		
		System.out.println("d1.equals(d2)) "+(d1.equals(d2)));
		System.out.println("d1.equals(d3)) "+(d1.equals(d3)));
		
		double dd=d1; //Autoboxing
		System.out.println("d = "+d);
		dd=16.4;
		d1=dd;
		System.out.println("d1 = "+d1);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		//Java reads everything as String and Java writes everything as String
		String doublest="23";
		long agedouble=Integer.parseInt(doublest); //similar method in all other Wrapper classes except Character. 
		System.out.println("age = "+agedouble);

		agedouble=99;
		doublest=age+"";
		System.out.println("doublest = "+doublest);
		Integer d5=1000;
		doublest=l5.toString();
		System.out.println("doublest = "+doublest);
		
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toHexString(10));
		System.out.println(Integer.toOctalString(10));
		
		//compareTo - if 1st object is greater then the 2nd it will return +1 if it is same it will return 0 else -1
		System.out.println("l5 = "+l5);
		System.out.println("l5.compareTo(1000) "+l5.compareTo(1000));
		System.out.println("l5.compareTo(2000) "+l5.compareTo(2000));
		System.out.println("l5.compareTo(100) "+l5.compareTo(100));
		
		
		//float//////////////////////////////////////////
		
		Float f1=20.4F;
		Float f2=80.5F;
		Float f3=new Float(30.4F);
		System.out.println("f1 = "+f1);
		System.out.println("f2 = "+f2);
		System.out.println("f3 = "+f3);
		System.out.println("l1==l2 "+(f1==f2));
		System.out.println("l1==l3 "+(f1==f3)); 
		
		System.out.println("l1.equals(l2)) "+(l1.equals(l2)));
		System.out.println("l1.equals(l3)) "+(l1.equals(l3)));
		
		float ff=f1; //Autoboxing
		System.out.println("f1 = "+f);
		ff=20.4F;
		f1=ff;
		System.out.println("f1 = "+f1);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		//Java reads everything as String and Java writes everything as String
		String longfl="23";
		float agefloat=Integer.parseInt(longst); //similar method in all other Wrapper classes except Character. 
		System.out.println("age = "+agefloat);

		age=99;
		longst=age+"";
		System.out.println("longst = "+longst);
		Integer f5=1000;
		longst=f5.toString();
		System.out.println("longst = "+longst);
		
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toHexString(10));
		System.out.println(Integer.toOctalString(10));
		
		//compareTo - if 1st object is greater then the 2nd it will return +1 if it is same it will return 0 else -1
		System.out.println("f5 = "+f5);
		System.out.println("f5.compareTo(1000) "+f5.compareTo(1000));
		System.out.println("f5.compareTo(2000) "+f5.compareTo(2000));
		System.out.println("f5.compareTo(100) "+f5.compareTo(100));
		
	}

}
