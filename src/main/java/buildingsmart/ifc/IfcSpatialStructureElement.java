package buildingsmart.ifc;

public class IfcSpatialStructureElement extends IfcProduct {
    private String LongName;
    private IfcElementCompositionEnum CompositionType;
    private IfcRelReferencedInSpatialStructure[] ReferencesElements;
    private IfcRelServicesBuildings[] ServicedBySystems;
    private IfcRelContainedInSpatialStructure[] ContainsElements;
}
