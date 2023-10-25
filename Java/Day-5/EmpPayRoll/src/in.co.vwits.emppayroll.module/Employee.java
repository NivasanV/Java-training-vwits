package in.co.vwits.emppayroll.module;

public class Employee {
    private int id;
    private String name;

    public int getId(int id){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return "Employee [id="+id+", name="+name+"]";
    }

}