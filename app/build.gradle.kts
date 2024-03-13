plugins {
    id("org.easy.android.application.compose")
    id("org.easy.jacoco")
}

android {
    namespace = "com.easy.sample.build"
}

dependencies {

    implementation("androidx.core:core-ktx:1.10.1")
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.bundles.compose.android.bundle)

    implementation(project(":mylibrary"))

    debugImplementation(libs.androidx.compose.ui.tooling)
    testImplementation(libs.junit)
    androidTestImplementation(platform(libs.androidx.compose.bom))
}