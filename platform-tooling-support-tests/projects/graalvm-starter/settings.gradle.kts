pluginManagement {
	plugins {
		id("org.graalvm.buildtools.native") version "0.10.6"
	}
	repositories {
		mavenCentral()
		gradlePluginPortal()
	}
}

plugins {
	id("org.gradle.toolchains.foojay-resolver-convention") version "0.10.0"
}

rootProject.name = "graalvm-starter"
