package org.schoormann.android.gradle.astyle;

import org.gradle.api.Project;
import org.gradle.api.Plugin;

public class AStylePlugin implements Plugin<Project> {

	@Override
	public void apply(Project target) {
		target.getTasks().create("astyle", AStyleTask.class);
	}
}