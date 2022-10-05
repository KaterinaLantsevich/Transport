package Sprint1.Ovningar.ovning1a;

public class Person {
    private String namn;
    private String adress;
    private int ålder;

    public Person(String namn, String adress,
                  int ålder)  {
        this.namn = namn;
        this.adress = adress;
        this.ålder = ålder;
    }

    public Person() {} //default konstruktor

    public String getNamn() {
        return namn;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getÅlder() {
        return ålder;
    }

    public void setÅlder(int ålder) {
        this.ålder = ålder;
    }

}
