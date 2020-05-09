package buildingsmart.ifc;

/**
 * One of the entities defined in the IFC specification.
 * This interface is not part of the IFC specification, its only purpose is to
 * distinguish IFC entities from IFC defined types and enumerations.
 */
abstract class IfcEntity {
    @Override
    public abstract boolean equals(Object o);

    @Override
    public abstract int hashCode();
}
