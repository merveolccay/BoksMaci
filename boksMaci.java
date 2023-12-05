package java101;

public class boksMaci {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("A", 10, 120, 100,100, 54);
        Fighter f2 = new Fighter("B", 20,85, 85,0 , 87);

        Match match = new Match(f1,f2,85,100);
        match.run();
    }
}
