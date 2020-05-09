package buildingsmart.ifc;

import com.sun.istack.internal.NotNull;

import java.util.Objects;

/**
 * IfcOwnerHistory defines all history and identification related information
 * . In order to provide fast access it is directly attached to all
 * independent objects, relationships and properties.
 */
public class IfcOwnerHistory extends IfcEntity {
    private final IfcPersonAndOrganization owningUser;
    private final IfcApplication owningApplication;
    private final IfcStateEnum state;
    private final IfcChangeActionEnum changeAction;
    private final IfcTimeStamp lastModifiedDate;
    private final IfcPersonAndOrganization lastModifyingUser;
    private final IfcApplication lastModifyingApplication;
    private final IfcTimeStamp creationDate;

    /**
     * @param owningUser               Direct reference to the end user who
     *                                 currently "owns" this object. Note
     *                                 that IFC includes the concept of
     *                                 ownership transfer from one user to
     *                                 another and therefore distinguishes
     *                                 between the Owning User and Creating
     *                                 User.
     * @param owningApplication        Direct reference to the application
     *                                 which currently "Owns" this object on
     *                                 behalf of the owning user, who uses
     *                                 this application. Note that IFC
     *                                 includes the concept of ownership
     *                                 transfer from one app to another and
     *                                 therefore distinguishes between the
     *                                 Owning Application and Creating
     *                                 Application.
     * @param state                    Enumeration that defines the current
     *                                 access state of the object.
     * @param changeAction             Enumeration that defines the actions
     *                                 associated with changes made to the
     *                                 object.
     * @param lastModifiedDate         Date and Time at which the last
     *                                 modification occurred.
     * @param lastModifyingUser        User who carried out the last
     *                                 modification.
     * @param lastModifyingApplication Application used to carry out the last
     *                                 modification.
     * @param creationDate             Time and date of creation.
     * @throws IllegalArgumentException If owningUser, owningApplication,
     *                                  changeAction or creationDate are null.
     */
    public IfcOwnerHistory(@NotNull IfcPersonAndOrganization owningUser,
                           @NotNull IfcApplication owningApplication,
                           IfcStateEnum state,
                           @NotNull IfcChangeActionEnum changeAction,
                           IfcTimeStamp lastModifiedDate,
                           IfcPersonAndOrganization lastModifyingUser,
                           IfcApplication lastModifyingApplication,
                           @NotNull IfcTimeStamp creationDate) {
        if (owningUser == null) {
            throw new IllegalArgumentException("owningUser cannot be null");
        }
        if (owningApplication == null) {
            throw new IllegalArgumentException(
                    "owningApplication cannot be null");
        }
        if (changeAction == null) {
            throw new IllegalArgumentException("changeAction cannot be null");
        }
        if (creationDate == null) {
            throw new IllegalArgumentException("creationDate cannot be null");
        }
        this.owningUser = owningUser;
        this.owningApplication = owningApplication;
        this.state = state;
        this.changeAction = changeAction;
        this.lastModifiedDate = lastModifiedDate;
        this.lastModifyingUser = lastModifyingUser;
        this.lastModifyingApplication = lastModifyingApplication;
        this.creationDate = creationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IfcOwnerHistory that = (IfcOwnerHistory) o;
        return owningUser.equals(that.owningUser) &&
                owningApplication.equals(that.owningApplication) &&
                state == that.state && changeAction == that.changeAction &&
                Objects.equals(lastModifiedDate, that.lastModifiedDate) &&
                Objects.equals(lastModifyingUser, that.lastModifyingUser) &&
                Objects.equals(lastModifyingApplication,
                        that.lastModifyingApplication) &&
                creationDate.equals(that.creationDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owningUser, owningApplication, state, changeAction,
                lastModifiedDate, lastModifyingUser, lastModifyingApplication,
                creationDate);
    }
}
