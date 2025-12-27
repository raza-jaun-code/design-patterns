public class Singleton{

    private int a;
    private String name;

    private static Singleton instance = new Singleton();
    private Singleton(){}
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public int getA(){
        return a;
    }

    public void setA(int a){
        this.a = a;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        s1.setA(5);
        s1.setName("Raza Jaun");
        System.out.println(s1.getName());
        System.out.println(s1.getA());
    }
}