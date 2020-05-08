package buildingsmart.ifc;

public class IfcSpaceProgram extends IfcControl {
    private String SpaceProgramIdentifier;
    private double MaxRequiredArea;
    private double MinRequiredArea;
    private IfcSpatialStructureElement RequestedLocation;
    private double StandardRequiredArea;
    private IfcRelInteractionRequirements[] HasInteractionReqsFrom;
    private IfcRelInteractionRequirements[] HasInteractionReqsTo;
}
