// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    kotlin("android").version(libs.versions.org.jetbrains.kotlin.android).apply(false)
}