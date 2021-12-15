package Methods;

public class AboutUser {
    private String name;
    private int sex;
    private int age;
    private double height;
    private double weight;
    private int activity;

    public int getActivity() {
        return activity;
    }

    public void setActivity(int activity) {
        this.activity = activity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        if (sex != 1 && sex != 2) {
            throw new IllegalArgumentException("You can choose 1 or 2");
        }
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0 || age>100) {
            throw new IllegalArgumentException("Your age cant`t be less than 0 and more then 100");
        }
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if(height<100 || height>250) {
            throw new IllegalArgumentException("Your height cant`t be less than 100 and more then 250");
        }
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if(weight<30) {
            throw new IllegalArgumentException("Your weight cant`t be less than 30");
        }
        this.weight = weight;
    }
}
