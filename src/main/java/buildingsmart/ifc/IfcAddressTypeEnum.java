package buildingsmart.ifc;

/**
 * Identifies the logical location of the address.
 */
public enum IfcAddressTypeEnum implements IfcDefinedType {
    OFFICE, SITE, HOME, DISTRIBUTIONPOINT, USERDEFINED;

    /**
     * @return The representation of the type in an IFC STEP file.
     */
    @Override
    public String serialize() {
        return "'" + name() + "'";
    }
}
