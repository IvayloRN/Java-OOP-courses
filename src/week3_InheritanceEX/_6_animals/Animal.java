package week3_InheritanceEX._6_animals;

public class Animal {
    protected String name;
    protected int age;
    protected String gender;

    public Animal(String name, int age, String gender){
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }
    public String produceSound(){
        return "";
    }
    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.trim().isEmpty()){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    private void setAge(int age) {
        if (age < 0 ){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    private void setGender(String gender) {
        if (gender.trim().isEmpty()){
            throw new IllegalArgumentException("Invalid input!");
        }
        this.gender = gender;
    }



    @Override
    public String toString(){
        return String.format("%s \n" +
                "%s %d %s\n" +
                "%s",
                this.getClass().getSimpleName(),
                this.name,
                this.age,
                this.gender,
                produceSound());
    }
}
