package quiz;

static class Acid { //1

void process() throws Exception { throw new Exception(); }

}

static class Test extends Acid { //2

void process() { System.out.println("B"); }

public static void main(String[] args) {

new Test().process();

} }
