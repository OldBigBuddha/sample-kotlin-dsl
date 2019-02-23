object Dependencies {

    object Kotlin {
        const val stdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:1.3.21"
    }

    object AndroidX {
        const val appCompat = "androidx.appcompat:appcompat:1.1.0-alpha02"
        const val ktx = "androidx.core:core-ktx:1.1.0-alpha04"
        const val constraintLayout = "androidx.constraintlayout:constraintlayout:1.1.3"

        object Test {
            const val runner = "androidx.test:runner:1.1.2-alpha01"
            const val espresso = "androidx.test.espresso:espresso-core:3.1.2-alpha01"
        }
    }

    object Test {
        const val jUnit = "junit:junit:4.12"
    }
}