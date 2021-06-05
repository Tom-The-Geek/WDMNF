# WDMNF (Why Did My Netty Fail)
A small (one mixin) JiJable mod that displays the full stacktrace for errors in the netty pipeline.

### Depending on this
```groovy
repositories {
    maven {
        name = "TomTheGeek-repo"
        url = "https://maven.tomthegeek.ml/releases/"
    }
}

dependencies {
    modImplementation include("com.github.tom_the_geek:wdmnf:<version>")
}
```

### Latest release
The current version is `1.0.0` ([or `1.0.0+mc.1.17` for 1.17](https://github.com/Tom-The-Geek/WDMNF/tree/1.17)).
