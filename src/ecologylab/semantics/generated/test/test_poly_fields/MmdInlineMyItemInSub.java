package ecologylab.semantics.generated.test.test_poly_fields;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.serialization.simpl_inherit;
import ecologylab.semantics.generated.test.test_poly_fields.Item;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  MmdInlineMyItemInSub.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/20/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
@xml_other_tags({"my_item"})
public class MmdInlineMyItemInSub extends Item
{
	/** 
	 * the name of this item.
	 */ 
	@simpl_scalar	private MetadataString name;

	public MmdInlineMyItemInSub()
	{ }

	public MmdInlineMyItemInSub(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	name()
	{
		MetadataString	result = this.name;
		if (result == null)
		{
			result = new MetadataString();
			this.name = result;
		}
		return result;
	}

	public String getName()
	{
		return this.name().getValue();
	}

	public MetadataString getNameMetadata()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name().setValue(name);
	}

	public void setNameMetadata(MetadataString name)
	{
		this.name = name;
	}
}
