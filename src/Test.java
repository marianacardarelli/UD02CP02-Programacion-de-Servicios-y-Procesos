public class Test {
    public static void main(String[] args) {
        VariableCompartida variable =new VariableCompartida(0);
        Thread hebra1 = new Thread(new Hilo(variable));
        Thread hebra2 = new Thread(new Hilo(variable));
        hebra1.start();
        hebra2.start();
    }
}
