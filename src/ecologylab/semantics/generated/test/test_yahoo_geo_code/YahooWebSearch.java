package ecologylab.semantics.generated.test.test_yahoo_geo_code;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.semantics.generated.test.test_yahoo_geo_code.YahooResultSet;
import ecologylab.serialization.simpl_inherit;
import java.util.List;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  YahooWebSearch.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/29/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
@xml_tag("ResultSet")
public class YahooWebSearch extends YahooResultSet
{
	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString query;

	public YahooWebSearch()
	{ }

	public YahooWebSearch(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataString	query()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.query;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.query = result;
		}
		return result;
	}

	public java.lang.String getQuery()
	{
		return this.query == null ? null : query().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getQueryMetadata()
	{
		return query;
	}

	public void setQuery(java.lang.String query)
	{
		if (query != null)
			this.query().setValue(query);
	}

	public void setQueryMetadata(ecologylab.semantics.metadata.scalar.MetadataString query)
	{
		this.query = query;
	}
}
