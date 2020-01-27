public class Leibeigener extends Bauer {

    @Override
    public int zuVersteuerndesEinkommen() {
        return Math.max(super.zuVersteuerndesEinkommen() - 12, 0);
    }

    @Override
    public int steuer() {
        return (int) Math.max((einkommen - 12) * 0.1, 1);
    }
}
