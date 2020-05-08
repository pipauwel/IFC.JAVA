package buildingsmart.ifc;

/**
 * Roles which may be played by an actor.
 */
public enum IfcRoleEnum implements IfcDefinedType {
    SUPPLIER, MANUFACTURER, CONTRACTOR, SUBCONTRACTOR, ARCHITECT,
    STRUCTURALENGINEER, COSTENGINEER, CLIENT, BUILDINGOWNER, BUILDINGOPERATOR,
    MECHANICALENGINEER, ELECTRICALENGINEER, PROJECTMANAGER, FACILITIESMANAGER,
    CIVILENGINEER, COMISSIONINGENGINEER, ENGINEER, OWNER, CONSULTANT,
    CONSTRUCTIONMANAGER, FIELDCONSTRUCTIONMANAGER, RESELLER, USERDEFINED;

    /**
     * @return The representation of the type in an IFC STEP file.
     */
    @Override
    public String serialize() {
        return "'" + name() + "'";
    }
}
