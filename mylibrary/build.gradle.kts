@Suppress("DSL_SCOPE_VIOLATION") // TODO: Remove once KTIJ-19369 is fixed
plugins {
    id("org.easy.android.library")
    id("org.easy.koin")
//    alias(libs.plugins.androidLibrary)
//    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.easy.sample.mylibrary"
}

dependencies {

    implementation(libs.core.ktx)
    implementation(libs.appcompat)
    implementation(libs.material)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
}