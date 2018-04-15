# app-jcef-example

Example application for using Java Chrome Embedded Framework

### (Tested) JCEF Information (180415 latest)
JCEF Version = 3.3325.176
CEF Version = 3.3325.1755
Chromium Version = 65.0.3325.181

I modified source code of @viglucci Offscreen for off-screen rendering(OSR)

If you test OSR, please give '--off-screen-rendering-enabled' with Program arguments.

## Prerequisites

### JCEF

A build of JCEF to be available via your PATH environment variable. \n

https://bitbucket.org/chromiumembedded/java-cef/wiki/BranchesAndBuilding

Add the `some_directory/jcef_build/native/Release` directory to your PATH environment variable.

### Java JDK

Java 1.8

## Maven Build

1. mvn clean package

## IntelliJ IDEA Build

Setup:

1. File -> Project Structure -> Artifacts 
2. Green + -> Jar -> from module with dependencies
3. Select SimpleFrameExample

Build:

1. Build -> Build Artifacts

## Run from run.bat

1. From IntelliJ project explorer -> right click run.bat -> Run 'run'



