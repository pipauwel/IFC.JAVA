package buildingsmart.ifc;

public class IfcApproval {
    private String Description;
    private IfcDateTimeSelect ApprovalDateTime;
    private String ApprovalStatus;
    private String ApprovalLevel;
    private String ApprovalQualifier;
    private String Name;
    private String Identifier;
    private IfcApprovalActorRelationship[] Actors;
    private IfcApprovalRelationship[] IsRelatedWith;
    private IfcApprovalRelationship[] Relates;
}
