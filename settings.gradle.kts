enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "xleb-design-compose"

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

includeBuild("build-logic")
include(":design")
include(":sample")
