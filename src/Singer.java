public class Singer extends Person {

    private String bandName;

    public Singer() {
    }

    public Singer(String bandName) {
        this.bandName = bandName;
    }

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return super.toString() +

                "\nBand name: " + bandName;

    }
    public void singing(){
        System.out.println(getName() + " " + getDesignation() + " в группе " + getBandName());

    }

    public void playGuitar(){
        System.out.print(getName() + " играет на гитаре ");
    }
}
