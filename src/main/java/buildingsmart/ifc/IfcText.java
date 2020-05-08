package buildingsmart.ifc;

import com.sun.istack.internal.NotNull;

import java.util.Objects;

/**
 * A text is an alphanumeric string of characters which is intended to be
 * read and understood by a human being. It is for information purposes only.
 */
public class IfcText implements IfcDefinedType {
    private final String ifcText;

    /**
     * @param ifcText Cannot be null.
     * @throws IllegalArgumentException if ifcText is null.
     */
    public IfcText(@NotNull final String ifcText) {
        if (ifcText == null) {
            throw new IllegalArgumentException("ifcText cannot be null");
        }
        this.ifcText = ifcText;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IfcText ifcText1 = (IfcText) o;
        return ifcText.equals(ifcText1.ifcText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ifcText);
    }

    @Override
    public String serialize() {
        return "'" + ifcText + "'";
    }
}
