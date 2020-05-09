package buildingsmart.ifc;

public abstract class IfcBooleanResult extends IfcGeometricRepresentationItem {
    private IfcBooleanOperator Operator;
    private IfcBooleanOperand FirstOperand;
    private IfcBooleanOperand SecondOperand;
    private int Dim;
}
