/*
 *     Copyright (C) 2024-present StellarSand
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.android.kotlin)
}

kotlin {
    jvmToolchain(17)
}

android {
    namespace = "com.password.monitor"
    compileSdk = 34
    
    defaultConfig {
        applicationId = "com.password.monitor"
        minSdk = 23
        targetSdk = 34
        versionCode = 100
        versionName = "1.0.0"
        setProperty("archivesBaseName", "PasswordMonitor_v$versionName")
    }
    
    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
        /*getByName("debug") {
            isMinifyEnabled = true
            isShrinkResources = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }*/
    }
    
    buildFeatures {
        viewBinding = true
        buildConfig = true
    }
}

dependencies {
    implementation(libs.androidx.appcompat)
    implementation(libs.androidx.core.ktx)
    implementation(libs.material3)
    
    // Navigation components
    implementation(libs.bundles.navigation)
    
    // Retrofit2
    implementation(libs.bundles.retrofit2)
    
    // Lottie
    implementation(libs.lottie)
    
    // Fastscroll-kt
    implementation(libs.androidFastScrollKt)
}