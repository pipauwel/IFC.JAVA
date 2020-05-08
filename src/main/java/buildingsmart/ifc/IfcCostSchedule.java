package buildingsmart.ifc;

public class IfcCostSchedule extends IfcControl {
    private IfcActorSelect SubmittedBy;
    private IfcActorSelect PreparedBy;
    private IfcDateTimeSelect SubmittedOn;
    private String Status;
    private IfcActorSelect[] TargetUsers;
    private IfcDateTimeSelect UpdateDate;
    private String ID;
    private IfcCostScheduleTypeEnum PredefinedType;
}
