package ecologylab.semantics.generated.test.test_yahoo_geo_code;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.serialization.simpl_inherit;
import ecologylab.semantics.generated.test.test_yahoo_geo_code.Item;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  BaseSet.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/08/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class BaseSet extends Metadata
{
	/** 
	 */ 
	@simpl_collection("item") @mm_name("items")	private List<Item> items;

	/** 
	 */ 
	@simpl_composite	@xml_tag("Item") @mm_name("the_item")	private Item theItem;

	public BaseSet()
	{ }

	public BaseSet(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Item> getItems()
	{
		return items;
	}

	public void setItems(List<Item> items)
	{
		this.items = items;
	}

	public Item getTheItem()
	{
		return theItem;
	}

	public void setTheItem(Item theItem)
	{
		this.theItem = theItem;
	}
}