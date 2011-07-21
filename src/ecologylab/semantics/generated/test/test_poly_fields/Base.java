package ecologylab.semantics.generated.test.test_poly_fields;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.semantics.generated.test.test_poly_fields.Item;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.generated.test.test_poly_fields.MmdInlineMyItemInSub;
import ecologylab.semantics.generated.test.test_poly_fields.MmdInlineYourItemInSubSub;

/**
*  Base.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/20/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Base extends Metadata
{
	/** 
	 * the first item of this collection.
	 */ 
	@simpl_composite	@simpl_classes({Item.class, MmdInlineYourItemInSubSub.class, MmdInlineMyItemInSub.class}) @mm_name("first_item")	private Item firstItem;

	/** 
	 * the collection of items.
	 */ 
	@simpl_collection	@simpl_classes({Item.class, MmdInlineYourItemInSubSub.class, MmdInlineMyItemInSub.class}) @mm_name("items")	private List<Item> items;

	public Base()
	{ }

	public Base(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public Item getFirstItem()
	{
		return firstItem;
	}

	public void setFirstItem(Item firstItem)
	{
		this.firstItem = firstItem;
	}

	public List<Item> getItems()
	{
		return items;
	}

	public void setItems(List<Item> items)
	{
		this.items = items;
	}
}
