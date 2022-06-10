package MMT.Clone.DeepCopyClone;

public class CallDeepClone {
    public static void main(String args[]) throws CloneNotSupportedException {
        Employee e = new Employee();
        e.id = 1;
        e.p.name = "X";
        e.p.age = 20;

        Employee e2 = (Employee) e.clone();
        e2.p.name = "Y";

        System.out.println(e.p.name);
        System.out.println(e2.p.name);

        e.p.age = 21;
        System.out.println(e.p.age);
        System.out.println(e2.p.age);
    }
}
