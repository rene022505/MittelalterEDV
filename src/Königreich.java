import java.util.ArrayList;

public class Königreich {

    String name;
    ArrayList<Einwohner> einwohnerArrayList = new ArrayList<>();
    Einwohner könig;

    Königreich(String name) {
        this.name = name;
    }

    public void steuerbescheid(Einwohner einwohner, int einkommen) {
        einwohner.setEinkommen(einkommen);
        System.out.println("Zu versteuerndes Einkommen:");
        System.out.println(einwohner.zuVersteuerndesEinkommen());
        System.out.println("Steuern");
        System.out.println(einwohner.steuer());
        System.out.println("------------------");
        System.out.println();
    }

    public void setEinwohnerArrayList(Einwohner einwohner) {
        einwohnerArrayList.add(einwohner);
    }

    public void setKönig(Koenig koenig) {
        this.könig = koenig;
    }

}
