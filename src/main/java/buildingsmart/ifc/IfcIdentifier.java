package buildingsmart.ifc;

import com.sun.istack.internal.NotNull;

import java.util.Objects;

/**
 * An identifier is an alphanumeric string which allows an individual
 * thing to be identified. It may not provide natural-language meaning.
 */
public class IfcIdentifier implements IfcDefinedType {
    private final String ifcIdentifier;

    /**
     * @param ifcIdentifier Restricted to max. 255 characters, cannot be null.
     * @throws IllegalArgumentException If ifcIdentifier is null or longer
     *                                  than 255 characters.
     */
    public IfcIdentifier(@NotNull String ifcIdentifier) {
        if (ifcIdentifier == null) {
            throw new IllegalArgumentException("ifcIdentifier cannot be null");
        }
        if (ifcIdentifier.length() > 255) {
            throw new IllegalArgumentException(
                    "ifcIdentifier cannot be " + "longer than 255 characters");
        }
        this.ifcIdentifier = ifcIdentifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IfcIdentifier that = (IfcIdentifier) o;
        return ifcIdentifier.equals(that.ifcIdentifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ifcIdentifier);
    }

    @Override
    public String serialize() {
        return "'" + ifcIdentifier + "'";
    }
}
