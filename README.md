# Qualified injection from module test

This is a test project with a multi module Maven project that has a module for the API which contains only interfaces.
The interfaces are implemented in the _impl_ module which implement the _Service_ interface of the _api_ module.
The _controller_ module is the JAX-RS application which injects the Service interface and uses the qualifiers for _ServiceA_ and _ServiceB_.

The idea is, to have different implementations of similar services which can be replaced when required. 

## Run with docker-maven-plugin

To create Docker images, you can use the `docker-maven-plugin`. In order to build, run:

```
$ mvn clean install -P impl1,build
$ mvn clean install -P impl2,build
```

Afterwards run the images via:
```
$ docker run -p 8080:8080 impl1
$ docker run -p 8080:8080 impl2
```
