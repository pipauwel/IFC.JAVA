package buildingsmart.ifc;

import java.util.Objects;

/**
 * An abstract entity type for various kinds of postal and telecom addresses.
 */
public class IfcAddress {
    private final IfcAddressTypeEnum purpose;
    private final IfcText description;
    private final IfcLabel userDefinedPurpose;
    //private IfcPerson[] OfPerson;
    //private IfcOrganization[] OfOrganization;

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
    public IfcAddress(IfcAddressTypeEnum purpose, IfcText description,
                      IfcLabel userDefinedPurpose) {
        if (purpose == IfcAddressTypeEnum.USERDEFINED &&
                userDefinedPurpose == null) {
            throw new IllegalArgumentException("if purpose is set to " +
                    "USERDEFINED, then userDefinedPurpose cannot be null");
        }
        if (purpose != IfcAddressTypeEnum.USERDEFINED &&
                userDefinedPurpose != null) {
            throw new IllegalArgumentException("userDefinedPurpose should be " +
                    "set only when purpose is set to USERDEFINED");
        }
        this.purpose = purpose;
        this.description = description;
        this.userDefinedPurpose = userDefinedPurpose;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IfcAddress that = (IfcAddress) o;
        return purpose == that.purpose &&
                Objects.equals(description, that.description) &&
                Objects.equals(userDefinedPurpose, that.userDefinedPurpose);
    }

    @Override
    public int hashCode() {
        return Objects.hash(purpose, description, userDefinedPurpose);
    }
}
