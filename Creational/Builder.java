public class Builder{

    private int age;
    private String name;

    public static Builder builder(){
        return new Builder();
    }

    public Builder setName(String name){
        this.name = name;
        return this;
    }

    public Builder setAge(int age){
        this.age = age;
        return this;
    }

    public String  getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }

    public static void main(String[] args) {
        Builder b = Builder.builder().setAge(20).setName("Raza Jaun");
        System.out.println(b.getAge());
        System.out.println(b.getName());
    }
}