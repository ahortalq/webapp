package com.xebialabs.congruencias.webapp;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Info {

	String job_name, build_number, svn_revision, pom_version;

	public String getJob_name() {
		return job_name;
	}

	public String getBuild_number() {
		return build_number;
	}

	public String getSvn_revision() {
		return svn_revision;
	}

	public String getPom_version() {
		return pom_version;
	}

	public Info() {
		Properties properties = new Properties();
		try {
			InputStream stream = Info.class
					.getResourceAsStream("/app.properties");
			if (stream != null) {
				try {
					properties.load(stream);
				} finally {
					stream.close();
				}
			}
		} catch (IOException e) {
		}
		job_name = properties.getProperty("jenkins.job_name");
		build_number = properties.getProperty("jenkins.build_number");
		svn_revision = properties.getProperty("jenkins.svn_revision");
		pom_version = properties.getProperty("jenkins.pom_version");
		if (pom_version.indexOf("-SNAPSHOT") > 0) pom_version = pom_version.substring(0, pom_version.indexOf("-SNAPSHOT"));
	}

}