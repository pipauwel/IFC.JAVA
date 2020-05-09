package buildingsmart.ifc;

public enum IfcStateEnum implements IfcDefinedType {
    READWRITE, READONLY, LOCKED, READWRITELOCKED, READONLYLOCKED;

    @Override
    public String serialize() {
        return "'" + name() + "'";
    }
}
