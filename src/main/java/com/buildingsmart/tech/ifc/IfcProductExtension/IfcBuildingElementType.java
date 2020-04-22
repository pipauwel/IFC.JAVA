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
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcBeamType;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcBuildingElementProxyType;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcChimneyType;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcColumnType;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcCoveringType;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcCurtainWallType;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcDoorType;
import com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcFootingType;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcMemberType;
import com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcPileType;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcPlateType;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcRailingType;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcRampFlightType;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcRampType;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcRoofType;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcShadingDeviceType;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcSlabType;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcStairFlightType;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcStairType;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcWallType;
import com.buildingsmart.tech.ifc.IfcSharedBldgElements.IfcWindowType;
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcElementType;

@Guid("240944f4-46be-4656-ab86-736f96b1dc40")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcBeamType.class, name = "IfcBeamType"), @JsonSubTypes.Type(value = IfcBuildingElementProxyType.class, name = "IfcBuildingElementProxyType"), @JsonSubTypes.Type(value = IfcChimneyType.class, name = "IfcChimneyType"), @JsonSubTypes.Type(value = IfcColumnType.class, name = "IfcColumnType"), @JsonSubTypes.Type(value = IfcCoveringType.class, name = "IfcCoveringType"), @JsonSubTypes.Type(value = IfcCurtainWallType.class, name = "IfcCurtainWallType"), @JsonSubTypes.Type(value = IfcDoorType.class, name = "IfcDoorType"), @JsonSubTypes.Type(value = IfcFootingType.class, name = "IfcFootingType"), @JsonSubTypes.Type(value = IfcMemberType.class, name = "IfcMemberType"), @JsonSubTypes.Type(value = IfcPileType.class, name = "IfcPileType"), @JsonSubTypes.Type(value = IfcPlateType.class, name = "IfcPlateType"), @JsonSubTypes.Type(value = IfcRailingType.class, name = "IfcRailingType"), @JsonSubTypes.Type(value = IfcRampFlightType.class, name = "IfcRampFlightType"), @JsonSubTypes.Type(value = IfcRampType.class, name = "IfcRampType"), @JsonSubTypes.Type(value = IfcRoofType.class, name = "IfcRoofType"), @JsonSubTypes.Type(value = IfcShadingDeviceType.class, name = "IfcShadingDeviceType"), @JsonSubTypes.Type(value = IfcSlabType.class, name = "IfcSlabType"), @JsonSubTypes.Type(value = IfcStairFlightType.class, name = "IfcStairFlightType"), @JsonSubTypes.Type(value = IfcStairType.class, name = "IfcStairType"), @JsonSubTypes.Type(value = IfcWallType.class, name = "IfcWallType"), @JsonSubTypes.Type(value = IfcWindowType.class, name = "IfcWindowType")})
public abstract class IfcBuildingElementType extends IfcElementType
{

	public IfcBuildingElementType()
	{
	}

	public IfcBuildingElementType(String globalId)
	{
		super(globalId);
	}


}

