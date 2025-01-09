//base Item class, implementations available in Book,Car,Coin,Collectible
public interface Item {
    public void setAttributes();
    public void printAttributes();
    public String[][] getFileAttributes();
}
