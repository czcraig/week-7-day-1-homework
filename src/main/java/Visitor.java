public class Visitor {
    private int age;
    private int height;
    private int money;


    public Visitor(int age, int height, int money ){
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public int getAge(){
        return age;
    }

    public float getHeight(){
        return height;
    }

    public float getMoney(){
        return money;
    }



}
