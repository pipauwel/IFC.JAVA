package buildingsmart.ifc;

public class IfcWorkControl extends IfcControl {
    private String Identifier;
    private IfcDateTimeSelect CreationDate;
    private IfcPerson[] Creators;
    private String Purpose;
    private double Duration;
    private double TotalFloat;
    private IfcDateTimeSelect StartTime;
    private IfcDateTimeSelect FinishTime;
    private IfcWorkControlTypeEnum WorkControlType;
    private String UserDefinedControlType;
}
