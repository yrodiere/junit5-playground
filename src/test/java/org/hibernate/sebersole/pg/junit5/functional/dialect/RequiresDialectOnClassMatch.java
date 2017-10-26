/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * License: GNU Lesser General Public License (LGPL), version 2.1 or later
 * See the lgpl.txt file in the root directory or http://www.gnu.org/licenses/lgpl-2.1.html
 */
package org.hibernate.sebersole.pg.junit5.functional.dialect;

import org.hibernate.sebersole.pg.junit5.stubs.H2Dialect;
import org.hibernate.sebersole.pg.junit5.testing.RequiresDialect;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

/**
 * @author Steve Ebersole
 */
@SuppressWarnings({"WeakerAccess", "unused"})
@RequiresDialect( dialectClass = H2Dialect.class )
public class RequiresDialectOnClassMatch extends AbstractDialectFilteringTest {

	@BeforeAll
	public void beforeAll() {
		System.out.println( "RequiresDialectOnClassMatch##BeforeAll" );
	}

	@Test
	public void shouldExecute() {
		System.out.println( "Correctly executed test" );
	}
}
