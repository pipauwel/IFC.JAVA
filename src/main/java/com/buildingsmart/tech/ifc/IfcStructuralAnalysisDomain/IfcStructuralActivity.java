// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcGlobalOrLocalEnum;
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoad;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("367339a3-2c53-452e-880f-d16b0575c0c3")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcStructuralAction.class, name = "IfcStructuralAction"), @JsonSubTypes.Type(value = IfcStructuralReaction.class, name = "IfcStructuralReaction")})
public abstract class IfcStructuralActivity extends com.buildingsmart.tech.ifc.IfcKernel.IfcProduct
{
	@Description("Load or result resource object which defines the load type, direction, and load values.    <p>In case of activities which are variably distributed over curves or surfaces, <em>IfcStructuralLoadConfiguration</em> is used which provides a list of load samples and their locations within the load distribution, measured in local coordinates of the curve or surface on which this activity acts.  The contents of this load or result distribution may be further restricted by definitions at subtypes of <em>IfcStructuralActivity</em>.</p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("8a68177b-4c60-4eb6-8903-ae9366cb2ac7")
	@JacksonXmlProperty(isAttribute=false, localName = "appliedLoad")
	private IfcStructuralLoad appliedLoad;

	@Description("Indicates whether the load directions refer to the global coordinate system (global to  the analysis model, i.e. as established by <em>IfcStructuralAnalysisModel.SharedPlacement</em>)  or to the local coordinate system (local to the activity or connected item, as established by  an explicit or implied representation and its parameter space).    <blockquote class=\"note\">NOTE, the informal definition of  <em>IfcRepresentationResource.IfcGlobalOrLocalEnum</em> doe s not distinguish between  &quot;global coordinate system&quot; and &quot;world coordinate system&quot;.  On the other hand, this distinction is necessary in the <em>IfcStructuralAnalysisDomain</em>  where the shared &quot;global&quot; coordinate system of an analysis model may very well  not be the same as the project-wide world coordinate system.</blockquote>    <blockquote class=\"note\">NOTE&nbsp; In the scope of <em>IfcStructuralActivity.GlobalOrLocal</em>,  the meaning of GLOBAL_COORDS is therefore not to be taken as world coordinate system  but as the analysis model specific shared coordinate system.  In contrast, LOCAL_COORDS  is to be taken as coordinates which are local to individual structural items and activities,  as established by subclass-specific geometry use definitions.</blockquote>")
	@DataMember(Order = 1)
	@Required()
	@Guid("830a06f0-c7f3-4922-adc8-1ae743e63028")
	@JacksonXmlProperty(isAttribute=true, localName = "globalOrLocal")
	private IfcGlobalOrLocalEnum globalOrLocal;

	@Description("Reference to the <em>IfcRelConnectsStructuralActivity</em> relationship by which activities are connected with structural items.")
	@InverseProperty(InverseProp = "relatedStructuralActivity", Range = "IfcRelConnectsStructuralActivity")
	@Guid("972e6dd1-44d3-4eae-8b18-92babea8b77f")
	@MaxLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelConnectsStructuralActivity")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "assignedToStructuralItem")
	private Set<IfcRelConnectsStructuralActivity> assignedToStructuralItem;


	public IfcStructuralActivity()
	{
	}

	public IfcStructuralActivity(String globalId, IfcStructuralLoad appliedLoad, IfcGlobalOrLocalEnum globalOrLocal)
	{
		super(globalId);
		this.appliedLoad = appliedLoad;
		this.globalOrLocal = globalOrLocal;
	}

	public IfcStructuralLoad getAppliedLoad() {
		return this.appliedLoad;
	}

	public void setAppliedLoad(IfcStructuralLoad appliedLoad) {
		this.appliedLoad = appliedLoad;
	}

	public IfcGlobalOrLocalEnum getGlobalOrLocal() {
		return this.globalOrLocal;
	}

	public void setGlobalOrLocal(IfcGlobalOrLocalEnum globalOrLocal) {
		this.globalOrLocal = globalOrLocal;
	}

	public Set<IfcRelConnectsStructuralActivity> getAssignedToStructuralItem() {
		return this.assignedToStructuralItem;
	}


}

