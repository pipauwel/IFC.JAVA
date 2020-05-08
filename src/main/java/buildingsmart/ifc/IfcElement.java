package buildingsmart.ifc;

public class IfcElement extends IfcProduct {
    private String Tag;
    private IfcRelConnectsStructuralElement[] HasStructuralMember;
    private IfcRelFillsElement[] FillsVoids;
    private IfcRelConnectsElements[] ConnectedTo;
    private IfcRelCoversBldgElements[] HasCoverings;
    private IfcRelProjectsElement[] HasProjections;
    private IfcRelReferencedInSpatialStructure[] ReferencedInStructures;
    private IfcRelConnectsPortToElement[] HasPorts;
    private IfcRelVoidsElement[] HasOpenings;
    private IfcRelConnectsWithRealizingElements[] IsConnectionRealization;
    private IfcRelSpaceBoundary[] ProvidesBoundaries;
    private IfcRelConnectsElements[] ConnectedFrom;
    private IfcRelContainedInSpatialStructure[] ContainedInStructure;
}
