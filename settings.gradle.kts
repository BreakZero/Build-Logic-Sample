pluginManagement {
    includeBuild("build-logic")
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
    versionCatalogs {
        create("easy") {
            from(files("./build-logic/building.versions.toml"))
        }
    }
}

rootProject.name = "BuildLogicExample"
include(":app")
include(":mylibrary")
