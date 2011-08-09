package ecologylab.semantics.generated.test.test_yahoo_geo_code;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.serialization.simpl_inherit;
import java.util.List;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.Metadata;

/**
*  Item.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/08/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Item extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataInteger id;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString name;

	public Item()
	{ }

	public Item(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataInteger	id()
	{
		ecologylab.semantics.metadata.scalar.MetadataInteger	result = this.id;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataInteger();
			this.id = result;
		}
		return result;
	}

	public java.lang.Integer getId()
	{
		return this.id == null ? 0 : id().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataInteger getIdMetadata()
	{
		return id;
	}

	public void setId(java.lang.Integer id)
	{
		if (id != 0)
			this.id().setValue(id);
	}

	public void setIdMetadata(ecologylab.semantics.metadata.scalar.MetadataInteger id)
	{
		this.id = id;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	name()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.name;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.name = result;
		}
		return result;
	}

	public java.lang.String getName()
	{
		return this.name == null ? null : name().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getNameMetadata()
	{
		return name;
	}

	public void setName(java.lang.String name)
	{
		if (name != null)
			this.name().setValue(name);
	}

	public void setNameMetadata(ecologylab.semantics.metadata.scalar.MetadataString name)
	{
		this.name = name;
	}
}
