package buildingsmart.ifc;

public abstract class IfcLightSourceSpot extends IfcLightSourcePositional {
    private IfcDirection Orientation;
    private double ConcentrationExponent;
    private IfcPlaneAngleMeasure SpreadAngle;
    private IfcPlaneAngleMeasure BeamWidthAngle;
}
