package annotations;

//this is
public class InjectMe {
    String s = "Beginning String";
    @Inject("Fred")
    private String f;
    @Inject("Jim")
    String j;

    @Override
    public String toString() {
        return "InjectMe{" +
                "s='" + s + '\'' +
                ", a='" + f + '\'' +
                ", a2='" + j + '\'' +
                '}';
    }
}
