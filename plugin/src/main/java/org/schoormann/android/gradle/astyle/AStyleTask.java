package org.schoormann.android.gradle.astyle;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.TaskAction;
import org.gradle.api.file.FileTree;
import org.gradle.api.GradleScriptException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

import java.lang.InterruptedException;

import java.util.Map;
import java.util.HashMap;

import org.gradle.api.Project;
import org.gradle.api.Task;

public class AStyleTask extends DefaultTask {

	private static final String NAME = "androidAStyle";
	private static final String DESCRIPTION = "Gradle plugin for astyle support in android application and library modules.";
	private static final String GROUP = "Quaility";

	private static final Logger LOG;
	private static final Map<String, Object> TASK_INFO;

	private AStylePluginExtension mExtensions;

	static {
		LOG = LoggerFactory.getLogger(AStyleTask.class.getCanonicalName());
		TASK_INFO = new HashMap<String, Object>();
		TASK_INFO.put(Task.TASK_TYPE, AStyleTask.class);
		TASK_INFO.put(Task.TASK_GROUP, GROUP);
		TASK_INFO.put(Task.TASK_DESCRIPTION, DESCRIPTION);
	}

	public static void applyToProject(Project project) {
		project.task(TASK_INFO, NAME);
		AStylePluginExtension extensions = new AStylePluginExtension();
		project.getExtensions().add(NAME, extensions);
	}

	@TaskAction
	public void astyle() {
		AStylePluginExtension extensions = getProject().getExtensions().findByType(AStylePluginExtension.class);
	}

	// private void runDoxygen() {
	// 	try {
	// 		Runtime runtime = Runtime.getRuntime();
	// 		Process process = runtime.exec("sdfsdf");
	// 		LOG.debug("return value {}", process.waitFor());
	// 	} catch (IOException e) {
	// 		throw new GradleScriptException("Could not execute doxygen.", new DoxygenNotFoundException());
	// 	} catch (InterruptedException e) {
	// 		LOG.error("Error in executing ls -la: {}", e);
	// 	}
	// }
}