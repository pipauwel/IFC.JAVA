package buildingsmart.ifc;

import com.sun.istack.internal.NotNull;

import java.util.List;
import java.util.Objects;

/**
 * Identification of a person within an organization.
 */
public class IfcPersonAndOrganization {
    private final IfcPerson thePerson;
    private final IfcOrganization theOrganization;
    private final List<IfcActorRole> roles;

    /**
     * @param thePerson       The person who is related to the organization.
     * @param theOrganization The organization to which the person is related.
     * @param roles           Roles played by the person within the context
     *                        of an organization.
     */
    public IfcPersonAndOrganization(@NotNull IfcPerson thePerson,
                                    @NotNull IfcOrganization theOrganization,
                                    List<IfcActorRole> roles) {
        if (thePerson == null) {
            throw new IllegalArgumentException("thePerson cannot be null");
        }
        if (theOrganization == null) {
            throw new IllegalArgumentException(
                    "theOrganization cannot be null");
        }
        if (roles != null && roles.size() < 1) {
            throw new IllegalArgumentException(
                    "role must be null or its size must be at least one");
        }
        this.thePerson = thePerson;
        this.theOrganization = theOrganization;
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IfcPersonAndOrganization that = (IfcPersonAndOrganization) o;
        return thePerson.equals(that.thePerson) &&
                theOrganization.equals(that.theOrganization) &&
                Objects.equals(roles, that.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(thePerson, theOrganization, roles);
    }
}
