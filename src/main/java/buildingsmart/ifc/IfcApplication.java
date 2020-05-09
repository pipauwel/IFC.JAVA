package buildingsmart.ifc;

import buildingsmart.util.Pair;
import com.sun.istack.internal.NotNull;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * IfcApplication holds the information about an IFC compliant application
 * developed by an application developer who is a member of the IAI. The
 * IfcApplication utilizes a short identifying name as provided by the
 * application developer.
 */
public class IfcApplication {
    private static final Set<Pair<IfcLabel, IfcLabel>>
            uniqueAppFullNameAndVersions = new HashSet<>();
    private static final Set<IfcIdentifier> uniqueAppIdentifiers =
            new HashSet<>();
    private final IfcOrganization applicationDeveloper;
    private final IfcLabel version;
    private final IfcLabel applicationFullName;
    private final IfcIdentifier applicationIdentifier;

    /**
     * @param applicationDeveloper  Name of the application developer, being
     *                              requested to be member of the IAI. Cannot
     *                              be null.
     * @param version               The version number of this software as
     *                              specified by the developer of the
     *                              application. Cannot be null.
     * @param applicationFullName   The full name of the application as
     *                              specified by the application developer.
     *                              Cannot be null.
     * @param applicationIdentifier Short identifying name for the
     *                              application. Cannot be null.
     * @throws IllegalArgumentException If any of the parameters is null, or
     *                                  if any instances of this class
     *                                  already exist where
     *                                  applicationIdentifier is the same as
     *                                  the one passed as parameter, or
     *                                  where the combination of fields
     *                                  applicationFullName and version is the
     *                                  same as the one passed as parameter.
     */
    public IfcApplication(@NotNull IfcOrganization applicationDeveloper,
                          @NotNull IfcLabel version,
                          @NotNull IfcLabel applicationFullName,
                          @NotNull IfcIdentifier applicationIdentifier) {
        if (applicationDeveloper == null || version == null ||
                applicationFullName == null || applicationIdentifier == null) {
            throw new IllegalArgumentException(
                    "parameters of this constructor cannot be null");
        }
        if (uniqueAppIdentifiers.contains(applicationIdentifier)) {
            throw new IllegalArgumentException(
                    "applicationIdentifier must be unique, and this one was " +
                            "already used in another instance of this class");
        }
        Pair<IfcLabel, IfcLabel> appFullNameAndVersion =
                new Pair<>(applicationFullName, version);
        if (uniqueAppFullNameAndVersions.contains(appFullNameAndVersion)) {
            throw new IllegalArgumentException(
                    "the combination of applicationFullName and version must " +
                            "be unique, and this one was already used in " +
                            "another instance of this class");
        }
        this.applicationDeveloper = applicationDeveloper;
        this.version = version;
        this.applicationFullName = applicationFullName;
        uniqueAppFullNameAndVersions.add(appFullNameAndVersion);
        this.applicationIdentifier = applicationIdentifier;
        uniqueAppIdentifiers.add(this.applicationIdentifier);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IfcApplication that = (IfcApplication) o;
        return applicationDeveloper.equals(that.applicationDeveloper) &&
                version.equals(that.version) &&
                applicationFullName.equals(that.applicationFullName) &&
                applicationIdentifier.equals(that.applicationIdentifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applicationDeveloper, version, applicationFullName,
                applicationIdentifier);
    }
}
