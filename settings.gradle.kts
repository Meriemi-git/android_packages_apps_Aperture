/*
 * SPDX-FileCopyrightText: 2022-2024 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        maven("https://raw.githubusercontent.com/lineage-next/camerax-aperture/bdc457ba0021c05507c4bec14806c120e132a37f/.m2")
        maven("https://raw.githubusercontent.com/lineage-next/zxingcpp-aperture/6d27bbc39b7b53e7de52054d532a61c2b48fa897/.m2")
        google()
        mavenCentral()
    }
}
rootProject.name = "Aperture"
include(":app")
include(":lens_launcher")
