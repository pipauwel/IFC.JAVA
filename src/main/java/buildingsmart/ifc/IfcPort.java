package buildingsmart.ifc;

public class IfcPort extends IfcProduct {
    private IfcRelConnectsPortToElement ContainedIn;
    private IfcRelConnectsPorts[] ConnectedFrom;
    private IfcRelConnectsPorts[] ConnectedTo;
}
