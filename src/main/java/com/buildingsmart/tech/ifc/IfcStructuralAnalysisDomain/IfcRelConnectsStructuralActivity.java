// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("d755201f-41e5-41f3-b37c-30c473853a22")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelConnectsStructuralActivity extends com.buildingsmart.tech.ifc.IfcKernel.IfcRelConnects
{
	@Description("Reference to a structural item or element to which the specified activity is applied.")
	@DataMember(Order = 0)
	@Required()
	@Guid("def88b3b-057c-43be-859a-a0378d8c4e28")
	@JacksonXmlProperty(isAttribute=true, localName = "relatingElement")
	private IfcStructuralActivityAssignmentSelect relatingElement;

	@Description("Reference to a structural activity which is acting upon the specified structural item or element.")
	@DataMember(Order = 1)
	@Required()
	@Guid("8ad8521d-349a-4499-a2b6-796fbf1378f4")
	@JacksonXmlProperty(isAttribute=false, localName = "relatedStructuralActivity")
	private IfcStructuralActivity relatedStructuralActivity;


	public IfcRelConnectsStructuralActivity()
	{
	}

	public IfcRelConnectsStructuralActivity(String globalId, IfcStructuralActivityAssignmentSelect relatingElement, IfcStructuralActivity relatedStructuralActivity)
	{
		super(globalId);
		this.relatingElement = relatingElement;
		this.relatedStructuralActivity = relatedStructuralActivity;
	}

	public IfcStructuralActivityAssignmentSelect getRelatingElement() {
		return this.relatingElement;
	}

	public void setRelatingElement(IfcStructuralActivityAssignmentSelect relatingElement) {
		this.relatingElement = relatingElement;
	}

	public IfcStructuralActivity getRelatedStructuralActivity() {
		return this.relatedStructuralActivity;
	}

	public void setRelatedStructuralActivity(IfcStructuralActivity relatedStructuralActivity) {
		this.relatedStructuralActivity = relatedStructuralActivity;
	}


}

