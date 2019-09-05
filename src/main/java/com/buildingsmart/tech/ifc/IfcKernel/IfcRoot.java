// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("f8efd3b8-d3ea-429a-95d6-d19264324999")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcRoot
{
	@JacksonXmlProperty(isAttribute=true, localName = "GlobalId")
	@Description("Assignment of a globally unique identifier within the entire software world.")
	@Required()
	@Guid("2ef91ad0-a87b-4049-910a-d9c2aea67739")
	private String globalId;

	@JacksonXmlProperty(isAttribute=false, localName = "OwnerHistory")
	@Description("Assignment of the information about the current ownership of that object, including owning actor, application, local identification and information captured about the recent changes of the object,     <blockquote class=\"note\">NOTE&nbsp; only the last modification in stored - either as addition, deletion or modification.</blockquote>  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; The attribute has been changed to be OPTIONAL.</blockquote>")
	@Guid("3f6c9112-a79d-49a2-a983-4fd08a4cedc3")
	private com.buildingsmart.tech.ifc.IfcUtilityResource.IfcOwnerHistory ownerHistory;

	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Description("Optional name for use by the participating software systems or users. For some subtypes of IfcRoot the insertion of the Name attribute may be required. This would be enforced by a where rule.")
	@Guid("03435dd4-ced4-460f-9203-e318d330c219")
	private String name;

	@JacksonXmlProperty(isAttribute=true, localName = "Description")
	@Description("Optional description, provided for exchanging informative comments.")
	@Guid("ae1c2069-cba7-4c56-b652-2ce207a2345f")
	private String description;


	public IfcRoot()
	{
	}

	public IfcRoot(String globalId)
	{
		this.globalId = globalId;
	}

	public String getGlobalId() {
		return this.globalId;
	}

	public void setGlobalId(String globalId) {
		this.globalId = globalId;
	}

	public com.buildingsmart.tech.ifc.IfcUtilityResource.IfcOwnerHistory getOwnerHistory() {
		return this.ownerHistory;
	}

	public void setOwnerHistory(com.buildingsmart.tech.ifc.IfcUtilityResource.IfcOwnerHistory ownerHistory) {
		this.ownerHistory = ownerHistory;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


}

