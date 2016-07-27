[![Build Status](https://travis-ci.org/metamx/java-util.svg?branch=master)](https://travis-ci.org/metamx/java-util)

Test project for java static analysis tools:
===========================================
- checkstyle
- findbugs

run as a ant project:
```command
$ ant run
```
run as a maven project:
```command
$ maven findbugs:findbugs
$ mvn checkstyle:checkstyle 
```
analysis results:
- findbugs-maven: `target/findbugsXml.xml`
- findbugs-ant: `report/findbugs/findbugsXml.xml`

- checkstyle-maven: `target/checkstyle-result.xml`
- checkstyle-ant: `report/checkstyle/checkstyle-result.xml`

