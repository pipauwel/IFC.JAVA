// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricModelResource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcCsgSolid;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcManifoldSolidBrep;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcSweptAreaSolid;
import com.buildingsmart.tech.ifc.IfcGeometricModelResource.IfcSweptDiskSolid;
import com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem;

@Guid("6a71ad06-e92c-4e8d-bb08-441d03da182e")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcCsgSolid.class, name = "IfcCsgSolid"), @JsonSubTypes.Type(value = IfcManifoldSolidBrep.class, name = "IfcManifoldSolidBrep"), @JsonSubTypes.Type(value = IfcSweptAreaSolid.class, name = "IfcSweptAreaSolid"), @JsonSubTypes.Type(value = IfcSweptDiskSolid.class, name = "IfcSweptDiskSolid")})
public abstract class IfcSolidModel extends com.buildingsmart.tech.ifc.IfcGeometryResource.IfcGeometricRepresentationItem implements IfcBooleanOperand, com.buildingsmart.tech.ifc.IfcGeometricConstraintResource.IfcSolidOrShell
{

	public IfcSolidModel()
	{
	}

	public int getDim() {
		return 0;
	}


}

