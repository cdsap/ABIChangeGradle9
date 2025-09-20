pluginManagement {
    includeBuild("build-logic")
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
plugins {
    id("com.gradle.develocity") version "4.1"
    id("com.gradle.common-custom-user-data-gradle-plugin") version "2.2"

}

develocity {
    server = "https://ge.solutions-team.gradle.com/"
    allowUntrustedServer = true
    buildScan {
        uploadInBackground.set(false)
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "My Application"
include(":app")
