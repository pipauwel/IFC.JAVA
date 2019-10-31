# IFC.JAVA

## What?
This repository contains all IFC entities in the form of a Java class library. It contains all the classes provided in the IFC EXPRESS schema, but in a JAVA syntax. Hence, these IFC classes can be used directly for working with IFC data in JAVA.

The code allows serialising and deserialising IFC objects to XML and JSON. IFC-SPF (STEP) is not supported.

## Why?
IFC is a common data model in the AEC industry. Many starting developers and PhD students consider using IFC to obtain data. Yet, parsing IFC STEP files (.ifc) is cumbersome and difficult. With this library, XML and JSON versions of IFC data can be randomly read, used, and generated, thus easing the work for developers looking at IFC. These XML and JSON files are ideally equally interoperable with class libraries in C# and Python, although that work still needs to be done. 

## How?
The project is developed using maven, and the resulting artefact is meant to be published in the open maven repository (https://mvnrepository.com/) to allow re-use in other code.

This work is in progress. Code is likely unstable and not entirely user-friendely. The code currently only contains the classes specified in IFC4 Addendum 2 (https://standards.buildingsmart.org/IFC/RELEASE/IFC4/ADD2/HTML/).

Serialisation and deserialisation is done using the Jackson package; and it is therefore out of the box. This code can be seen in the IO/IfcParser.java class. 


