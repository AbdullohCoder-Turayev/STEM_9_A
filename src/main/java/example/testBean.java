package example;

public class testBean {
    private String name;

    testBean(String name){
        this.name = name;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public String getName(){
        System.out.println(name);
        return name;
    }
}