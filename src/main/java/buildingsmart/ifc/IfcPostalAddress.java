package buildingsmart.ifc;

public class IfcPostalAddress extends IfcAddress {
    private String InternalLocation;
    private String[] AddressLines;
    private String PostalBox;
    private String Town;
    private String Region;
    private String PostalCode;
    private String Country;

    /**
     * @param purpose            Identifies the logical location of the address.
     * @param description        Text that relates the nature of the address.
     * @param userDefinedPurpose Allows for specification of user specific
     *                           purpose of the address beyond the
     *                           enumeration values provided by Purpose
     *                           attribute of type IfcAddressTypeEnum. When a
     *                           value is provided for attribute
     *                           UserDefinedPurpose, in parallel the
     *                           attribute Purpose shall have enumeration
     *                           value USERDEFINED.
     * @throws IllegalArgumentException if there's an invalid combination of
     *                                  purpose and userDefinedPurpose.
     */
    public IfcPostalAddress(IfcAddressTypeEnum purpose, IfcText description,
                            IfcLabel userDefinedPurpose) {
        super(purpose, description, userDefinedPurpose);
    }
}
