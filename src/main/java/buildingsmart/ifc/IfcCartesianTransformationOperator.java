package buildingsmart.ifc;

public abstract class IfcCartesianTransformationOperator
        extends IfcGeometricRepresentationItem {
    private IfcDirection Axis1;
    private IfcDirection Axis2;
    private IfcCartesianPoint LocalOrigin;
    private double Scale;
    private double Scl;
    private int Dim;
}
