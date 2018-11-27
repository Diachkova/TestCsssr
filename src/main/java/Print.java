public class Print {

    private String result;
    private String operation;

    public Print(String operation, String result) {
        this.operation = operation;
        this.result = result;
    }

    public String output() {

        return this.operation + this.result;
    }
}