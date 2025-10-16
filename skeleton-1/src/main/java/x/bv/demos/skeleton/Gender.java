package x.bv.demos.skeleton;

import org.babyfish.jimmer.sql.EnumItem;
import org.babyfish.jimmer.sql.EnumType;

@EnumType(EnumType.Strategy.ORDINAL)
public enum Gender {

	@EnumItem(ordinal = 100)
	MALE,

	@EnumItem(ordinal = 200)
	FEMALE
}
