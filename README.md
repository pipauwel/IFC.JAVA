# IFC.JAVA
JAVA class library for IFC2x3 serialization into STEP files.  
The library is not complete, classes were generated automatically and I fixed only the ones I needed.
 
Some notes on the implementation:
+ interface IfcDefinedType is not part of the IFC specification, its only purpose is to be implemented by types which can be serialized directly, unlike IFC entities (which reference other entities or types);
+ attributes part of inverse relationships are ignored (commented) at the moment because they're not needed for the serialization of entities.