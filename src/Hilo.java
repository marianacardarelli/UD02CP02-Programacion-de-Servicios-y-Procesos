public class Hilo implements Runnable {
    private VariableCompartida compartir;

    public Hilo(VariableCompartida compartir) {
        this.compartir = compartir;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            compartir.incrementar();
        }
        System.out.println(Thread.currentThread().getName() + " terminó. v = " + compartir.getV());
    }
}
