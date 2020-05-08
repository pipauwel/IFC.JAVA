package buildingsmart.ifc;

public class IfcProperty {
    private String Name;
    private String Description;
    private IfcPropertyDependencyRelationship[] PropertyForDependance;
    private IfcPropertyDependencyRelationship[] PropertyDependsOn;
    private IfcComplexProperty[] PartOfComplex;
}
