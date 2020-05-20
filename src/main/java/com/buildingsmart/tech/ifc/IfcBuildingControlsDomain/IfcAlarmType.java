// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcBuildingControlsDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("1bd3b05c-1d48-478a-9dcd-55c40bef9dd9")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcAlarmType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcDistributionControlElementType
{
	@Description("<p>Identifies the predefined types of alarm from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("84158364-2b94-468b-9895-afdf52b4be31")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcAlarmTypeEnum predefinedType;


	public IfcAlarmType()
	{
	}

	public IfcAlarmType(String globalId, IfcAlarmTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcAlarmTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcAlarmTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

