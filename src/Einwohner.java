public abstract class Einwohner {

    int einkommen;

    public abstract int zuVersteuerndesEinkommen();
    public abstract int steuer();

    public void setEinkommen(int betrag) {
        this.einkommen = betrag;
    }
}
