plugins {
    id("com.android.application")
    kotlin("android")
}

android {
    namespace = "com.example.gmailclone"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.gmailclone"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        // Chạy thử nghiệm UI
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            // Tắt rút gọn mã cho bản phát hành
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }

    buildFeatures {
        viewBinding = true // Sử dụng ViewBinding cho giao diện
    }
}

dependencies {
    // Thư viện AndroidX cơ bản
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("androidx.recyclerview:recyclerview:1.3.1")

    // Thư viện Material Design cho giao diện UI đẹp mắt (FAB, CardView)
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.cardview:cardview:1.0.0")

    // Kotlin Standard Library
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.10")

    // Các thư viện kiểm thử (Testing)
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
}
