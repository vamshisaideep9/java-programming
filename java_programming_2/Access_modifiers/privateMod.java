

class Person {
    // private variable
    private String name;
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}



public class privateMod {
    public static void main(String[] args) {
        
        Person p = new Person();
        p.setName("vamshi");

        System.out.println(p.getName());
    }
}
