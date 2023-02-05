enableFeaturePreview("TYPESAFE_PROJECT_ACCESSORS")

rootProject.name = "xleb-android-infra"

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

val featureDir = "feature"
val commonDir = "common"
val coreDir = "core"

includeBuild("build-logic")

fun includeApiImplModule(name: String, rootDir: String, relativePath: String? = null) {
    includeModule("$name-api", rootDir, relativePath)
    includeModule("$name-impl", rootDir, relativePath)
}

fun includeModule(name: String, rootDir: String, relativePath: String? = null) {
    val moduleName = ":$rootDir:$name"
    val modulePath = listOfNotNull(rootDir, relativePath, name).joinToString("/")
    include(moduleName)
    project(moduleName).projectDir = File(modulePath)
}