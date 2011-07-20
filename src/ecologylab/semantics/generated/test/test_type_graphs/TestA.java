package ecologylab.semantics.generated.test.test_type_graphs;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.serialization.simpl_inherit;
import java.util.List;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.generated.test.test_type_graphs.TestSub;
import ecologylab.semantics.metadata.Metadata;

/**
*  TestA.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/19/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class TestA extends Metadata
{
	/** 
	 */ 
	@simpl_composite @mm_name("ref_to_test_sub")	private TestSub refToTestSub;

	public TestA()
	{ }

	public TestA(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public TestSub getRefToTestSub()
	{
		return refToTestSub;
	}

	public void setRefToTestSub(TestSub refToTestSub)
	{
		this.refToTestSub = refToTestSub;
	}
}
