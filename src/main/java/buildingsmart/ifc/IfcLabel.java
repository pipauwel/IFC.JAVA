package buildingsmart.ifc;

import com.sun.istack.internal.NotNull;

import java.util.Objects;

/**
 * A label is the term by which something may be referred to. It is a string
 * which represents the human-interpretable name of something and shall have
 * a natural-language meaning.
 */
public class IfcLabel implements IfcDefinedType {
    private final String ifcLabel;

    /**
     * @param ifcLabel Restricted to max. 255 characters, cannot be null.
     * @throws IllegalArgumentException If ifcLabel is null or longer than 255
     *                                  characters.
     */
    public IfcLabel(@NotNull String ifcLabel) {
        if (ifcLabel == null) {
            throw new IllegalArgumentException("ifcLabel cannot be null");
        }
        if (ifcLabel.length() > 255) {
            throw new IllegalArgumentException(
                    "ifcLabel cannot be longer " + "than 255 characters");
        }
        this.ifcLabel = ifcLabel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IfcLabel that = (IfcLabel) o;
        return ifcLabel.equals(that.ifcLabel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ifcLabel);
    }

    @Override
    public String serialize() {
        return "'" + ifcLabel + "'";
    }
}
