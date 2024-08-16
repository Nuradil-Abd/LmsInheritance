public class Person {

    private String name, designation;

    public Person() {
    }

    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" +
                "\nname:" + name +
                "\ndesignation: " + designation ;
    }


    public void learn(String occupation){
        System.out.println(getName() + " учится " + occupation);

    }

    public void walk(String goTo){
        System.out.println( getName() + " ходит " +  goTo);

    }

    public void eat(String favoriteFood){
        System.out.println(getName() + " любит есть " + favoriteFood);

    }

}
