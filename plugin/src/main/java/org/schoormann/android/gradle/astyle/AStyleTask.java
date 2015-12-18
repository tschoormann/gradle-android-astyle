package org.schoormann.android.gradle.astyle;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;
import org.gradle.api.file.FileTree;

public class AStyleTask extends DefaultTask {

	@TaskAction
	public void astyle() {
		System.out.println("Hello from astyle Task!");
		FileTree fileTree = getProject().fileTree("src");
	}
}