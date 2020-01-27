public class Koenig extends Einwohner {

    @Override
    public int zuVersteuerndesEinkommen() {
        return einkommen;
    }

    @Override
    public int steuer() {
        return 0;
    }
}
