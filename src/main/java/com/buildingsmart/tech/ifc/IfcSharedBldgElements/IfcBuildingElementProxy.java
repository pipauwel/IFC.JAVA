// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgElements;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("3e4aa4b8-2c66-482c-8c4a-6913d68fc480")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcBuildingElementProxy extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElement
{
	@Description("Predefined generic type for a building element proxy that is specified in an enumeration. There may be a property set given specificly for the predefined types.  <blockquote class=\"note\">NOTE&nbsp; The <em>PredefinedType</em> shall only be used, if no <em>IfcBuildingElementProxyType</em> is assigned, providing its own <em>IfcBuildingElementProxyType.PredefinedType</em>.</blockquote>  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute <em>CompositionType</em> has been replaced by <em>PredefinedType</em>, being a superset of the enumerators.</blockquote>")
	@DataMember(Order = 0)
	@Guid("49d8264c-da80-476c-97cc-c93b33d98240")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcBuildingElementProxyTypeEnum predefinedType;


	public IfcBuildingElementProxy()
	{
	}

	public IfcBuildingElementProxy(String globalId)
	{
		super(globalId);
	}

	public IfcBuildingElementProxyTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcBuildingElementProxyTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

