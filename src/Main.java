public class Main {
    public static void main(String[] args) {
        Dancer dancer = new Dancer("Atai","танцор", "BTS");
        System.out.println(dancer);
        dancer.learn("танцевать брейк");
        dancer.walk("в бассейн");
        dancer.eat("куурдак");
        dancer.dancing();


        Programmer programmer = new Programmer("Kayrat","програмист","Google");
        System.out.println(programmer);
        programmer.learn("програмировать");
        programmer.walk("в спорт зал");
        programmer.eat("шаурму");
        programmer.coding();


        Singer singer = new Singer("Lisa","певица","BlackPink");
        System.out.println(singer);
        singer.learn("вести себя на публике");
        singer.walk("на уроки вокала");
        singer.eat("Рамен");
        singer.singing();
        singer.playGuitar();


    }
}