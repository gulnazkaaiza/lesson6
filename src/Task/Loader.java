package Task;

public class Loader extends Worker{
    public Loader(String name, int pay) {
        setName(name);
        setPay(pay);
    }

    @Override
    public void say() {
        System.out.println("Мы обычно не здороваемся, а сидим в подсобке");
    }
}
