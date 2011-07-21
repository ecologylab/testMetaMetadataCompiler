package ecologylab.semantics.generated.test.test_poly_fields;

import ecologylab.serialization.ElementState.xml_other_tags;
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
*  Generated by JavaTranslator on 07/21/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
	 * the base item class.
 */ 
@simpl_inherit
@xml_other_tags({"first_item"})
public class Item extends Metadata
{
	/** 
	 * the ID of this item.
	 */ 
	@simpl_scalar	private MetadataInteger id;

	public Item()
	{ }

	public Item(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataInteger	id()
	{
		MetadataInteger	result = this.id;
		if (result == null)
		{
			result = new MetadataInteger();
			this.id = result;
		}
		return result;
	}

	public int getId()
	{
		return this.id == null ? 0 : id().getValue();
	}

	public MetadataInteger getIdMetadata()
	{
		return id;
	}

	public void setId(int id)
	{
		if (id != 0)
			this.id().setValue(id);
	}

	public void setIdMetadata(MetadataInteger id)
	{
		this.id = id;
	}
}
