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
    modImplementation inlclude("com.github.tom_the_geek:wdmnf:<version>")
}
```
