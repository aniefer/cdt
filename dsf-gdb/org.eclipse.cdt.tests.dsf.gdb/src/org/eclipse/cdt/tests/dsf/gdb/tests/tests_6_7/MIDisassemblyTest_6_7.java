/*******************************************************************************
 * Copyright (c) 2009 Ericsson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Ericsson - Initial Implementation
 *******************************************************************************/

package org.eclipse.cdt.tests.dsf.gdb.tests.tests_6_7;

import org.eclipse.cdt.dsf.gdb.IGDBLaunchConfigurationConstants;
import org.eclipse.cdt.tests.dsf.gdb.framework.BackgroundRunner;
import org.eclipse.cdt.tests.dsf.gdb.framework.BaseTestCase;
import org.eclipse.cdt.tests.dsf.gdb.tests.MIDisassemblyTest;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


@RunWith(BackgroundRunner.class)
public class MIDisassemblyTest_6_7 extends MIDisassemblyTest {
	@BeforeClass
    public static void beforeClassMethod_6_7() {
		BaseTestCase.setLaunchAttribute(IGDBLaunchConfigurationConstants.ATTR_DEBUG_NAME, "gdb.6.7");
		BaseTestCase.setLaunchAttribute(ATTR_DEBUG_SERVER_NAME, "gdbserver.6.7");
	}
}
