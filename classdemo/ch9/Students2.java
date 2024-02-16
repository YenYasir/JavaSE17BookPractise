package classdemo.ch9;

import java.util.HashSet;

 class Student2 {
    private final String name;
    private final String number;
    Student2(String name, String number) {
        this.name = name;
        this.number = number;
    }

    String name() {
        return this.name;
    }

    String number() {
        return this.number();
    }

    @Override
    public String toString()  {
        return "(%s, %s)".formatted(name, number);
    }

    // Eclipse自動產生的equals()與hashCode()

    //給定初始值 為每個物件建立hashCode 以做比較
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((number == null) ? 0 : number.hashCode());
        return result;
    }
    //從各方面比較物件間是否相同
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Student2 other = (Student2) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (number == null) {
            if (other.number != null)
                return false;
        } else if (!number.equals(other.number))
            return false;
        return true;
    }
}

public class Students2 {
    public static void main(String[] args) {
        var students = new HashSet();
        students.add(new Student2("Justin", "B835031"));
        students.add(new Student2("Monica", "B835032"));
        students.add(new Student2("Justin", "B835031"));
        System.out.println(students);
    }
}
