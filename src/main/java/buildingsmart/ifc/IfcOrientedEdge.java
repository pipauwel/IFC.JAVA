package buildingsmart.ifc;

public abstract class IfcOrientedEdge extends IfcEdge {
    private IfcEdge EdgeElement;
    private boolean Orientation;
    private IfcVertex EdgeStart;
    private IfcVertex EdgeEnd;
}
