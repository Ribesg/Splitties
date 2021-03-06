# Splitties

Splitties is a collection of small independent Android libraries that aims
to make developing apps and libraries for Android (including Wear, TV,
Things, Auto and ChromeOS targeted) easier and more `fun`.

Some modules are similar to what [Anko](https://github.com/Kotlin/anko) provides. See [a short comparison of Splitties with Anko here](Comparison_with_anko.md).

This project is named "Splitties" because it is split in small modules,
distributed as independent Android libraries, so you can add only the ones
you need to your project/module, helping reduce the size of the final apk.

Each module has been designed to have a small footprint and be as efficient
as possible.

## All the [splits](#what-is-a-split "What is a split in Splitties?")

- **[Activities:](modules/activities)** Start activities with minimal boilerplate.
- **[Alert Dialog:](modules/alertdialog)** Create simple alert dialogs with simple code.
- **[Alert Dialog AppCompat:](modules/alertdialog-appcompat)** AppCompat version of
[Alert Dialog](modules/alertdialog).
- **[App Context:](modules/appctx)** Always have your application `Context` at hand with `appCtx`.
- **[Arch Lifecycle:](modules/arch-lifecycle)** Extensions to get `ViewModel`s, use `LiveData` and observe
`Lifecycle`s.
- **[Arch Room:](modules/arch-room)** Room helpers to instantiate your DB and perform transactions in
Kotlin.
- **[Bit Flags:](modules/bitflags)** `hasFlag`, `withFlag` and `minusFlag` extensions on `Long`, `Int`,
`Short`, `Byte`, and their unsigned counterparts.
- **[Bundle:](modules/bundle)** `BundleSpec` to use `Bundle` with property syntax for `Intent` extras
and more.
- **[Collections:](modules/collections)** `forEach` for `List`s without `Iterator` allocation.
- **[Checked Lazy:](modules/checkedlazy)** `mainThreadLazy` that checks property access on main thread, and
`checkedLazy` to make your own variant.
- **[Dimensions:](modules/dimensions)** Android `dp` extensions for `View` and `Context`. Particularly
handy when using [Views DSL](modules/views-dsl).
- **[Exceptions:](modules/exceptions)** `illegal(…)` and similar functions that return `Nothing`, handy for
impossible or illegal `when` branches.
- **[Fragments:](modules/fragments)** Start activities from fragments and do transactions with minimal
boilerplate.
- **[Fragment Args:](modules/fragmentargs)** Fragment arguments without ceremony thanks to delegated
properties.
- **[Init Provider:](modules/initprovider)** Base class for `ContentProvider`s used for automatic
initialization purposes.
- **[Intents:](modules/intents)** Transform `companion object`s into powerful typesafe intent specs, and
create `PendingIntent`s the clean and easy way.
- **[Lifecycle Coroutines:](modules/lifecycle-coroutines)** Coroutines integration with [`Lifecycle`](
https://developer.android.com/reference/kotlin/androidx/lifecycle/Lifecycle)s.
- **[Main Handler:](modules/mainhandler)** Top-level `mainHandler` property to stop allocating multiple
`Handler`s for main `Looper`.
- **[Main Thread:](modules/mainthread)** Properties and precondition checkers related to Android main thread.
- **[Material Colors:](modules/material-colors)** [2014 Material Design color palettes](
https://material.io/design/color/#tools-for-picking-colors) as color resources.
- **[Material Lists:](modules/material-lists)** List item Views implementing [Material Design guidelines](
https://material.io/guidelines) (perfect for usage in a `RecyclerView`).
- **[Preferences:](modules/preferences)** Property syntax for Android's SharedPreferences.
- **[Resources:](modules/resources)** Extensions to get resources like strings, colors or drawables easily,
with support for themed attributes.
- **[Selectable Views:](modules/views-selectable)** Selectable Views with `foreground` property before
API 23.
- **[Selectable Views AppCompat:](modules/views-selectable-appcompat)** [Selectable Views](modules/views-selectable)
for AppCompatTextView.
- **[Selectable Views ConstraintLayout:](modules/views-selectable-constraintlayout)**
[Selectable Views](modules/views-selectable) for ConstraintLayout.
- **[Snackbar:](modules/snackbar)** Grab a snack without ceremony with `snack(…)` and `longSnack(…)`.
- **[Stetho init:](modules/stetho-init)** Have [Stetho](https://github.com/facebook/stetho) for your debug
builds, without writing any code!
- **[System Services:](modules/systemservices)** No more
`context.getSystemService(NAME_OF_SERVICE) as NameOfManager`.
- **[Toast:](modules/toast)** Show a toast by just calling `toast(yourText)`, and dodge [API 25
`BadTokenException`](https://github.com/drakeet/ToastCompat#why).
- **[Typesafe RecyclerView:](modules/typesaferecyclerview)** Typesafe `ViewHolder` and `ItemViewHolder` for
easy basic usage of `RecyclerView`.
- **[Views:](modules/views)** Extensions function and properties on `View`s.
- **[Views AppCompat:](modules/views-appcompat)** AppCompat extension of [Views](modules/views). Includes helpers
for `ImageView` tinting, `ActionBar` and tooltip.
- **[Views CardView:](modules/views-cardview)** CardView extension of [Views](modules/views). Provides a
`contentPadding` property.
- **[Views Coroutines:](modules/views-coroutines)** Android Views + Kotlin coroutines.
- **[Views DSL:](modules/views-dsl)** Create UIs with readable Kotlin code.
- **[Views DSL AppCompat:](modules/views-dsl-appcompat)** AppCompat extension of [Views DSL](modules/views-dsl).
- **[Views DSL ConstraintLayout:](modules/views-dsl-constraintlayout)** ConstraintLayout extension of
[Views DSL](modules/views-dsl).
- **[Views DSL CoordinatorLayout:](modules/views-dsl-coordinatorlayout)** CoordinatorLayout extension of
[Views DSL](modules/views-dsl).
- **[Views DSL IDE preview:](modules/views-dsl-ide-preview)** Preview [Views DSL](modules/views-dsl) UIs in the IDE.
- **[Views DSL Material:](modules/views-dsl-material)** Material Components extension of [Views DSL](modules/views-dsl).
- **[Views DSL RecyclerView:](modules/views-dsl-recyclerview)** RecyclerView extension of [Views DSL](modules/views-dsl).
- **[Views Material:](modules/views-material)** Material Components extension of [Views](modules/views).
- **[Views RecyclerView:](modules/views-recyclerview)** RecyclerView extension of [Views](modules/views).

## Download

### Gradle instructions
Make sure you have `jcenter()` in the repositories defined in your project's
(root) `build.gradle` file (default for new Android Studio projects).

Add the version of the library to not repeat yourself if you use multiple
artifacts, and make sure their versions are in sync by adding an ext property
into your root project `build.gradle` file:
```groovy
allProjects {
    ext {
        splitties_version = "3.0.0-alpha04"
    }
}
```

<details>
<summary>
<b>Here are all the artifacts of this library. Just use the ones you need. (Click to expand)</b>
</summary>

```kts
implementation("com.louiscad.splitties:splitties-activities:$splitties_version")
implementation("com.louiscad.splitties:splitties-alertdialog:$splitties_version")
implementation("com.louiscad.splitties:splitties-alertdialog-appcompat:$splitties_version")
implementation("com.louiscad.splitties:splitties-appctx:$splitties_version")
implementation("com.louiscad.splitties:splitties-arch-lifecycle:$splitties_version")
implementation("com.louiscad.splitties:splitties-arch-room:$splitties_version")
implementation("com.louiscad.splitties:splitties-bitflags:$splitties_version")
implementation("com.louiscad.splitties:splitties-bundle:$splitties_version")
implementation("com.louiscad.splitties:splitties-checkedlazy:$splitties_version")
implementation("com.louiscad.splitties:splitties-collections:$splitties_version")
implementation("com.louiscad.splitties:splitties-dimensions:$splitties_version")
implementation("com.louiscad.splitties:splitties-exceptions:$splitties_version")
implementation("com.louiscad.splitties:splitties-fragments:$splitties_version")
implementation("com.louiscad.splitties:splitties-fragmentargs:$splitties_version")
implementation("com.louiscad.splitties:splitties-initprovider:$splitties_version")
implementation("com.louiscad.splitties:splitties-intents:$splitties_version")
implementation("com.louiscad.splitties:splitties-lifecycle-coroutines:$splitties_version")
implementation("com.louiscad.splitties:splitties-mainhandler:$splitties_version")
implementation("com.louiscad.splitties:splitties-mainthread:$splitties_version")
implementation("com.louiscad.splitties:splitties-material-colors:$splitties_version")
implementation("com.louiscad.splitties:splitties-material-lists:$splitties_version")
implementation("com.louiscad.splitties:splitties-preferences:$splitties_version")
implementation("com.louiscad.splitties:splitties-resources:$splitties_version")
implementation("com.louiscad.splitties:splitties-snackbar:$splitties_version")
debugImplementation("com.louiscad.splitties:splitties-stetho-init:$splitties_version")
implementation("com.louiscad.splitties:splitties-systemservices:$splitties_version")
implementation("com.louiscad.splitties:splitties-toast:$splitties_version")
implementation("com.louiscad.splitties:splitties-typesaferecyclerview:$splitties_version")
implementation("com.louiscad.splitties:splitties-views:$splitties_version")
implementation("com.louiscad.splitties:splitties-views-appcompat:$splitties_version")
implementation("com.louiscad.splitties:splitties-views-cardview:$splitties_version")
implementation("com.louiscad.splitties:splitties-views-coroutines:$splitties_version")
implementation("com.louiscad.splitties:splitties-views-dsl:$splitties_version")
implementation("com.louiscad.splitties:splitties-views-dsl-appcompat:$splitties_version")
implementation("com.louiscad.splitties:splitties-views-dsl-constraintlayout:$splitties_version")
implementation("com.louiscad.splitties:splitties-views-dsl-coordinatorlayout:$splitties_version")
debugImplementation("com.louiscad.splitties:splitties-views-dsl-ide-preview:$splitties_version")
implementation("com.louiscad.splitties:splitties-views-dsl-material:$splitties_version")
implementation("com.louiscad.splitties:splitties-views-dsl-recyclerview:$splitties_version")
implementation("com.louiscad.splitties:splitties-views-material:$splitties_version")
implementation("com.louiscad.splitties:splitties-views-recyclerview:$splitties_version")
implementation("com.louiscad.splitties:splitties-views-selectable:$splitties_version")
implementation("com.louiscad.splitties:splitties-views-selectable-appcompat:$splitties_version")
implementation("com.louiscad.splitties:splitties-views-selectable-constraintlayout:$splitties_version")
```

</details>

#### Snapshots
Let's say you need a new feature or a fix that did
not make it to a release yet:

You can grab it in the latest snapshot by adding the
snapshots repository and changing the library version to the `-SNAPSHOT`
version in your root project `build.gradle` file:

```groovy
allProjects {
    repositories {
        google()
        jcenter() // Add snapshots repo below
        maven { url 'https://oss.jfrog.org/artifactory/oss-snapshot-local' }
    }
    ext {
        splitties_version = '3.0.0-SNAPSHOT' // Change this line
    }
}
```

If you need to, you can browse the deployed snapshots on artifactory with [the native browser](
https://oss.jfrog.org/list/oss-snapshot-local/com/louiscad/splitties/) or [the web app](
https://oss.jfrog.org/webapp/#/artifacts/browse/tree/General/oss-snapshot-local/com/louiscad/splitties
) so you can pick a specific snapshot.

### Other build systems
For maven and alternative build-systems, check the [Bintray page](
https://bintray.com/louiscad/maven/splitties).

## New versions notifications
To get notified for new versions, be sure to click on "Watch" on the
[splitties Bintray page](https://bintray.com/louiscad/maven/splitties).

## Improve this library
If you want this library to have **a new feature or an improvement** in a
new or in an existing module, please, open an issue or vote/comment a
similar one first, so it can be discussed.

**Documentation contributions** are also welcome.
For typos or other small improvements, feel free to submit a PR
(pull request) directly.
For more significant doc contributions, please, open an issue first so it
can be discussed.

**If you find a bug**, please open an issue with all the important details.
If you know a simple fix that is not API breaking and that does not have
side-effects that need to be considered, you may also directly submit a PR.

## What is a split
A "split" is a module of the Splitties library that you can add as a
dependency. It only includes the required transitive dependencies.
This allows you to only add what you need in your app or library module,
so the final apk is as small as possible and doesn't include stuff not used
by your app.

Let's say you're build an Android Wear app using the Views DSL.
Android Wear apps don't need AppCompat. Including it would be a waste of
bandwidth and storage. The Views DSL core module relies on the Android
SDK but not on AppCompat, so you don't bloat your wrist app with AppCompat
by using Views DSL. However, if you are building a phone, tablet or computer
Android app, there's a Views DSL AppCompat split with a few extensions for
you to use.

## Credits

Special thanks to [Jovche Mitrejchevski](https://twitter.com/jovchem) for
helping in taking decisions for this project.

Thanks to JetBrains and the contributors for [Anko](https://github.com/Kotlin/anko),
which was a great source of inspiration, especially for Views DSL, and of course
thanks for the excellent [Kotlin](https://kotl.in) programming language that makes this project possible.

Thanks to [Doug Stevenson](https://twitter.com/CodingDoug) for his articles
["Kotlin & Android: A Brass Tacks Experiment"](
https://medium.com/@CodingDoug/kotlin-android-a-brass-tacks-experiment-part-3-84e65d567a37
). It is fair to say that Views DSL has its root in this experiment.

## License
This library is published under Apache License version 2.0 which you can see
[here](https://github.com/LouisCAD/Splitties/blob/master/LICENSE).
