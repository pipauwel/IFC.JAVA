package buildingsmart.ifc;

public class IfcOrganization {
    private String Id;
    private String Name;
    private String Description;
    private IfcActorRole[] Roles;
    private IfcAddress[] Addresses;
    private IfcOrganizationRelationship[] IsRelatedBy;
    private IfcOrganizationRelationship[] Relates;
    private IfcPersonAndOrganization[] Engages;
}
