package buildingsmart.ifc;

public abstract class IfcDraughtingCallout
        extends IfcGeometricRepresentationItem {
    private IfcDraughtingCalloutElement[] Contents;
    private IfcDraughtingCalloutRelationship[] IsRelatedFromCallout;
    private IfcDraughtingCalloutRelationship[] IsRelatedToCallout;
}
