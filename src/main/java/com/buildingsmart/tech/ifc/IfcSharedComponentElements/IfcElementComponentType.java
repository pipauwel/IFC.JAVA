// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedComponentElements;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcHvacDomain.IfcVibrationIsolatorType;
import com.buildingsmart.tech.ifc.IfcStructuralElementsDomain.IfcReinforcingElementType;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@Guid("7904437f-39fd-4ac3-a04b-cd4158e276b3")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcBuildingElementPartType.class, name = "IfcBuildingElementPartType"), @JsonSubTypes.Type(value = IfcDiscreteAccessoryType.class, name = "IfcDiscreteAccessoryType"), @JsonSubTypes.Type(value = IfcFastenerType.class, name = "IfcFastenerType"), @JsonSubTypes.Type(value = IfcMechanicalFastenerType.class, name = "IfcMechanicalFastenerType"), @JsonSubTypes.Type(value = IfcReinforcingElementType.class, name = "IfcReinforcingElementType"), @JsonSubTypes.Type(value = IfcVibrationIsolatorType.class, name = "IfcVibrationIsolatorType")})
public abstract class IfcElementComponentType extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcElementType
{

	public IfcElementComponentType()
	{
	}

	public IfcElementComponentType(String globalId)
	{
		super(globalId);
	}


}

