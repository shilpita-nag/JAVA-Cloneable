package MMT.Clone.ShallowCopyClone;

public class Employee implements Cloneable{

    int id;

    Person p = new Person();

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
