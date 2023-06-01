package StringManipulation;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {

		String s = "This is my java code I am so happy";

		int len = s.length();
		System.out.println(len);

		System.out.println(s.charAt(5));
		System.out.println(s.charAt(9)); // y

//		System.out.println(s.charAt(36)); // SIOB
//		System.out.println(s.charAt(-1)); // SIOB
//		
		System.out.println(s.indexOf('j')); // 11

		System.out.println(s.indexOf('i')); // 2, first occurence of i

		System.out.println(s.indexOf('i', s.indexOf('i') + 1)); // 5

		System.out.println(s.indexOf("java")); // 11

		System.out.println(s.indexOf("testing")); // -1

		String msg = "welcome admin";
		if (msg.indexOf("admin") == 8) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

		// not a good validation
		if (msg.indexOf("admin") > 0) {
			System.out.println("ok");
		} else {
			System.out.println("not ok");
		}

		String test = "  Hello World  ";
		System.out.println(test.trim());

		//
		String t = "Hello this is a java code";
		System.out.println(t.toUpperCase()); // HELLO THIS IS A JAVA CODE
		System.out.println(t.toLowerCase()); // hello this is a java code

		//
		String dob = "01-01-1992";
		System.out.println(dob.replace("-", "/")); // 01/01/1992

		//
		String str = "  Security    testing   ";
		System.out.println(str.replace(" ", "")); // Securitytesting

		//
		String t1 = "hello world";
		String t2 = "Hello World";

		System.out.println(t1 == t2); // false , not recommended

		System.out.println(t1.equals(t2)); // false

		System.out.println(t1.equalsIgnoreCase(t2)); // true

		String browser = "Chrome";
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("Passed"); // Passed
		}

		//
		String p = "Selenium testing";
		System.out.println(p.contains("selenium")); // false
		System.out.println(p.contains("Selenium")); // true
		System.out.println(p.contains("Hi")); // false

		// split

		String lang = "JAVA_PYTHON_DOTNET_RUBY";

		String afterSplit[] = lang.split("_");
		System.out.println(afterSplit[0]); // JAVA
		System.out.println(afterSplit[1]); // PYTHON
		System.out.println(afterSplit[2]); // DOTNET
		System.out.println(afterSplit[3]); // RUBY
//		System.out.println(afterSplit[4]); // IOB

		System.out.println(Arrays.toString(afterSplit)); // [JAVA, PYTHON, DOTNET, RUBY]

		String pop = "xXseleniumxXXtestingXxXJavaXxXpythonX";
		String q[] = pop.split("xX");

		System.out.println(q[0]);
		System.out.println(q[1]);
		System.out.println(q[2]);
		System.out.println(q[3]);
		System.out.println(q[4]);

		System.out.println(Arrays.toString(q)); // [, selenium, XtestingX, JavaX, pythonX]

		System.out.println("**********************************");

		String pop1 = "xXseleniumxXXtestingXxXJavaXxXpythonXxX";
		String q1[] = pop.split("xX");

		System.out.println(q1[0]);
		System.out.println(q1[1]);
		System.out.println(q1[2]);
		System.out.println(q1[3]);
		System.out.println(q1[4]);
//		System.out.println(q1[5]); //IOB

		System.out.println(Arrays.toString(q1));// [, selenium, XtestingX, JavaX, pythonX]

		String empInfo = "Madhav;Singh;Pune;India;Sdet";
		String emp[] = empInfo.split(";");
		for (String e : emp) {
			System.out.print(e); // MadhavSinghPuneIndiaSdet
		}

		System.out.println();
		System.out.println("------------------------------");

		String empInfo1 = "Madhav|Singh|Pune|India|Sdet";

		String emp1[] = empInfo1.split("\\|");
		for (String e : emp1) {
			System.out.print(e); // MadhavSinghPuneIndiaSdet
		}

		System.out.println();

		//
		String x = "100";
		System.out.println(x + 20);// 10020

		// String to int
		int i = Integer.parseInt(x);
		System.out.println(i); // 100
		System.out.println(i + 20); // 120

		// String to double
		String v = "12.33";
		System.out.println(v + 10);// 12.3310
		double d = Double.parseDouble(v);
		System.out.println(d);// 12.33
		System.out.println(d + 15.30);// 27.630000000000003

		// String to boolean
		String str1 = "true";
		boolean bl = Boolean.parseBoolean(str1);
		if (bl) {
			System.out.println("Converted"); // Converted
		}

		// int to String
		int k = 1100;
		System.out.println(k + 20);// 1120
		String k1 = String.valueOf(k);
		System.out.println(k1 + 20);// 110020

		// starts and ends with
		String h = "testing with selenium";
		String g = "development with selenium";

		System.out.println(h.startsWith("testing")); // true
		System.out.println(h.endsWith("selenium")); // true

		System.out.println(h.endsWith("selenium1")); // false

		System.out.println("------------SubString------------------");
		
		// substring
		String messg = "your transaction id is 12345";
		System.out.println(messg.substring(5));// transaction id is 12345
		System.out.println(messg.substring(7));// ansaction id is 12345

		System.out.println(messg.substring(messg.indexOf("is"))); //is 12345
		System.out.println(messg.substring(messg.indexOf("is") + 2).trim()); // 12345

		String trId = messg.substring(messg.indexOf("is") + 2).trim();
		System.out.println(trId);// 12345

		String mg = "your transaction id is 12345";
		System.out.println(mg.substring(0, 9));// 0-8
		System.out.println(mg.substring(mg.indexOf("is") + 2, mg.length()).trim()); // 12345
		
		//
	
		
		
		
		
		
		
		

	}

}
