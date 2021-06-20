package com.example.workshop.jetsurvey.buildsrc

object Libs{
    const val androidGradlePlugin = "com.android.tools.build:gradle:7.1.0-alpha02"

    object Kolitn{
        private const val version = "1.4.32"
        const val gradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$version"
    }

    object AndroidX {
        const val coreKtx = "androidx.core:core-ktx:1.6.0-alpha03"
        const val appcompat = "androidx.appcompat:appcompat:1.3.0"

        object Activity {
            const val activityCompose = "androidx.activity:activity-compose:1.3.0-alpha08"
        }

        object Compose {
            const val version = "1.0.0-beta07"
            const val material = "androidx.compose.material:material:$version"
            const val tooling = "androidx.compose.ui:ui-tooling:$version"
        }

        object Material {
            private const val version = "1.3.0"
            const val material = "com.google.android.material:material:$version"
        }

        object Navigation {
            private const val version = "2.3.4"
            const val fragment = "androidx.navigation:navigation-fragment-ktx:$version"
            const val uiKtx = "androidx.navigation:navigation-ui-ktx:$version"
        }
    }
}