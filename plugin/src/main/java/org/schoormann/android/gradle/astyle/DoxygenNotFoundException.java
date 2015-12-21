package org.schoormann.android.gradle.astyle;

import org.gradle.api.GradleException;

public class DoxygenNotFoundException extends GradleException {

	private static final String ERROR_MSG;

	static {
		ERROR_MSG = "Doxygen not found in path.";
	}

	public DoxygenNotFoundException() {
		super(ERROR_MSG);
	}

}