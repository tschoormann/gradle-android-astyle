package org.schoormann.android.gradle.astyle;

public class AStylePluginExtension {

	private boolean mOverwriteOriginal;

	public AStylePluginExtension() {
		mOverwriteOriginal = true;
	}

	public boolean getOverwriteOriginal() {
		return mOverwriteOriginal;
	}

	public void setOverwriteOriginal(boolean overwriteOriginal) {
		mOverwriteOriginal = overwriteOriginal;
	}

}