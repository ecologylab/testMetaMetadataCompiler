package ecologylab.semantics.generated.test.test_type_graphs;

import ecologylab.serialization.ElementState.xml_other_tags;
import java.util.ArrayList;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.generated.test.test_type_graphs.TestBase;
import ecologylab.semantics.metadata.Metadata;

/**
*  TestBase.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/13/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class TestBase extends Metadata
{
	/** 
	 * whatever scalar here ...
	 */ 
	@simpl_scalar	private MetadataString aScalar;

	/** 
	 */ 
	@simpl_composite @mm_name("nested_base")	private TestBase nestedBase;

	/** 
	 */ 
	@simpl_collection("a_nested_base") @mm_name("nested_bases")	private ArrayList<TestBase> nestedBases;

	public TestBase()
	{ }

	public TestBase(MetaMetadataCompositeField mmd) {
		super(mmd);
	}

	public MetadataString	aScalar()
	{
		MetadataString	result = this.aScalar;
		if (result == null)
		{
			result = new MetadataString();
			this.aScalar = result;
		}
		return result;
	}

	public String getAScalar()
	{
		return this.aScalar().getValue();
	}

	public void setAScalar(String aScalar)
	{
		this.aScalar().setValue(aScalar);
	}


	public TestBase getNestedBase()
	{
		return nestedBase;
	}

	public void setNestedBase(TestBase nestedBase)
	{
		this.nestedBase = nestedBase;
	}

	public ArrayList<TestBase> getNestedBases()
	{
		return nestedBases;
	}

	public void setNestedBases(ArrayList<TestBase> nestedBases)
	{
		this.nestedBases = nestedBases;
	}
}
