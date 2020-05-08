package buildingsmart.ifc;

public class IfcInventory extends IfcGroup {
    private IfcInventoryTypeEnum InventoryType;
    private IfcActorSelect Jurisdiction;
    private IfcPerson[] ResponsiblePersons;
    private IfcCalendarDate LastUpdateDate;
    private IfcCostValue CurrentValue;
    private IfcCostValue OriginalValue;
}
