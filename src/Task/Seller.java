package Task;

public class Seller extends Worker {
    private String position;

    public Seller(String name, int pay, String position) {
        setName(name);
        setPay(pay);
        setPosition(position);
    }

    public void setPosition(String value) {
        position = value;
    }

    public String getPosition() {
        return position;
    }

   @Override
   public void say () {
       System.out.println("Мы здороваемся с посетителями");
    }
}
