public class ParametruNegativ extends Exception {
    public ParametruNegativ(int dim) {
        super("Parametrul primit " + dim + " este negativ, adica mai mic ca si 0.");
    }
}
