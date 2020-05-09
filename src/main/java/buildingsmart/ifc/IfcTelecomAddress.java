package buildingsmart.ifc;

public class IfcTelecomAddress extends IfcAddress {
    private String[] TelephoneNumbers;
    private String[] FacsimileNumbers;
    private String PagerNumber;
    private String[] ElectronicMailAddresses;
    private String WWWHomePageURL;

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
    public IfcTelecomAddress(IfcAddressTypeEnum purpose, IfcText description,
                             IfcLabel userDefinedPurpose) {
        super(purpose, description, userDefinedPurpose);
    }
}
