import com.android.build.gradle.BaseExtension
import com.limprove.finn.withVersionCatalog

configure<BaseExtension> {

    sourceSets {
        named("main").configure { java.srcDir("src/main/kotlin") }
        named("test").configure { java.srcDir("src/espressoTest/kotlin") }
        named("androidTest").configure { java.srcDir("src/espressoTest/kotlin") }
    }

    project.withVersionCatalog { libs ->
        buildToolsVersion(libs.versions.buildTools.get())
        compileSdkVersion(libs.versions.compileSdk.get().toInt())

        defaultConfig {
            minSdk = libs.versions.minSdk.get().toInt()
            targetSdk = libs.versions.targetSdk.get().toInt()
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}