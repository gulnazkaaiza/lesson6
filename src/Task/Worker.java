package Task;

public abstract class Worker {
    private String name;
    private Integer pay;

    public void setName(String aName) {
        name = aName;
    }

    public String getName() {
        return name;
    }

    public void setPay(int value) {
        pay = value;
    }

    public Integer getPay() {
        return pay;
    }

    public void Position(String Position) {
        Position = Position;
    }

    public abstract void say();

}

