public class mainClass {

    public static void main(String[] args) {
        Königreich yeet = new Königreich("Yeet");

        Adel ad = new Adel();
        Koenig ko = new Koenig();
        Bauer ba = new Bauer();
        Leibeigener le = new Leibeigener();

        yeet.setKönig(ko);
        yeet.setEinwohnerArrayList(ad);
        yeet.setEinwohnerArrayList(ba);
        yeet.setEinwohnerArrayList(le);

        System.out.println("Adel");
        yeet.steuerbescheid(ad, 200);
        yeet.steuerbescheid(ad, 12);

        System.out.println("Bauer");
        yeet.steuerbescheid(ba, 200);

        System.out.println("Leibeigener");
        yeet.steuerbescheid(le, 200);
        yeet.steuerbescheid(le, 8);

        System.out.println("König");
        yeet.steuerbescheid(ko, 4000);
    }

}
