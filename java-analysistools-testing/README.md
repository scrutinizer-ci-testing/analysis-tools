[![Build Status](https://travis-ci.org/metamx/java-util.svg?branch=master)](https://travis-ci.org/metamx/java-util)

Test project for java static analysis tools:
===========================================
- checkstyle
- findbugs
- PMD

run as a ant project:
```command
$ ant run
$ ant checkstyle:checkstyle
$ ant findbugs:findbugs
$ ant pmd:pmd
```
run as a maven project:
```command
$ mvn findbugs:findbugs
$ mvn checkstyle:checkstyle 
$ mvn pmd:pmd
```
analysis results:
- findbugs-maven: `target/findbugsXml.xml`
- findbugs-ant: `report/findbugs/findbugsXml.xml`

- checkstyle-maven: `target/checkstyle-result.xml`
- checkstyle-ant: `report/checkstyle/checkstyle-result.xml`

- pmd-maven: `target/pmd/pmd.xml`
- pmd-ant: `report/pmd/pmd-result.xml`
