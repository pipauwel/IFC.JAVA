package buildingsmart.ifc;

import com.sun.istack.internal.NotNull;

import java.util.List;
import java.util.Objects;

/**
 * A named and structured grouping with a corporate identity.
 */
public class IfcOrganization {
    private final IfcIdentifier id;
    private final IfcLabel name;
    private final IfcText description;
    private final List<IfcActorRole> roles;
    private final List<IfcAddress> addresses;
    //private IfcOrganizationRelationship[] IsRelatedBy;
    //private IfcOrganizationRelationship[] Relates;
    //private IfcPersonAndOrganization[] Engages;

    /**
     * @param id          Identification of the organization.
     * @param name        The word, or group of words, by which the
     *                    organization is referred to. Cannot be null.
     * @param description Text that relates the nature of the organization.
     * @param roles       Roles played by the organization.
     * @param addresses   Postal and telecom addresses of an organization.
     * @throws IllegalArgumentException If name is null, or roles or
     *                                  addresses' size is zero.
     */
    public IfcOrganization(IfcIdentifier id, @NotNull IfcLabel name,
                           IfcText description, List<IfcActorRole> roles,
                           List<IfcAddress> addresses) {
        if (name == null) {
            throw new IllegalArgumentException("name cannot be null");
        }
        if (roles != null && roles.size() < 1) {
            throw new IllegalArgumentException(
                    "roles must be null or its size must be at least one");
        }
        if (addresses != null && addresses.size() < 1) {
            throw new IllegalArgumentException(
                    "addresses must be null or its size must be at least one");
        }
        this.id = id;
        this.name = name;
        this.description = description;
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
        IfcOrganization that = (IfcOrganization) o;
        return Objects.equals(id, that.id) && name.equals(that.name) &&
                Objects.equals(description, that.description) &&
                Objects.equals(roles, that.roles) &&
                Objects.equals(addresses, that.addresses);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, roles, addresses);
    }
}
