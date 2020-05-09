package buildingsmart.ifc;

public abstract class IfcSweptDiskSolid extends IfcSolidModel {
    private IfcCurve Directrix;
    private IfcLengthMeasure Radius;
    private IfcLengthMeasure InnerRadius;
    private double StartParam;
    private double EndParam;
}
