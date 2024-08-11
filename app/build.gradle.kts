import java.io.FileInputStream
import java.text.SimpleDateFormat
import java.time.Duration
import java.time.LocalDateTime
import java.util.Date
import java.util.Properties

val versionMajor = 0
val versionMinor = 2
val versionPatch = 1

val appVersionCode = 3;

@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
  alias(libs.plugins.androidApplication)
  alias(libs.plugins.kotlinAndroid)
  id("kotlin-parcelize")
}

android {
  namespace = "com.kimjio.shannonmodemtweaks"
  compileSdk = 34
  buildToolsVersion = "34.0.0"

  defaultConfig {
    applicationId = "com.kimjio.shannonmodemtweaks"
    testApplicationId = "com.kimjio.shannonmodemtweaks.test"
    minSdk = 31
    targetSdk = 34
    versionCode = appVersionCode
    versionName = "${versionMajor}.${versionMinor}.${versionPatch}"

    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }

  signingConfigs {
    create("release") {
      val properties = Properties()
      properties.load(FileInputStream(project.rootProject.file("local.properties")))

      storeFile = file(properties.getProperty("signing.storeFilePath"))
      storePassword = properties.getProperty("signing.storePassword")
      keyAlias = properties.getProperty("signing.keyAlias")
      keyPassword = properties.getProperty("signing.keyPassword")
    }
  }

  buildTypes {
    release {
      isMinifyEnabled = true
      isShrinkResources = true
      proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
      signingConfig = signingConfigs.getByName("release")
      isDebuggable = false
    }

    debug {
      signingConfig = signingConfigs.getByName("debug")
      isDebuggable = true
    }
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
  }

  kotlinOptions { jvmTarget = "17" }
  buildFeatures { compose = true }
  composeOptions { kotlinCompilerExtensionVersion = "1.5.1" }
  packaging { resources { excludes += "/META-INF/{AL2.0,LGPL2.1}" } }
}

tasks.withType(Test::class) {
  useJUnitPlatform()

  testLogging { events("passed", "skipped", "failed") }
}

dependencies {
  implementation(libs.core.ktx)
  implementation(libs.lifecycle.runtime.ktx)
  implementation(libs.activity.compose)
  implementation(platform(libs.compose.bom))
  implementation(libs.ui)
  implementation(libs.ui.graphics)
  implementation(libs.ui.tooling.preview)
  implementation(libs.material)
  implementation(libs.material3)
  implementation(libs.timber)
  implementation(libs.androidx.navigation.compose)
  implementation(libs.androidx.material.icons.extended)
  implementation(libs.androidx.material3.adaptive.navigation.suite)
  implementation(libs.androidx.material3.adaptive.navigation.suite.android)
  implementation(libs.androidx.material3.window.size.klass.android)
  testImplementation(libs.junit)
  testImplementation(libs.junit.jupiter)
  androidTestImplementation(libs.androidx.test.ext.junit)
  androidTestImplementation(libs.espresso.core)
  androidTestImplementation(platform(libs.compose.bom))
  androidTestImplementation(libs.ui.test.junit4)
  debugImplementation(libs.ui.tooling)
  debugImplementation(libs.ui.test.manifest)
}
