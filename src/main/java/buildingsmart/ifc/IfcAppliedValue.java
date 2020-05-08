package buildingsmart.ifc;

public class IfcAppliedValue {
    private String Name;
    private String Description;
    private IfcAppliedValueSelect AppliedValue;
    private IfcMeasureWithUnit UnitBasis;
    private IfcDateTimeSelect ApplicableDate;
    private IfcDateTimeSelect FixedUntilDate;
    private IfcReferencesValueDocument[] ValuesReferenced;
    private IfcAppliedValueRelationship[] ValueOfComponents;
    private IfcAppliedValueRelationship[] IsComponentIn;
}
