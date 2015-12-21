package org.schoormann.android.gradle.astyle;

import org.gradle.api.Project;
import org.gradle.api.Plugin;

import org.schoormann.android.gradle.astyle.AStylePluginExtension;

public class AStylePlugin implements Plugin<Project> {

	@Override
	public void apply(Project target) {
		AStyleTask.applyToProject(target);
	}
}