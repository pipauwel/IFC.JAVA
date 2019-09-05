// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("773e5eda-f463-41ec-a0f4-14681750a780")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcStructuralAction extends IfcStructuralActivity
{
	@JacksonXmlProperty(isAttribute=true, localName = "DestabilizingLoad")
	@Description("Indicates if this action may cause a stability problem. If it is 'FALSE', no further investigations regarding stability problems are necessary.")
	@Guid("7e7162c0-17e9-4165-9c29-294aefb1216b")
	private Boolean destabilizingLoad;


	public IfcStructuralAction()
	{
	}

	public IfcStructuralAction(String globalId, com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoad appliedLoad, com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcGlobalOrLocalEnum globalOrLocal)
	{
		super(globalId, appliedLoad, globalOrLocal);
	}

	public Boolean getDestabilizingLoad() {
		return this.destabilizingLoad;
	}

	public void setDestabilizingLoad(Boolean destabilizingLoad) {
		this.destabilizingLoad = destabilizingLoad;
	}


}

