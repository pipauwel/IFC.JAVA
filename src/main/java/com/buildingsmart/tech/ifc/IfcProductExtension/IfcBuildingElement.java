// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

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
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcBeam;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcBuildingElementProxy;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcChimney;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcColumn;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcCovering;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcCurtainWall;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcDoor;
import com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcFooting;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcMember;
import com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcPile;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcPlate;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcRailing;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcRamp;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcRampFlight;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcRoof;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcShadingDevice;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcSlab;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcStair;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcStairFlight;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcWall;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcWindow;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement;

@Guid("a00e8863-dd67-4f4b-8e83-2c3ee0290740")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcBeam.class, name = "IfcBeam"), @JsonSubTypes.Type(value = IfcBuildingElementProxy.class, name = "IfcBuildingElementProxy"), @JsonSubTypes.Type(value = IfcChimney.class, name = "IfcChimney"), @JsonSubTypes.Type(value = IfcColumn.class, name = "IfcColumn"), @JsonSubTypes.Type(value = IfcCovering.class, name = "IfcCovering"), @JsonSubTypes.Type(value = IfcCurtainWall.class, name = "IfcCurtainWall"), @JsonSubTypes.Type(value = IfcDoor.class, name = "IfcDoor"), @JsonSubTypes.Type(value = IfcFooting.class, name = "IfcFooting"), @JsonSubTypes.Type(value = IfcMember.class, name = "IfcMember"), @JsonSubTypes.Type(value = IfcPile.class, name = "IfcPile"), @JsonSubTypes.Type(value = IfcPlate.class, name = "IfcPlate"), @JsonSubTypes.Type(value = IfcRailing.class, name = "IfcRailing"), @JsonSubTypes.Type(value = IfcRamp.class, name = "IfcRamp"), @JsonSubTypes.Type(value = IfcRampFlight.class, name = "IfcRampFlight"), @JsonSubTypes.Type(value = IfcRoof.class, name = "IfcRoof"), @JsonSubTypes.Type(value = IfcShadingDevice.class, name = "IfcShadingDevice"), @JsonSubTypes.Type(value = IfcSlab.class, name = "IfcSlab"), @JsonSubTypes.Type(value = IfcStair.class, name = "IfcStair"), @JsonSubTypes.Type(value = IfcStairFlight.class, name = "IfcStairFlight"), @JsonSubTypes.Type(value = IfcWall.class, name = "IfcWall"), @JsonSubTypes.Type(value = IfcWindow.class, name = "IfcWindow")})
public abstract class IfcBuildingElement extends IfcElement
{

	public IfcBuildingElement()
	{
	}

	public IfcBuildingElement(String globalId)
	{
		super(globalId);
	}


}

