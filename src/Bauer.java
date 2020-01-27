public class Bauer extends Einwohner {

    @Override
    public int zuVersteuerndesEinkommen() {
        return Math.max(einkommen, 1);
    }

    @Override
    public int steuer() {
        return (int) Math.max(einkommen * 0.1, 1);
    }
}
