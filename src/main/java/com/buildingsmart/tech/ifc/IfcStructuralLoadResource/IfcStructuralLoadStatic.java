// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

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
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoadLinearForce;
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoadPlanarForce;
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoadSingleDisplacement;
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoadSingleForce;
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoadTemperature;
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoadOrResult;

@Guid("e21bb052-877a-4087-b7fe-777b1b835f72")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcStructuralLoadLinearForce.class, name = "IfcStructuralLoadLinearForce"), @JsonSubTypes.Type(value = IfcStructuralLoadPlanarForce.class, name = "IfcStructuralLoadPlanarForce"), @JsonSubTypes.Type(value = IfcStructuralLoadSingleDisplacement.class, name = "IfcStructuralLoadSingleDisplacement"), @JsonSubTypes.Type(value = IfcStructuralLoadSingleForce.class, name = "IfcStructuralLoadSingleForce"), @JsonSubTypes.Type(value = IfcStructuralLoadTemperature.class, name = "IfcStructuralLoadTemperature")})
public abstract class IfcStructuralLoadStatic extends IfcStructuralLoadOrResult
{

	public IfcStructuralLoadStatic()
	{
	}


}

