package buildingsmart.ifc;

import java.util.List;
import java.util.Objects;

/**
 * An individual human being.
 */
public class IfcPerson {
    private final IfcIdentifier id;
    private final IfcLabel familyName;
    private final IfcLabel givenName;
    private final List<IfcLabel> middleNames;
    private final List<IfcLabel> prefixTitles;
    private final List<IfcLabel> suffixTitles;
    private final List<IfcActorRole> roles;
    private final List<IfcAddress> addresses;
    //private IfcPersonAndOrganization[] engagedIn;

    /**
     * @param id           Identification of the person.
     * @param familyName   The name by which the family identity of the
     *                     person may be recognized.
     * @param givenName    The name by which a person is known within a
     *                     family and by which he or she may be familiarly
     *                     recognized.
     * @param middleNames  Additional names given to a person that enable
     *                     their identification apart from others who may
     *                     have the same or similar family and given names.
     * @param prefixTitles The word, or group of words, which specify the
     *                     person's social and/or professional standing and
     *                     appear before his/her names.
     * @param suffixTitles The word, or group of words, which specify the
     *                     person's social and/or professional standing and
     *                     appear after his/her names.
     * @param roles        Roles played by the person.
     * @param addresses    Postal and telecommunication addresses of a person.
     * @throws IllegalArgumentException If both familyName and givenName are
     *                                  null.
     */
    public IfcPerson(IfcIdentifier id, IfcLabel familyName, IfcLabel givenName,
                     List<IfcLabel> middleNames, List<IfcLabel> prefixTitles,
                     List<IfcLabel> suffixTitles, List<IfcActorRole> roles,
                     List<IfcAddress> addresses) {
        if (familyName == null && givenName == null) {
            throw new IllegalArgumentException(
                    "familyName and givenName can't be both null, at least " +
                            "one of them should have a value");
        }
        this.id = id;
        this.familyName = familyName;
        this.givenName = givenName;
        this.middleNames = middleNames;
        this.prefixTitles = prefixTitles;
        this.suffixTitles = suffixTitles;
        this.roles = roles;
        this.addresses = addresses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IfcPerson ifcPerson = (IfcPerson) o;
        return Objects.equals(id, ifcPerson.id) &&
                Objects.equals(familyName, ifcPerson.familyName) &&
                Objects.equals(givenName, ifcPerson.givenName) &&
                Objects.equals(middleNames, ifcPerson.middleNames) &&
                Objects.equals(prefixTitles, ifcPerson.prefixTitles) &&
                Objects.equals(suffixTitles, ifcPerson.suffixTitles) &&
                Objects.equals(roles, ifcPerson.roles) &&
                Objects.equals(addresses, ifcPerson.addresses);
    }

    @Override
    public int hashCode() {
        return Objects
                .hash(id, familyName, givenName, middleNames, prefixTitles,
                        suffixTitles, roles, addresses);
    }
}
