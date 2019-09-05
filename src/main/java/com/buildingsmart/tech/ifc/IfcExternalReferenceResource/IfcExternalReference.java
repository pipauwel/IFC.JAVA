// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcExternalReferenceResource;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("89de2ef7-7bc1-4682-ac3b-f058ab404fad")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcExternalReference implements com.buildingsmart.tech.ifc.IfcPresentationOrganizationResource.IfcLightDistributionDataSourceSelect, com.buildingsmart.tech.ifc.IfcPropertyResource.IfcObjectReferenceSelect, IfcResourceObjectSelect
{
	@JacksonXmlProperty(isAttribute=true, localName = "Location")
	@Description("Location, where the external source (classification, document or library) can be accessed by electronic means. The electronic location is provided as an URI, and would normally be given as an URL location string.  <blockquote class=\"change-ifc2x4\">  IFC4 CHANGE&nbsp; The data type has been changed from <em>IfcLabel</em> to <em>IfcURIReference</em><br>.  </blockquote>")
	@Guid("d4dad48f-1dac-4cbb-99d0-7819c93da6c2")
	private String location;

	@JacksonXmlProperty(isAttribute=true, localName = "Identification")
	@Description("The <em>Identification</em> provides a unique identifier of the referenced item within the external source (classification, document or library). It may be provided as   <ul>   <li>a key, e.g. a classification notation, like NF2.3</li>   <li>a handle</li>   <li>a uuid or guid</li>  </ul>  It may be human readable (such as a key) or not (such as a handle or uuid) depending on the context of its usage (which has to be determined by local agreement).  <blockquote class=\"change-ifc2x4\">  IFC4 CHANGE  Attribute renamed from <em>ItemReference</em> for consistency.<br>  </blockquote>")
	@Guid("09ae4612-f2b3-4ae7-af75-4b0061f86545")
	private String identification;

	@JacksonXmlProperty(isAttribute=true, localName = "Name")
	@Description("Optional name to further specify the reference. It can provide a human readable identifier (which does not necessarily need to have a counterpart in the internal structure of the document).")
	@Guid("7a104ce3-e53d-4544-bffa-c17f3be9adc3")
	private String name;

	@Description("Reference to all associations between this external reference and objects within the <em>IfcResourceObjectSelect</em> that are tagged by the external reference.   <blockquote class=\"change-ifc2x4\">   IFC4 CHANGE&nbsp; New inverse attribute added with upward compatibility.<br>  </blockquote>")
	@Guid("52adb1da-05bd-4f8b-bd47-3c140643a153")
	private Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship> externalReferenceForResources = new HashSet<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship>();


	public IfcExternalReference()
	{
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getIdentification() {
		return this.identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcExternalReferenceRelationship> getExternalReferenceForResources() {
		return this.externalReferenceForResources;
	}


}

