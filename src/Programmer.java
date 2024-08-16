public class Programmer extends Person {

    private String companyName;

    public Programmer() {
    }

    public Programmer(String companyName) {
        this.companyName = companyName;
    }

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCompany name: " + companyName;

    }

    public void coding(){

        System.out.println(getName() + " " + getDesignation() + " в компании " + getCompanyName());

    }
}
