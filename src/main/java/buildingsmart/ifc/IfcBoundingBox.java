package buildingsmart.ifc;

public abstract class IfcBoundingBox extends IfcGeometricRepresentationItem {
    private IfcCartesianPoint Corner;
    private IfcLengthMeasure XDim;
    private IfcLengthMeasure YDim;
    private IfcLengthMeasure ZDim;
    private int Dim;
}
