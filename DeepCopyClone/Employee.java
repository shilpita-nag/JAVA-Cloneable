package MMT.Clone.DeepCopyClone;

public class Employee implements Cloneable{

    int id;

    Person p = new Person();

    @Override
    public Object clone() throws CloneNotSupportedException{

        Employee e = (Employee) super.clone();
        e.p = new Person();
        e.p.name = p.name;
        e.p.age = p.age;

        return e;
    }

}
