# Contributing

## Project Setup

If you want to run lint on every commit, run the command below.

```
$ git config core.hookspath .githooks
```

You must reformat your code as `spotless` before pushing.

```
./gradlew spotlessCheck : lint
./gradlew spotlessApply : reformat
```

## Configure Code Style

Code-Style based on [google-java-format](https://github.com/google/google-java-format).

### IntelliJ

```
// Import Code Style
Preferences > Editor > Code Style > Java > Scheme > Import Scheme > IntelliJ IDEA code style XML > settings/intellij-java-google-style.xml

// Plugin google-java-format
1. Preferences > Plugins > google-java-format > Install > Restart
2. Preferences > google-java-format Settings > Enable google-java-format > Code style > AOSP Style
```

### Eclipse or Else

Check the [Google Style Guide](https://github.com/google/styleguide)
