# IFC.JAVA
Java class library for IFC2x3 serialization into STEP files.  
The library is not complete, classes were generated automatically and are mostly broken, I fixed only the ones I needed to use.
 
Some notes on the implementation:
+ interface `IfcDefinedType` is not part of the IFC specification, its only purpose is to be implemented by types which can be serialized directly, unlike IFC entities (their attributes reference other entities or contain types);
+ abstract class `IfcEntity` is not part of the IFC specification, its only purpose is to be extended by Ifc entities, which cannot be serialized directly;
+ attributes which are part of inverse relationships are ignored (commented) at the moment because they're not needed for the serialization of entities.