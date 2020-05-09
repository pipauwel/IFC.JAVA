package buildingsmart.ifc;

public enum IfcChangeActionEnum implements IfcDefinedType {
    NOCHANGE, MODIFIED, ADDED, DELETED, MODIFIEDADDED, MODIFIEDDELETED;

    /**
     * @return The representation of the type in an IFC STEP file.
     */
    @Override
    public String serialize() {
        return "'" + name() + "'";
    }
}
