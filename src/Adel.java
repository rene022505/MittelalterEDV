public class Adel extends Einwohner {

    @Override
    public int zuVersteuerndesEinkommen() {
        return einkommen;
    }

    @Override
    public int steuer() {
        return (int) Math.max(20, einkommen * 0.1);
    }
}
