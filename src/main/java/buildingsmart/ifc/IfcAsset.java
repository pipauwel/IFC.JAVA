package buildingsmart.ifc;

public class IfcAsset extends IfcGroup {
    private String AssetID;
    private IfcCostValue OriginalValue;
    private IfcCostValue CurrentValue;
    private IfcCostValue TotalReplacementCost;
    private IfcActorSelect Owner;
    private IfcActorSelect User;
    private IfcPerson ResponsiblePerson;
    private IfcCalendarDate IncorporationDate;
    private IfcCostValue DepreciatedValue;
}
