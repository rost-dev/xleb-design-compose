plugins {
    `kotlin-dsl`
}

dependencies {
    implementation(projects.kotlin)
    implementation(projects.gradleExt)
    implementation(libs.android.gradlePlugin)
    implementation(libs.kotlin.gradlePlugin)
    // workaround for https://github.com/gradle/gradle/issues/15383
    implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}