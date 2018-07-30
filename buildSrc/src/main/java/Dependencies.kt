object Version {
  // project
  const val minSdk = 21
  const val targetSdk = 27
  const val buildToolsVersion = "27.0.3"
  const val compileSdkVersion = 27
  const val androidGradle = "3.2.0-beta04"

  // android
  const val androidX = "27.1.1"
  const val androidKtx = "0.3"   //https://github.com/android/android-ktx
  const val androidLifecycle = "1.1.0"
  const val multidex = "1.0.3"
  const val constraintLayout = "1.1.2"
  const val navController = "1.0.0-alpha01"

  // kotlin
  const val kotlin = "1.2.51" // https://kotlinlang.org/
  const val kotlinxCoroutines = "0.22.5" // https://github.com/Kotlin/kotlinx.coroutines/releases
  const val androidArchLifecycle = "1.1.1" // https://github.com/Kotlin/kotlinx.coroutines/releases

  //rxExtensions
  const val rxJava = "2.1.16"           //https://github.com/ReactiveX/RxJava
  const val rxKotlin = "2.2.0"          //https://github.com/ReactiveX/RxKotlin
  const val rxAndroid = "2.0.2"         //https://github.com/ReactiveX/RxAndroid
  const val rxBinding = "2.1.1"         //https://github.com/JakeWharton/RxBinding
  const val rxNetwork = "1.0.0"         //https://github.com/pwittchen/ReactiveNetwork
  const val rxPermissions = "0.10.2"    //https://github.com/tbruyelle/RxPermissions

  // dependency injection
  const val dagger = "2.16" //https://github.com/google/dagger
  const val koin = "0.9.3"  //https://github.com/InsertKoinIO/koin

  // general
  const val mosby = "3.1.0" //https://github.com/google/dagger

  // network
  const val okHttp = "3.10.0" //https://github.com/square/okhttp

  // serialization
  const val gson = "2.8.4"        //https://github.com/google/gson
  const val loganSquare = "1.3.7" //https://github.com/bluelinelabs/LoganSquare

  // retrofit
  const val retrofit = "2.4.0"                     //https://github.com/square/retrofit
  const val retrofitConverterGson = "2.4.0"        //https://github.com/square/retrofit/tree/master/retrofit-converters/gson
  const val retrofitConverterLoganSquare = "1.4.1" //https://github.com/mannodermaus/retrofit-logansquare

  // apollo
  const val apollo = "0.5.0"      // https://github.com/apollographql/apollo-android

  //persistence
  const val room = "2.0.0-alpha1" //https://developer.android.com/topic/libraries/architecture/room

  //imageLoading
  const val glide = "4.7.1"     //https://github.com/bumptech/glide
  const val picasso = "2.71828" //https://github.com/square/picasso

  //profiling
  const val debugDb = "1.0.4"    //https://github.com/amitshekhariitbhu/Android-Debug-Database
  const val leakCanary = "1.5.4" //https://github.com/square/leakcanary

  //social auth
  const val facebookAnalytics = "[4,5)"
  const val crashlytics = "2.9.4@aar"
  const val fabricPlugin = "1.+"
  const val simpleAuth = "2.1.3"  //https://github.com/jaychang0917/SimpleAuth

  // tests
  const val jUnit = "4.12"
  const val androidTestRunner = "0.5"
  const val espresso = "3.0.1"

  // firebase
  const val firebaseCore = "16.0.1"
  const val firebaseMessaging = "17.1.0"

  //Google
  const val googleServices = "4.0.1"
  const val googleAuth = "15.0.1"

  const val googleMaps = "15.0.1"
  const val googleLocation = "15.0.1"
}

object Deps {

  // Android
  const val androidCore = "com.android.support:support-compat:${Version.androidX}"
  const val androidKtx = "androidx.core:core-ktx:${Version.androidKtx}"
  const val androidLifecycle = "android.arch.lifecycle:runtime:${Version.androidLifecycle}"
  const val appCompat = "com.android.support:appcompat-v7:${Version.androidX}"
  const val material = "com.android.support:design:${Version.androidX}"
  const val palette = "com.android.support:palette-v7:${Version.androidX}"
  const val constraintLayout = "com.android.support.constraint:constraint-layout:${Version.constraintLayout}"
  const val cardview = "com.android.support:cardview-v7:${Version.androidX}"
  const val multidex = "com.android.support:multidex:${Version.multidex}"
  const val navController = "android.arch.navigation:navigation-fragment:${Version.navController}"
  const val navControllerUi = "android.arch.navigation:navigation-ui:${Version.navController}"

  // Kotlin
  const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Version.kotlin}"

  // RxExtension
  const val rxJava = "io.reactivex.rxjava2:rxjava:${Version.rxJava}"
  const val rxKotlin = "io.reactivex.rxjava2:rxkotlin:${Version.rxKotlin}"
  const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Version.rxAndroid}"

  const val rxBinding = "com.jakewharton.rxbinding2:rxbinding:${Version.rxBinding}"
  const val rxBindingDesign = "com.jakewharton.rxbinding2:rxbinding-design:${Version.rxBinding}"
  const val rxBindingAppCompatV4 = "com.jakewharton.rxbinding2:rxbinding-support-v4:${Version.rxBinding}"
  const val rxBindingAppCompatV7 = "com.jakewharton.rxbinding2:rxbinding-appcompat-v7:${Version.rxBinding}"
  const val rxBindingRecyclerViewV7 = "com.jakewharton.rxbinding2:rxbinding-recyclerview-v7:${Version.rxBinding}"

  const val rxNetwork = "com.github.pwittchen:reactivenetwork-rx2:${Version.rxNetwork}"
  const val rxPermissions = "com.github.tbruyelle:rxpermissions:${Version.rxPermissions}"
  const val rxBindingKotlin = "com.jakewharton.rxbinding2:rxbinding-kotlin:${Version.rxBinding}"
  const val rxBindingDesignKotlin = "com.jakewharton.rxbinding2:rxbinding-design-kotlin:${Version.rxBinding}"
  const val rxBindingAppCompatV4Kotlin = "com.jakewharton.rxbinding2:rxbinding-support-v4-kotlin:${Version.rxBinding}"
  const val rxBindingAppCompatV7Kotlin = "com.jakewharton.rxbinding2:rxbinding-appcompat-v7:${Version.rxBinding}"
  const val rxBindingRecyclerViewV7Kotlin = "com.jakewharton.rxbinding2:rxbinding-recyclerview-v7-kotlin:${Version.rxBinding}"

  // Dependency Injection
  const val inject = "javax.inject:javax.inject:1"
  const val dagger = "com.google.dagger:dagger:${Version.dagger}"
  const val daggerCompiler = "com.google.dagger:dagger-compiler:${Version.dagger}"
  const val koinCore = "org.koin:koin-core:${Version.koin}"
  const val koinAndroid = "org.koin:koin-android:${Version.koin}"
  const val koinAndroidArchComponents = "org.koin:koin-android-architecture:${Version.koin}"
  const val koinTests = "org.koin:koin-test:${Version.koin}"

  // General
  const val mosby = "com.hannesdorfmann.mosby3:mvi:${Version.mosby}"

  // Network
  const val okHttp = "com.squareup.okhttp3:okhttp:${Version.okHttp}"
  const val okHttpInteceptor = "com.squareup.okhttp3:logging-interceptor:${Version.okHttp}"

  // Retrofit
  const val retrofit = "com.squareup.retrofit2:retrofit:${Version.retrofit}"
  const val retrofitRxJavaAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Version.retrofit}"
  const val retrofitConverterGson = "com.squareup.retrofit2:converter-gson:${Version.retrofitConverterGson}"
  const val retrofitConverterLoganSquare = "com.github.aurae.retrofit2:converter-logansquare:${Version.retrofitConverterLoganSquare}"

  // Apollo
  const val apollo = "com.apollographql.apollo:apollo-runtime:${Version.apollo}"
  const val apolloAndroidSupport = "com.apollographql.apollo:apollo-android-support:${Version.apollo}"
  const val apolloRxJavaSupport = "com.apollographql.apollo:apollo-rx2-support:${Version.apollo}"

  // Serialization
  const val gson = "com.google.code.gson:gson:${Version.gson}"
  const val loganSquare = "com.bluelinelabs:logansquare:${Version.loganSquare}"
  const val loganSquareCompiler = "com.bluelinelabs:logansquare-compiler:${Version.loganSquare}"

  // Persistence
  const val room = "androidx.room:room-runtime:${Version.room}"
  const val roomCompiler = "androidx.room:room-compiler:${Version.room}"
  const val rxRoom = "android.arch.persistence.room:rxjava2:${Version.room}"

  // ImageLoading
  const val glide = "com.github.bumptech.glide:glide:${Version.glide}"
  const val glideCompiler = "com.github.bumptech.glide:compiler:${Version.glide}"
  const val glideOkHttp3 = "com.github.bumptech.glide:okhttp3-integration:${Version.glide}"
  const val picasso = "com.squareup.picasso:picasso:${Version.picasso}"

  // Profiling
  const val debugDb = "com.amitshekhar.android:debug-db:${Version.debugDb}"
  const val leakCanaryDebug = "com.squareup.leakcanary:leakcanary-android:${Version.leakCanary}"
  const val leakCanaryRelease = "com.squareup.leakcanary:leakcanary-android-no-op:${Version.leakCanary}"

  // Social auth
  const val googleAuth = "com.google.android.gms:play-services-auth:${Version.googleAuth}"
  const val socialAuth = "com.jaychang:simpleauth:${Version.simpleAuth}"
  const val socialAuthFacebook = "com.jaychang:simpleauth-facebook:${Version.simpleAuth}"
  const val socialAuthGoogle = "com.jaychang:simpleauth-google:${Version.simpleAuth}"
  const val socialAuthInstagram = "com.jaychang:simpleauth-instagram:${Version.simpleAuth}"
  const val socialAuthTwitter = "com.jaychang:simpleauth-twitter:${Version.simpleAuth}"

  // Facebook
  const val facebookAnalytics = "com.facebook.android:facebook-android-sdk:${Version.facebookAnalytics}"

  // Fabric
  const val fabricPlugin = "io.fabric.tools:gradle:${Version.fabricPlugin}"
  const val crashlytics = "com.crashlytics.sdk.android:crashlytics:${Version.crashlytics}"

  // Firebase
  const val firebaseCore = "com.google.firebase:firebase-core:${Version.firebaseCore}"
  const val firebaseMessaging = "com.google.firebase:firebase-messaging:${Version.firebaseMessaging}"

  // Tests
  const val jUnit = "junit:junit:${Version.jUnit}"
  const val androidTestRunner = "com.android.support.test:runner:${Version.androidTestRunner}"
  const val espresso = "com.android.support.test.espresso:espresso-core:${Version.espresso}"
  const val googleMaps = "com.google.android.gms:play-services-maps:${Version.googleMaps}"
  const val googleLocation = "com.google.android.gms:play-services-location:${Version.googleLocation}"

  // Coroutines
  const val kotlinxCoroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Version.kotlinxCoroutines}"
  const val kotlinxCoroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Version.kotlinxCoroutines}"

  // Lifecycle
  val androidArchLifecycleExtensions = "android.arch.lifecycle:extensions:${Version.androidArchLifecycle}"
  val androidArchLifecycleViewModel = "android.arch.lifecycle:viewmodel:${Version.androidArchLifecycle}"
  val androidArchLifecycleLiveData = "android.arch.lifecycle:livedata:${Version.androidArchLifecycle}"
  val androidArchLifecycleCompiler = "android.arch.lifecycle:compiler:${Version.androidArchLifecycle}"
}
