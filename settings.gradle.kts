pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
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
}

rootProject.name = "BlahBlahGram"
include(":app")
include(":features:authorization")
include(":core:dependencies:navigation")
include(":core:dependencies:common")
include(":core:dependencies:ui")
include(":core:designSystem")
include(":core:dependencies:di")
include(":core:dependencies:mviKotlin")
