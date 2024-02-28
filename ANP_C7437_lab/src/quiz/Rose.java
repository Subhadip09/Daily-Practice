package quiz;

class Rose {

public static void main(String s[]) {

try {

int x = 6/0;

}

catch(Exception e) {

System.out.println("Exception:"+e);

}

catch(ArithmeticException e1) {

System.out.println("Arithmetic Exception:"+e1);

}

}

}