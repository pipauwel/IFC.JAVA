package buildingsmart.ifc;

public class IfcDocumentInformation {
    private String DocumentId;
    private String Name;
    private String Description;
    private IfcDocumentReference[] DocumentReferences;
    private String Purpose;
    private String IntendedUse;
    private String Scope;
    private String Revision;
    private IfcActorSelect DocumentOwner;
    private IfcActorSelect[] Editors;
    private IfcDateAndTime CreationTime;
    private IfcDateAndTime LastRevisionTime;
    private IfcDocumentElectronicFormat ElectronicFormat;
    private IfcCalendarDate ValidFrom;
    private IfcCalendarDate ValidUntil;
    private IfcDocumentConfidentialityEnum Confidentiality;
    private IfcDocumentStatusEnum Status;
    private IfcDocumentInformationRelationship[] IsPointedTo;
    private IfcDocumentInformationRelationship[] IsPointer;
}
