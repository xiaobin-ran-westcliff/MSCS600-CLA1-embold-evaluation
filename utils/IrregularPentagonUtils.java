package utils;

public final class IrregularPentagonUtils {
    private IrregularPentagonUtils() { }

    public static double getIrregularPentagonCircum__FeatureEnvy(IrregularPentagon p) {
        return p.getEdge1() + p.getEdge2() + p.getEdge3() + p.getEdge4() + p.getEdge5();
    }
}