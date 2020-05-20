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

@Guid("b22a442d-98eb-4579-80cf-dc1054cbb509")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRampFlight extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElement
{
	@Description("Predefined generic type for a ramp flight that is specified in an enumeration. There may be a property set given specificly for the predefined types.  <blockquote class=\"note\">NOTE&nbsp; The <em>PredefinedType</em> shall only be used, if no <em>IfcRampFlightType</em> is assigned, providing its own <em>IfcRampFlightType.PredefinedType</em>.</blockquote>  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been added at the end of the entity definition.</blockquote>")
	@DataMember(Order = 0)
	@Guid("14de555e-b478-4d05-91bc-19cad9fa65f2")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcRampFlightTypeEnum predefinedType;


	public IfcRampFlight()
	{
	}

	public IfcRampFlight(String globalId)
	{
		super(globalId);
	}

	public IfcRampFlightTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcRampFlightTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

