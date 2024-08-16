public class Dancer extends Person {

    private String groupName;

    public Dancer() {
    }

    public Dancer(String groupName) {
        this.groupName = groupName;
    }

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nGroup name: " + groupName;

    }

    public void dancing(){
        System.out.println(getName() + " " + getDesignation() + " в группе " + getGroupName());

    }
}
