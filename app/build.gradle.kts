plugins {
    id("easy.android.application")
    id("easy.android.application.compose")
    id("easy.android.application.jacoco")
    id("jacoco")
}

android {
    namespace = "com.easy.sample.build"
}

dependencies {

    implementation("androidx.core:core-ktx:1.10.1")
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.bundles.compose.android.bundle)

    debugImplementation(libs.androidx.compose.ui.tooling)
    testImplementation(libs.junit)
    testImplementation(libs.bundles.junit.test.bundle)
    androidTestImplementation(platform(libs.androidx.compose.bom))
}