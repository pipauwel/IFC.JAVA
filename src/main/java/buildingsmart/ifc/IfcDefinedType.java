package buildingsmart.ifc;

/**
 * One of the types defined in the IFC specification, which can be serialized
 * without referencing other objects because types are primitives that cannot
 * contain IFC entities.
 * This interface is not part of the IFC specification, its only purpose is to
 * distinguish IFC defined types and enumerations from IFC entities.
 */
public interface IfcDefinedType {
    /**
     * @return The representation of the type in an IFC STEP file.
     */
    String serialize();
}
